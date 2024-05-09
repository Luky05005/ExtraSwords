/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extraswords.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.mcreator.extraswords.item.PoisonSwordItem;
import net.mcreator.extraswords.item.JavelinItem;
import net.mcreator.extraswords.item.BlazeSwordItem;
import net.mcreator.extraswords.ExtraswordsMod;

public class ExtraswordsModItems {
	public static Item BLAZE_SWORD;
	public static Item POISON_SWORD;
	public static Item JAVELIN;

	public static void load() {
		BLAZE_SWORD = register("blaze_sword", new BlazeSwordItem());
		POISON_SWORD = register("poison_sword", new PoisonSwordItem());
		JAVELIN = register("javelin", new JavelinItem());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ExtraswordsMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
