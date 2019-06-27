package com.github.qianniancc;

import java.util.Random;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;public class appleArmor{

public appleArmor(){}

public static Item helmet;
public static Item body;
public static Item legs;
public static Item boots;
public Object instance;public void load(){
GameRegistry.addRecipe(new ItemStack(helmet, 1), new Object[]{
	"012", "3X5", "XXX", Character.valueOf('0'), new ItemStack(Items.apple, 1), Character.valueOf('1'), new ItemStack(Items.apple, 1), Character.valueOf('2'), new ItemStack(Items.apple, 1), Character.valueOf('3'), new ItemStack(Items.apple, 1), Character.valueOf('5'), new ItemStack(Items.apple, 1), 
});
GameRegistry.addRecipe(new ItemStack(body, 1), new Object[]{
	"0X2", "345", "678", Character.valueOf('0'), new ItemStack(Items.apple, 1), Character.valueOf('2'), new ItemStack(Items.apple, 1), Character.valueOf('3'), new ItemStack(Items.apple, 1), Character.valueOf('4'), new ItemStack(Items.apple, 1), Character.valueOf('5'), new ItemStack(Items.apple, 1), Character.valueOf('6'), new ItemStack(Items.apple, 1), Character.valueOf('7'), new ItemStack(Items.apple, 1), Character.valueOf('8'), new ItemStack(Items.apple, 1), 
});
GameRegistry.addRecipe(new ItemStack(legs, 1), new Object[]{
	"012", "3X5", "6X8", Character.valueOf('0'), new ItemStack(Items.apple, 1), Character.valueOf('1'), new ItemStack(Items.apple, 1), Character.valueOf('2'), new ItemStack(Items.apple, 1), Character.valueOf('3'), new ItemStack(Items.apple, 1), Character.valueOf('5'), new ItemStack(Items.apple, 1), Character.valueOf('6'), new ItemStack(Items.apple, 1), Character.valueOf('8'), new ItemStack(Items.apple, 1), 
});
GameRegistry.addRecipe(new ItemStack(boots, 1), new Object[]{
	"0X2", "3X5", "XXX", Character.valueOf('0'), new ItemStack(Items.apple, 1), Character.valueOf('2'), new ItemStack(Items.apple, 1), Character.valueOf('3'), new ItemStack(Items.apple, 1), Character.valueOf('5'), new ItemStack(Items.apple, 1), 
});
helmet.setCreativeTab(CreativeTabs.tabCombat);
body.setCreativeTab(CreativeTabs.tabCombat);
legs.setCreativeTab(CreativeTabs.tabCombat);
boots.setCreativeTab(CreativeTabs.tabCombat);
}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}


static{
ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("APPLEARMOR", 25, new int[] {2, 7, 5, 3}, 9);

int armorPreffix = 0;if(FMLCommonHandler.instance().getEffectiveSide()==Side.CLIENT) armorPreffix = RenderingRegistry.addNewArmourRendererPrefix("qianniancc");
helmet = (new ItemArmor(enuma, armorPreffix, 0){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){

}
}).setUnlocalizedName("applehelmet").setTextureName("applehelmet");helmet.setMaxStackSize(1);
body = (new ItemArmor(enuma, armorPreffix, 1){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){

}
}).setUnlocalizedName("applechestplate").setTextureName("applechestplate");body.setMaxStackSize(1);
legs = (new ItemArmor(enuma, armorPreffix, 2){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){

}
}).setUnlocalizedName("appleleggings").setTextureName("appleleggings");legs.setMaxStackSize(1);
boots = (new ItemArmor(enuma, armorPreffix, 3){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){

}
}).setUnlocalizedName("appleboots").setTextureName("appleboots");boots.setMaxStackSize(1);

Item.itemRegistry.addObject(437, "applehelmet", helmet);
Item.itemRegistry.addObject(438, "applechestplate", body);
Item.itemRegistry.addObject(439, "appleleggings", legs);
Item.itemRegistry.addObject(440, "appleboots", boots);


}

}
