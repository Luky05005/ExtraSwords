package net.mcreator.extraswords.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class HeartsteelLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity)
			_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 2) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
		}
		if ((sourceentity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) >= 20) {
			if (sourceentity instanceof Player _player)
				_player.getFoodData().setSaturation((float) ((sourceentity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 1));
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - 1));
		} else {
			if (sourceentity instanceof Player _player)
				_player.getFoodData().setSaturation((float) ((sourceentity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 1));
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 1));
		}
	}
}
