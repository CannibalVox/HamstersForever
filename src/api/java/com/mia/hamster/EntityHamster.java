package com.mia.hamster;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.world.World;

public class EntityHamster extends EntityTameable {
	public EntityHamster(World world) { super(world);}

	@Override
	public EntityAgeable createChild(EntityAgeable entityageable) {
		return null;
	}

	@Override
	public Entity getOwner() {
		return null;
	}
}
