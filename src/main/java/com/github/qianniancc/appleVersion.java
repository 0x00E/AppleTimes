package com.github.qianniancc;

import java.util.Random;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class appleVersion{

public static Object instance;

public appleVersion(){}

public void load(){}

public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){
	return 0;
}
public void registerRenderers(){}
public void serverLoad(FMLServerStartingEvent event){

	event.registerServerCommand(new Qianniancc());

}
public void preInit(FMLPreInitializationEvent event){}

class Qianniancc implements ICommand{
public boolean isUsernameIndex(int var1){
	return false;
}
public boolean canCommandSenderUseCommand(ICommandSender var1){
	return true;
}
public java.util.List<String> getCommandAliases(){
	return null;
}
public java.util.List<String> addTabCompletionOptions(ICommandSender var1, String[] var2){
	return null;
}

public boolean isUsernameIndex(String[] string, int index){
	return true;
}
public String getCommandName(){
	return "appleversion";
}
public String getCommandUsage(ICommandSender var1){
	return "/appleversion By qianniancc";
}
public int compareTo(Object c){
	return -1;
}
public void processCommand(ICommandSender var1, String[] cmd){
	EntityPlayer entity = (EntityPlayer)var1;


	World world = null;
	WorldServer[] list = MinecraftServer.getServer().worldServers;
	for(WorldServer ins : list){
		if(ins.provider.dimensionId==entity.worldObj.provider.dimensionId)
			world = ins;
	}
	if(world==null)
		world = list[0];


	var1.addChatMessage(new ChatComponentText("MoreApple Version 1.0"));

}

}


}
