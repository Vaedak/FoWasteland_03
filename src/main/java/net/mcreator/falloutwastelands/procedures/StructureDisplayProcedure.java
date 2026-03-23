package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModParticleTypes;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StructureDisplayProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double vert_x = 0;
		double vert_y = 0;
		double vert_z = 0;
		double n = 0;
		double size = 0;
		double rayRange = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(FalloutWastelandsModMobEffects.IN_BASE.get())) {
			rayRange = 10;
			size = 5;
			for (int index0 = 0; index0 < 8; index0++) {
				vert_x = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(rayRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
						+ (n % 2) * size;
				vert_y = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(rayRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
						+ (Math.floor(n / 2) % 2) * size;
				vert_z = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(rayRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
						+ (Math.floor(n / 4) % 2) * size;
				n = n + 1;
				world.addParticle((SimpleParticleType) (FalloutWastelandsModParticleTypes.OUTLINE_PARTICLE.get()), vert_x, vert_y, vert_z, 0, 0, 0);
				if (entity.isShiftKeyDown()) {
					for (int index1 = 0; index1 < (int) size; index1++) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.DIAMOND_BLOCK.defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
