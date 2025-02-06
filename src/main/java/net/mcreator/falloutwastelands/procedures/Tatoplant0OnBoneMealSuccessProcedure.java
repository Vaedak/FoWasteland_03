package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class Tatoplant0OnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FalloutWastelandsModBlocks.TATOPLANT_0.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FalloutWastelandsModBlocks.TATOPLANT_1.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EFFECT, x, y, z, 5, 0.1, 0.1, 0.1, 0.2);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FalloutWastelandsModBlocks.TATOPLANT_1.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FalloutWastelandsModBlocks.TATOPLANT_2.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EFFECT, x, y, z, 5, 0.1, 0.1, 0.1, 0.2);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FalloutWastelandsModBlocks.TATOPLANT_2.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FalloutWastelandsModBlocks.TATOPLANT_3.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EFFECT, x, y, z, 5, 0.1, 0.1, 0.1, 0.2);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FalloutWastelandsModBlocks.TATOPLANT_3.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FalloutWastelandsModBlocks.TATOPLANT_4.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EFFECT, x, y, z, 5, 0.1, 0.1, 0.1, 0.2);
		}
	}
}
