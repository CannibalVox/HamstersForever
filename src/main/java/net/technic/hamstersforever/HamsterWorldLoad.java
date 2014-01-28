package net.technic.hamstersforever;

import com.mia.hamster.EntityHamster;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.WorldEvent;

public class HamsterWorldLoad {
	private boolean mDone = false;

	@ForgeSubscribe
	public void worldLoaded(WorldEvent.Load loadEvent) {
		if (!mDone) {

			World world = DimensionManager.getWorld(0);

			if (world == null || world.isRemote) return;

			mDone = true;

			for (Object biomeObject : world.getWorldChunkManager().getBiomesToSpawnIn()) {
				if (biomeObject instanceof BiomeGenBase) {
					BiomeGenBase biome = (BiomeGenBase)biomeObject;

					if (biome.getSpawnableList(EnumCreatureType.creature).size() > 0) {
						HamstersForever.logger.fine("Outfitting biome "+biome.biomeName);
						biome.getSpawnableList(EnumCreatureType.creature).add(new SpawnListEntry(EntityHamster.class, 10, 2, 3));
					}
				}
			}
		}
	}
}
