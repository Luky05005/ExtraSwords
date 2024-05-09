
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extraswords.init;

import net.mcreator.extraswords.procedures.PoisonSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.extraswords.procedures.BlazeSwordLivingEntityIsHitWithToolProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class ExtraswordsModProcedures {
	public static void load() {
		new BlazeSwordLivingEntityIsHitWithToolProcedure();
		new PoisonSwordLivingEntityIsHitWithToolProcedure();
	}
}
