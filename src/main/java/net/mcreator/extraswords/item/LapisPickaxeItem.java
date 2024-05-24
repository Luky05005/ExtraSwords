
package net.mcreator.extraswords.item;

import com.google.common.collect.Multimap;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.fabricmc.api.Environment;

public class LapisPickaxeItem extends PickaxeItem {
	public LapisPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 264;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.GOLD_INGOT));
			}
		}, 1, -2.8f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}