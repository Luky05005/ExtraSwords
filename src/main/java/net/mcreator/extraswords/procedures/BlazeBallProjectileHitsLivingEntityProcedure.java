package net.mcreator.extraswords.procedures;

import net.minecraft.world.entity.Entity;

public class BlazeBallProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(1);
	}
}
