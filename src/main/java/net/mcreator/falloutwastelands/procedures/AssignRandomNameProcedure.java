package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class AssignRandomNameProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double randomNumber = 0;
		randomNumber = Math.round(Math.random() * 10);
		if (randomNumber == 0) {
			entity.setCustomName(Component.literal("Mark"));
		}
		if (randomNumber == 1) {
			entity.setCustomName(Component.literal("Moria"));
		}
		if (randomNumber == 2) {
			entity.setCustomName(Component.literal("Shelby"));
		}
		if (randomNumber == 3) {
			entity.setCustomName(Component.literal("Vinny"));
		}
		if (randomNumber == 4) {
			entity.setCustomName(Component.literal("Drescher"));
		}
		if (randomNumber == 5) {
			entity.setCustomName(Component.literal("Ivan"));
		}
		if (randomNumber == 6) {
			entity.setCustomName(Component.literal("Marlow"));
		}
		if (randomNumber == 7) {
			entity.setCustomName(Component.literal("Teeth"));
		}
		if (randomNumber == 8) {
			entity.setCustomName(Component.literal("Portson"));
		}
		if (randomNumber == 9) {
			entity.setCustomName(Component.literal("Ento"));
		}
	}
}
