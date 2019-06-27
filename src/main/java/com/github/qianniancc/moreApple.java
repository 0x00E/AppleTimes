package com.github.qianniancc;

import java.util.Random;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

@Mod(modid = moreApple.MODID, version = moreApple.VERSION)
public class moreApple implements IFuelHandler, IWorldGenerator{

	public static final String MODID = "moreApple";
    public static final String VERSION = "1.0";
	@Instance(MODID)
    public static moreApple instance;

	greenApple qianniancc_0 = new greenApple();
blueApple qianniancc_1 = new blueApple();
purpleApple qianniancc_2 = new purpleApple();
shiApple qianniancc_3 = new shiApple();
shiApplePro qianniancc_4 = new shiApplePro();
pinkApple qianniancc_5 = new pinkApple();
colorApple qianniancc_6 = new colorApple();
blackApple qianniancc_7 = new blackApple();
tNTApple qianniancc_8 = new tNTApple();
randomApple qianniancc_9 = new randomApple();
appleVersion qianniancc_10 = new appleVersion();
moreAppleKey qianniancc_11 = new moreAppleKey();
moreAppleACHV qianniancc_12 = new moreAppleACHV();
dieApple qianniancc_13 = new dieApple();
appleAxe qianniancc_14 = new appleAxe();
appleArmor qianniancc_15 = new appleArmor();
appleSword qianniancc_16 = new appleSword();
applePickaxe qianniancc_17 = new applePickaxe();
appleShovel qianniancc_18 = new appleShovel();
appleHoe qianniancc_19 = new appleHoe();
crippledApple qianniancc_20 = new crippledApple();
moreAppleTab qianniancc_21 = new moreAppleTab();
iphone qianniancc_22 = new iphone();


@Override
public int getBurnTime(ItemStack fuel) {
if(qianniancc_0.addFuel(fuel)!=0) return qianniancc_0.addFuel(fuel);
if(qianniancc_1.addFuel(fuel)!=0) return qianniancc_1.addFuel(fuel);
if(qianniancc_2.addFuel(fuel)!=0) return qianniancc_2.addFuel(fuel);
if(qianniancc_3.addFuel(fuel)!=0) return qianniancc_3.addFuel(fuel);
if(qianniancc_4.addFuel(fuel)!=0) return qianniancc_4.addFuel(fuel);
if(qianniancc_5.addFuel(fuel)!=0) return qianniancc_5.addFuel(fuel);
if(qianniancc_6.addFuel(fuel)!=0) return qianniancc_6.addFuel(fuel);
if(qianniancc_7.addFuel(fuel)!=0) return qianniancc_7.addFuel(fuel);
if(qianniancc_8.addFuel(fuel)!=0) return qianniancc_8.addFuel(fuel);
if(qianniancc_9.addFuel(fuel)!=0) return qianniancc_9.addFuel(fuel);
if(qianniancc_10.addFuel(fuel)!=0) return qianniancc_10.addFuel(fuel);
if(qianniancc_11.addFuel(fuel)!=0) return qianniancc_11.addFuel(fuel);
if(qianniancc_12.addFuel(fuel)!=0) return qianniancc_12.addFuel(fuel);
if(qianniancc_13.addFuel(fuel)!=0) return qianniancc_13.addFuel(fuel);
if(qianniancc_14.addFuel(fuel)!=0) return qianniancc_14.addFuel(fuel);
if(qianniancc_15.addFuel(fuel)!=0) return qianniancc_15.addFuel(fuel);
if(qianniancc_16.addFuel(fuel)!=0) return qianniancc_16.addFuel(fuel);
if(qianniancc_17.addFuel(fuel)!=0) return qianniancc_17.addFuel(fuel);
if(qianniancc_18.addFuel(fuel)!=0) return qianniancc_18.addFuel(fuel);
if(qianniancc_19.addFuel(fuel)!=0) return qianniancc_19.addFuel(fuel);
if(qianniancc_20.addFuel(fuel)!=0) return qianniancc_20.addFuel(fuel);
if(qianniancc_21.addFuel(fuel)!=0) return qianniancc_21.addFuel(fuel);
if(qianniancc_22.addFuel(fuel)!=0) return qianniancc_22.addFuel(fuel);
return 0;
}

@Override
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

chunkX = chunkX * 16;
chunkZ = chunkZ * 16;
if(world.provider.dimensionId==-1)qianniancc_0.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_0.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_1.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_1.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_2.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_2.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_3.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_3.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_4.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_4.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_5.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_5.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_6.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_6.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_7.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_7.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_8.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_8.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_9.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_9.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_10.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_10.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_11.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_11.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_12.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_12.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_13.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_13.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_14.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_14.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_15.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_15.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_16.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_16.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_17.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_17.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_18.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_18.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_19.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_19.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_20.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_20.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_21.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_21.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)qianniancc_22.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)qianniancc_22.generateSurface(world, random, chunkX, chunkZ);

}
@EventHandler
public void load(FMLInitializationEvent event) {

GameRegistry.registerFuelHandler(this);
GameRegistry.registerWorldGenerator(this, 1);
NetworkRegistry.INSTANCE.registerGuiHandler(this, new qianniancc());
qianniancc_0.load();
qianniancc_1.load();
qianniancc_2.load();
qianniancc_3.load();
qianniancc_4.load();
qianniancc_5.load();
qianniancc_6.load();
qianniancc_7.load();
qianniancc_8.load();
qianniancc_9.load();
qianniancc_10.load();
qianniancc_11.load();
qianniancc_12.load();
qianniancc_13.load();
qianniancc_14.load();
qianniancc_15.load();
qianniancc_16.load();
qianniancc_17.load();
qianniancc_18.load();
qianniancc_19.load();
qianniancc_20.load();
qianniancc_21.load();
qianniancc_22.load();
}
@EventHandler
public void serverLoad(FMLServerStartingEvent event){
qianniancc_0.serverLoad(event);
qianniancc_1.serverLoad(event);
qianniancc_2.serverLoad(event);
qianniancc_3.serverLoad(event);
qianniancc_4.serverLoad(event);
qianniancc_5.serverLoad(event);
qianniancc_6.serverLoad(event);
qianniancc_7.serverLoad(event);
qianniancc_8.serverLoad(event);
qianniancc_9.serverLoad(event);
qianniancc_10.serverLoad(event);
qianniancc_11.serverLoad(event);
qianniancc_12.serverLoad(event);
qianniancc_13.serverLoad(event);
qianniancc_14.serverLoad(event);
qianniancc_15.serverLoad(event);
qianniancc_16.serverLoad(event);
qianniancc_17.serverLoad(event);
qianniancc_18.serverLoad(event);
qianniancc_19.serverLoad(event);
qianniancc_20.serverLoad(event);
qianniancc_21.serverLoad(event);
qianniancc_22.serverLoad(event);
}
@EventHandler
public void preInit(FMLPreInitializationEvent event){
greenApple.instance = moreApple.instance;
blueApple.instance = moreApple.instance;
purpleApple.instance = moreApple.instance;
shiApple.instance = moreApple.instance;
shiApplePro.instance = moreApple.instance;
pinkApple.instance = moreApple.instance;
colorApple.instance = moreApple.instance;
blackApple.instance = moreApple.instance;
tNTApple.instance = moreApple.instance;
randomApple.instance = moreApple.instance;
appleVersion.instance = moreApple.instance;
moreAppleKey.instance = moreApple.instance;
qianniancc_12.instance = moreApple.instance;
dieApple.instance = moreApple.instance;
appleAxe.instance = moreApple.instance;
qianniancc_15.instance = moreApple.instance;
appleSword.instance = moreApple.instance;
applePickaxe.instance = moreApple.instance;
appleShovel.instance = moreApple.instance;
appleHoe.instance = moreApple.instance;
crippledApple.instance = moreApple.instance;
qianniancc_21.instance = moreApple.instance;
iphone.instance = moreApple.instance;
qianniancc_0.preInit(event);
qianniancc_1.preInit(event);
qianniancc_2.preInit(event);
qianniancc_3.preInit(event);
qianniancc_4.preInit(event);
qianniancc_5.preInit(event);
qianniancc_6.preInit(event);
qianniancc_7.preInit(event);
qianniancc_8.preInit(event);
qianniancc_9.preInit(event);
qianniancc_10.preInit(event);
qianniancc_11.preInit(event);
qianniancc_12.preInit(event);
qianniancc_13.preInit(event);
qianniancc_14.preInit(event);
qianniancc_15.preInit(event);
qianniancc_16.preInit(event);
qianniancc_17.preInit(event);
qianniancc_18.preInit(event);
qianniancc_19.preInit(event);
qianniancc_20.preInit(event);
qianniancc_21.preInit(event);
qianniancc_22.preInit(event);

}
public static class qianniancc implements IGuiHandler {
@Override public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
return null;}
@Override public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
return null;}
}


}
