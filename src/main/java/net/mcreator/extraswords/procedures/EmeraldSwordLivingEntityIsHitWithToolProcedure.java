package net.mcreator.extraswords.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class EmeraldSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() >= 0.9) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount(1);
				_player.getInventory().add(_setstack);
			}
		}
	}
}
