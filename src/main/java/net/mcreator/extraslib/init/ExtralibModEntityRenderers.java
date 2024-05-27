
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extraslib.init;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class ExtralibModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(ExtralibModEntities.BLAZE_BALL, ThrownItemRenderer::new);
	}
}
