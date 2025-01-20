package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModParticleTypes;

public class PlasmaProjectileProjectileHitsEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		if (entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		double particleRadius = 0;
		double particleAmount = 0;
		particleAmount = 10;
		particleRadius = 1;
		for (int index0 = 0; index0 < (int) particleAmount; index0++) {
			world.addParticle((SimpleParticleType) (FalloutWastelandsModParticleTypes.PLASMA_PARTICLE_SPLASH.get()), (immediatesourceentity.getX() + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius),
					(immediatesourceentity.getY() + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (immediatesourceentity.getZ() + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius),
					(Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)));
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((entity + "" + ("\\n" + sourceentity))), false);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, (float) 0.5, (float) 0.7);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, (float) 0.5, (float) 0.7, false);
			}
		}
	}
}
