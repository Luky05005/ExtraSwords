
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extraswords.init;

import net.mcreator.extraswords.procedures.ToiletOnBlockRightClickedProcedure;
import net.mcreator.extraswords.procedures.SwordOfIceLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraswords.procedures.PowerSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraswords.procedures.PowerSwordLivingEntityIsHitProcedure;
import net.mcreator.extraswords.procedures.PoserSwordssProcedure;
import net.mcreator.extraswords.procedures.PoisonSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraswords.procedures.LightningSwordRightclickedProcedure;
import net.mcreator.extraswords.procedures.HovnoPlayerFinishesUsingItemProcedure;
import net.mcreator.extraswords.procedures.HeartsteelRightclickedProcedure;
import net.mcreator.extraswords.procedures.HeartsteelLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraswords.procedures.FeatherSwordToolInHandTickProcedure;
import net.mcreator.extraswords.procedures.EmeraldSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraswords.procedures.DeepslateHammerLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraswords.procedures.BreadSwordRightclickedProcedure;
import net.mcreator.extraswords.procedures.BlazeSwordRightclickedProcedure;
import net.mcreator.extraswords.procedures.BlazeSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraswords.procedures.BlazeBallWhileProjectileFlyingTickProcedure;
import net.mcreator.extraswords.procedures.BlazeBallProjectileHitsLivingEntityProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class ExtraswordsModProcedures {
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
