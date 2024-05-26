/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extraswords.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.mcreator.extraswords.item.SwordOfIceItem;
import net.mcreator.extraswords.item.PowerSwordItem;
import net.mcreator.extraswords.item.PoisonSwordItem;
import net.mcreator.extraswords.item.LightningSwordItem;
import net.mcreator.extraswords.item.LapisPickaxeItem;
import net.mcreator.extraswords.item.JavelinItem;
import net.mcreator.extraswords.item.HovnoItem;
import net.mcreator.extraswords.item.HeartsteelItem;
import net.mcreator.extraswords.item.FeatherSwordItem;
import net.mcreator.extraswords.item.EmeraldSwordItem;
import net.mcreator.extraswords.item.DeepslateHammerItem;
import net.mcreator.extraswords.item.BreadSwordItem;
import net.mcreator.extraswords.item.BlazeSwordItem;
import net.mcreator.extraswords.ExtraswordsMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ExtraswordsModItems {
	public static Item BLAZE_SWORD;
	public static Item POISON_SWORD;
	public static Item JAVELIN;
	public static Item SWORD_OF_ICE;
	public static Item DEEPSLATE_HAMMER;
	public static Item BREAD_SWORD;
	public static Item FEATHER_SWORD;
	public static Item EMERALD_SWORD;
	public static Item LIGHTNING_SWORD;
	public static Item POWER_SWORD;
	public static Item HEARTSTEEL;
	public static Item LAPIS_PICKAXE;
	public static Item HOVNO;
	public static Item HOVNOBLOCK;
	public static Item HROMADAHOVEN;
	public static Item TOILET;

	public static void load() {
		BLAZE_SWORD = register("blaze_sword", new BlazeSwordItem());
		POISON_SWORD = register("poison_sword", new PoisonSwordItem());
		JAVELIN = register("javelin", new JavelinItem());
		SWORD_OF_ICE = register("sword_of_ice", new SwordOfIceItem());
		DEEPSLATE_HAMMER = register("deepslate_hammer", new DeepslateHammerItem());
		BREAD_SWORD = register("bread_sword", new BreadSwordItem());
		FEATHER_SWORD = register("feather_sword", new FeatherSwordItem());
		EMERALD_SWORD = register("emerald_sword", new EmeraldSwordItem());
		LIGHTNING_SWORD = register("lightning_sword", new LightningSwordItem());
		POWER_SWORD = register("power_sword", new PowerSwordItem());
		HEARTSTEEL = register("heartsteel", new HeartsteelItem());
		LAPIS_PICKAXE = register("lapis_pickaxe", new LapisPickaxeItem());
		HOVNO = register("hovno", new HovnoItem());
		HOVNOBLOCK = register("hovnoblock", new BlockItem(ExtraswordsModBlocks.HOVNOBLOCK, new Item.Properties()));
		HROMADAHOVEN = register("hromadahoven", new BlockItem(ExtraswordsModBlocks.HROMADAHOVEN, new Item.Properties()));
		TOILET = register("toilet", new BlockItem(ExtraswordsModBlocks.TOILET, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.accept(TOILET));
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
