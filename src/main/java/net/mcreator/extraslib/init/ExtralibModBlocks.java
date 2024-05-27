
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extraslib.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.extraslib.block.ToiletBlock;
import net.mcreator.extraslib.block.LejnoBlock;
import net.mcreator.extraslib.block.HovnoblockBlock;
import net.mcreator.extraslib.ExtralibMod;

public class ExtralibModBlocks {
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
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(ExtralibMod.MODID, registryName), block);
	}
}
