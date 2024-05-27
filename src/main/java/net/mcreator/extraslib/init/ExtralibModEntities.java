
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extraslib.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.extraslib.entity.BlazeBallEntity;
import net.mcreator.extraslib.ExtralibMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

public class ExtralibModEntities {
	public static EntityType<BlazeBallEntity> BLAZE_BALL;

	public static void load() {
		BLAZE_BALL = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(ExtralibMod.MODID, "blaze_ball"), createArrowEntityType(BlazeBallEntity::new));
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
