
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extraswords.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.extraswords.block.ToiletBlock;
import net.mcreator.extraswords.block.LejnoBlock;
import net.mcreator.extraswords.block.HovnoblockBlock;
import net.mcreator.extraswords.ExtraswordsMod;

public class ExtraswordsModBlocks {
	public static Block HOVNOBLOCK;
	public static Block HROMADAHOVEN;
	public static Block TOILET;

	public static void load() {
		HOVNOBLOCK = register("hovnoblock", new HovnoblockBlock());
		HROMADAHOVEN = register("hromadahoven", new LejnoBlock());
		TOILET = register("toilet", new ToiletBlock());
	}

	public static void clientLoad() {
		HovnoblockBlock.clientInit();
		LejnoBlock.clientInit();
		ToiletBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(ExtraswordsMod.MODID, registryName), block);
	}
}
