package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class Display1BlockParticleProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double size = 0;
		double vert_x = 0;
		double vert_y = 0;
		double vert_z = 0;
		double rayRange = 0;
		double n = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(FalloutWastelandsModMobEffects.IN_BASE.get())) {
			rayRange = 10;
			size = 1;
			for (int index0 = 0; index0 < 8; index0++) {
				vert_x = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(rayRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
						+ (n % 2) * size;
				vert_y = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(rayRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
						+ (Math.floor(n / 2) % 2) * size;
				vert_z = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(rayRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
						+ (Math.floor(n / 4) % 2) * size;
				n = n + 1;
				world.addParticle((SimpleParticleType) (FalloutWastelandsModParticleTypes.DELETED_MOD_ELEMENT.get()), vert_x, vert_y, vert_z, 0, 0, 0);
			}
		}
	}
}
