
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extraslib.init;

import net.mcreator.extraslib.procedures.ToiletOnBlockRightClickedProcedure;
import net.mcreator.extraslib.procedures.SwordOfIceLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraslib.procedures.PowerSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraslib.procedures.PowerSwordLivingEntityIsHitProcedure;
import net.mcreator.extraslib.procedures.PoserSwordssProcedure;
import net.mcreator.extraslib.procedures.PoisonSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraslib.procedures.LightningSwordRightclickedProcedure;
import net.mcreator.extraslib.procedures.HovnoPlayerFinishesUsingItemProcedure;
import net.mcreator.extraslib.procedures.HeartsteelRightclickedProcedure;
import net.mcreator.extraslib.procedures.HeartsteelLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraslib.procedures.FeatherSwordToolInHandTickProcedure;
import net.mcreator.extraslib.procedures.EmeraldSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraslib.procedures.DeepslateHammerLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraslib.procedures.BreadSwordRightclickedProcedure;
import net.mcreator.extraslib.procedures.BlazeSwordRightclickedProcedure;
import net.mcreator.extraslib.procedures.BlazeSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraslib.procedures.BlazeBallWhileProjectileFlyingTickProcedure;
import net.mcreator.extraslib.procedures.BlazeBallProjectileHitsLivingEntityProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class ExtralibModProcedures {
	public static void load() {
		new BlazeSwordLivingEntityIsHitWithToolProcedure();
		new PoisonSwordLivingEntityIsHitWithToolProcedure();
		new BlazeSwordRightclickedProcedure();
		new BlazeBallWhileProjectileFlyingTickProcedure();
		new BlazeBallProjectileHitsLivingEntityProcedure();
		new SwordOfIceLivingEntityIsHitWithToolProcedure();
		new DeepslateHammerLivingEntityIsHitWithToolProcedure();
		new BreadSwordRightclickedProcedure();
		new FeatherSwordToolInHandTickProcedure();
		new EmeraldSwordLivingEntityIsHitWithToolProcedure();
		new LightningSwordRightclickedProcedure();
		new PowerSwordLivingEntityIsHitWithToolProcedure();
		new PoserSwordssProcedure();
		new HeartsteelLivingEntityIsHitWithToolProcedure();
		new HeartsteelRightclickedProcedure();
		new PowerSwordLivingEntityIsHitProcedure();
		new HovnoPlayerFinishesUsingItemProcedure();
		new ToiletOnBlockRightClickedProcedure();
	}
}
