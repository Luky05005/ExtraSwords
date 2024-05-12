
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extraswords.init;

import net.mcreator.extraswords.procedures.SwordOfIceLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraswords.procedures.PoisonSwordLivingEntityIsHitWithToolProcedure;
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
	}
}
