package com.github.qianniancc;

import java.util.Random;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class moreAppleKey {

public static Object instance;

public moreAppleKey(){}

public void load(){
	FMLCommonHandler.instance().bus().register(new Qianniancc());
}

public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public void registerRenderers(){}
public int addFuel(ItemStack fuel){
	return 0;
}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}

public class Qianniancc
{

	private static final String desc = "key.tut_inventory.desc";
	private static final int keyValues = Keyboard.KEY_V ;
	private final KeyBinding keys;
	public Qianniancc() {
		keys = new KeyBinding(desc, keyValues, "key.tutorial.category");
		ClientRegistry.registerKeyBinding(keys);
	}

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class)) {
			if (keys.isPressed()) {
				EntityPlayer entity = Minecraft.getMinecraft().thePlayer;

            	if(entity.capabilities.isCreativeMode){
if(true){

if(true){
if(entity instanceof EntityPlayer){MinecraftServer minecraftserver = MinecraftServer.getServer();if(minecraftserver!=null)minecraftserver.getCommandManager().executeCommand((EntityPlayer)entity, "appleversion");}
}

}
}

			}
		}
	}
}

}
