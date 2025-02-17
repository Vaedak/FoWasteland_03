package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DynamiteEntityOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.onGround() && (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
			{
				Entity _ent = entity;
				_ent.setYRot(0);
				_ent.setXRot((float) entity.getPersistentData().getDouble("rotation"));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			entity.getPersistentData().putDouble("rotation", (entity.getPersistentData().getDouble("rotation") - 50));
			world.addParticle(ParticleTypes.FLAME, x, y, z, 0, 0.01, 0);
		} else {
			{
				Entity _ent = entity;
				_ent.setYRot((float) entity.getPersistentData().getDouble("rotation"));
				_ent.setXRot(90);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			world.addParticle(ParticleTypes.FLAME, x, (y + 0.4), z, 0, 0.001, 0);
			if ((entity instanceof DynamiteEntityEntity _datEntI ? _datEntI.getEntityData().get(DynamiteEntityEntity.DATA_countDown) : 0) > 0) {
				if (entity instanceof DynamiteEntityEntity _datEntSetI)
					_datEntSetI.getEntityData().set(DynamiteEntityEntity.DATA_countDown, (int) ((entity instanceof DynamiteEntityEntity _datEntI ? _datEntI.getEntityData().get(DynamiteEntityEntity.DATA_countDown) : 0) - 1));
			} else {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.MOB);
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
