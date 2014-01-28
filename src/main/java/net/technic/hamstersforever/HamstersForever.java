package net.technic.hamstersforever;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import java.util.logging.Logger;

@Mod(modid = HamstersForever.MODID, version = HamstersForever.VERSION)
public class HamstersForever
{
	public static final String MODID = "hamstersforever";
	public static final String VERSION = "1.0";
	public static Logger logger = Logger.getLogger("HamstersForever");

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		logger.setParent(FMLLog.getLogger());
		MinecraftForge.EVENT_BUS.register(new HamsterWorldLoad());
	}
}
