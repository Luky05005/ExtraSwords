package net.mcreator.extraswords.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

public class BreadSwordRightclickedProcedure {
	public static void execute(Entity sourceentity, ItemStack itemstack) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 60);
		if (sourceentity instanceof Player _player)
			_player.getFoodData().setFoodLevel((int) ((sourceentity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 5));
		if (sourceentity instanceof Player _player)
			_player.getFoodData().setSaturation((float) ((sourceentity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 6));
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(10, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
