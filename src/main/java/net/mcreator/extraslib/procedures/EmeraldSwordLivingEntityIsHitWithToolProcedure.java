package net.mcreator.extraslib.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class EmeraldSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (Math.random() >= 0.8) {
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount(1);
				_player.getInventory().add(_setstack);
			}
		}
	}
}
