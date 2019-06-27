package com.github.qianniancc;

import java.util.Random;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class dieApple {

public dieApple(){}

public static Item block;public static Object instance;public void load(){
}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}


static{
block = (Item)(new Qianniancc(0, 0.3F, false));block = ((Qianniancc)block).setUnlocalizedName("DieApple").setTextureName("dieapple");
block.setMaxStackSize(64);
Item.itemRegistry.addObject(435, "DieApple", block);

}

public static class Qianniancc extends ItemFood{public Qianniancc(int par2, float par3, boolean par4){super(par2, par3, par4);}
protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity){
super.onFoodEaten(itemStack, world, entity);

if(true){
world.getWorldInfo().setRaining(!world.getWorldInfo().isRaining());
}

}
}
}
