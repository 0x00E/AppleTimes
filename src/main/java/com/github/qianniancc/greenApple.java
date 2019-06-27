package com.github.qianniancc;

import java.util.Random;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class greenApple {

public greenApple(){}

public static Item block;public static Object instance;public void load(){

GameRegistry.addSmelting(Items.apple, new ItemStack(block), 1.0f);
}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}


static{
block = (Item)(new Qianniancc(4, 0.3F, false));block = ((Qianniancc)block).setUnlocalizedName("GreenApple").setTextureName("greenapple");
block.setMaxStackSize(64);
Item.itemRegistry.addObject(424, "GreenApple", block);

}

public static class Qianniancc extends ItemFood{public Qianniancc(int par2, float par3, boolean par4){super(par2, par3, par4);}}
}
