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

public class pinkApple {

public pinkApple(){}

public static Item block;public static Object instance;public void load(){
GameRegistry.addRecipe(new ItemStack(block, 1), new Object[]{
	"X1X", "X4X", "XXX", Character.valueOf('1'), new ItemStack(Items.dye, 1, 13), Character.valueOf('4'), new ItemStack(Items.apple, 1), 
});}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}


static{
block = (Item)(new Qianniancc(11, 0.3F, false));block = ((Qianniancc)block).setUnlocalizedName("PinkApple").setTextureName("pinkapple");
block.setMaxStackSize(64);
Item.itemRegistry.addObject(429, "PinkApple", block);

}

public static class Qianniancc extends ItemFood{public Qianniancc(int par2, float par3, boolean par4){super(par2, par3, par4);}}
}
