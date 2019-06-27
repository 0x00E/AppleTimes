package com.github.qianniancc;

import java.util.Random;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;



public class iphone{

public iphone(){}

public static Item block;public static Object instance;public void load(){

GameRegistry.addRecipe(new ItemStack(block, 1), new Object[]{
	"012", "345", "678", Character.valueOf('0'), new ItemStack(Blocks.iron_block, 1), Character.valueOf('1'), new ItemStack(Blocks.iron_block, 1), Character.valueOf('2'), new ItemStack(Blocks.iron_block, 1), Character.valueOf('3'), new ItemStack(Blocks.iron_block, 1), Character.valueOf('4'), new ItemStack(crippledApple.block, 1), Character.valueOf('5'), new ItemStack(Blocks.iron_block, 1), Character.valueOf('6'), new ItemStack(Blocks.iron_block, 1), Character.valueOf('7'), new ItemStack(Blocks.iron_block, 1), Character.valueOf('8'), new ItemStack(Blocks.iron_block, 1), 
});}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){
}


static{
block = (new Qianniancc(446));
Item.itemRegistry.addObject(446, "Iphone", block);

}

static class Qianniancc extends Item{

public Qianniancc(int par1){
setMaxDamage(0);
maxStackSize = 64;
setUnlocalizedName("Iphone");
setTextureName("iphone");
setCreativeTab(moreAppleTab.tab);
}
public int getItemEnchantability()
{
    return 0;
}
public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 0;
}
public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
{
    return 1.0F;
}
public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity){

if(true){
world.getWorldInfo().setRaining(!world.getWorldInfo().isRaining());
}

return itemstack;
}
public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){

if(true){
world.getWorldInfo().setRaining(!world.getWorldInfo().isRaining());
}

return true;
}




}}
