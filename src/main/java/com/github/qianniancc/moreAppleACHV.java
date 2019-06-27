package com.github.qianniancc;

import java.util.Random;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.World;

public class moreAppleACHV {

public moreAppleACHV(){}

public Object instance;public static Achievement achievement = (new Achievement("achievement.moreAppleACHV", "moreAppleACHV", 0, 0, randomApple.block, (Achievement)null));

public void load(){
achievement.registerStat();
}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}
}
