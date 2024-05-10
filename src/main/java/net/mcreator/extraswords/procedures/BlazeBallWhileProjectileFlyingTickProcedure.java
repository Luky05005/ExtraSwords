package net.mcreator.extraswords.procedures;

import net.minecraft.world.entity.Entity;

public class BlazeBallWhileProjectileFlyingTickProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setSecondsOnFire(2);
	}
}
