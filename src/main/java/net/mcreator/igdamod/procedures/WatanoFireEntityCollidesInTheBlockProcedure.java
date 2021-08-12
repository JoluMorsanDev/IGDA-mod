package net.mcreator.igdamod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.igdamod.IgdamodMod;

import java.util.Map;

public class WatanoFireEntityCollidesInTheBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				IgdamodMod.LOGGER.warn("Failed to load dependency entity for procedure WatanoFireEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 15);
	}
}
