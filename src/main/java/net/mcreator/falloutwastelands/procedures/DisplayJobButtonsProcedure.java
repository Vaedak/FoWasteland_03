package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.falloutwastelands.entity.SettlerEntity;

import java.util.Comparator;

public class DisplayJobButtonsProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(SettlerEntity.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty()) {
			if ((((Entity) world.getEntitiesOfClass(SettlerEntity.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("assignedBASE")).length() > 0) {
				return true;
			}
		}
		return false;
	}
}
