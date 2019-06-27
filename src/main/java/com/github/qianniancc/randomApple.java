package com.github.qianniancc;

import java.util.Random;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class randomApple {

public randomApple(){}

public static Item block;public static Object instance;public void load(){
GameRegistry.addRecipe(new ItemStack(block, 1), new Object[]{
	"012", "345", "678", Character.valueOf('0'), new ItemStack(Blocks.diamond_block, 1), Character.valueOf('1'), new ItemStack(Blocks.gold_block, 1), Character.valueOf('2'), new ItemStack(Blocks.diamond_block, 1), Character.valueOf('3'), new ItemStack(Blocks.gold_block, 1), Character.valueOf('4'), new ItemStack(Blocks.emerald_block, 1), Character.valueOf('5'), new ItemStack(Blocks.gold_block, 1), Character.valueOf('6'), new ItemStack(Blocks.diamond_block, 1), Character.valueOf('7'), new ItemStack(Blocks.gold_block, 1), Character.valueOf('8'), new ItemStack(Blocks.diamond_block, 1), 
});}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}


static{
block = (Item)(new Qianniancc(0, 0.3F, false));block = ((Qianniancc)block).setUnlocalizedName("RandomApple").setTextureName("randomapple");
block.setMaxStackSize(64);
Item.itemRegistry.addObject(434, "RandomApple", block);

}

public static class Qianniancc extends ItemFood{public Qianniancc(int par2, float par3, boolean par4){super(par2, par3, par4);}
protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity){
super.onFoodEaten(itemStack, world, entity);

if(true){
world.setWorldTime(16000);
}

}
}
}
