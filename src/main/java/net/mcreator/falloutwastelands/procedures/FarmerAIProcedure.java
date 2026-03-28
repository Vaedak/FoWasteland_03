package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModMobEffects;

public class FarmerAIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double destroyRange = 0;
		double sz = 0;
		double detectRange = 0;
		PickupCropsProcedure.execute(world, x, y, z, entity);
		if (entity.getPersistentData().getDouble("counter") > 0) {
			entity.getPersistentData().putDouble("counter", (entity.getPersistentData().getDouble("counter") - 1));
		} else {
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo((entity.getPersistentData().getDouble("homeX")), (entity.getPersistentData().getDouble("homeY")), (entity.getPersistentData().getDouble("homeZ")), 1);
		}
		if (!(entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(FalloutWastelandsModMobEffects.WAITING_FOR_SET_HOME.get()))) {
			destroyRange = 2.5;
			detectRange = -7;
			sx = detectRange;
			for (int index0 = 0; index0 < (int) (detectRange * (-2)); index0++) {
				sy = -1;
				for (int index1 = 0; index1 < 3; index1++) {
					sz = detectRange;
					for (int index2 = 0; index2 < (int) (detectRange * (-2)); index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("fallout_wastelands_:growables")))
								&& 7 == ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip11
										? (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getValue(_getip11)
										: -1)
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.MELON || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PUMPKIN
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BEETROOTS
										&& 3 == ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip19
												? (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getValue(_getip19)
												: -1)) {
							entity.getPersistentData().putDouble("counter", 100);
							if (entity instanceof Mob _entity)
								_entity.getNavigation().moveTo((x + sx), (y + sy), (z + sz), 1);
							entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((x + sx), (y + sy), (z + sz)));
							if ((world
									.getBlockState(new BlockPos(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getX(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getY(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f)
													.scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
									.is(BlockTags.create(new ResourceLocation("fallout_wastelands_:growables")))
									&& 7 == ((world
											.getBlockState(
													new BlockPos(
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getX(),
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getY(),
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getZ())))
											.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip32
													? (world.getBlockState(new BlockPos(
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getX(),
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getY(),
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getZ())))
															.getValue(_getip32)
													: -1)
									|| (world
											.getBlockState(
													new BlockPos(
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getX(),
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getY(),
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getZ())))
											.getBlock() == Blocks.MELON
									|| (world.getBlockState(new BlockPos(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getX(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getY(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getZ())))
											.getBlock() == Blocks.PUMPKIN
									|| (world
											.getBlockState(
													new BlockPos(
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getX(),
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getY(),
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getZ())))
											.getBlock() == Blocks.BEETROOTS
											&& 3 == ((world
													.getBlockState(new BlockPos(
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getX(),
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getY(),
															entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getZ())))
													.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip52
															? (world.getBlockState(new BlockPos(
																	entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX(),
																	entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getY(),
																	entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getZ())))
																	.getValue(_getip52)
															: -1)) {
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.MAIN_HAND, true);
								if ((world.getBlockState(new BlockPos(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getY(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getZ())))
										.getBlock() == Blocks.WHEAT) {
									{
										BlockPos _pos = new BlockPos(
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getX(),
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getY(),
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getZ());
										Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
										world.destroyBlock(_pos, false);
									}
									world.setBlock(new BlockPos(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getX(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getY(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getZ()),
											Blocks.WHEAT.defaultBlockState(), 3);
								}
								if ((world.getBlockState(new BlockPos(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getY(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getZ())))
										.getBlock() == Blocks.PUMPKIN
										|| (world
												.getBlockState(
														new BlockPos(
																entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																				entity))
																		.getBlockPos().getX(),
																entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																				entity))
																		.getBlockPos().getY(),
																entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE,
																		ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
												.getBlock() == Blocks.MELON) {
									{
										BlockPos _pos = new BlockPos(
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getX(),
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getY(),
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getZ());
										Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
										world.destroyBlock(_pos, false);
									}
								}
								if ((world.getBlockState(new BlockPos(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getY(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getZ())))
										.getBlock() == Blocks.BEETROOTS) {
									{
										BlockPos _pos = new BlockPos(
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getX(),
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getY(),
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getZ());
										Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
										world.destroyBlock(_pos, false);
									}
									world.setBlock(new BlockPos(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getX(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getY(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getZ()),
											Blocks.BEETROOTS.defaultBlockState(), 3);
								}
								if ((world.getBlockState(new BlockPos(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getY(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getZ())))
										.getBlock() == Blocks.POTATOES) {
									{
										BlockPos _pos = new BlockPos(
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getX(),
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getY(),
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getZ());
										Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
										world.destroyBlock(_pos, false);
									}
									world.setBlock(new BlockPos(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getX(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getY(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(destroyRange)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getZ()),
											Blocks.POTATOES.defaultBlockState(), 3);
								}
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
		}
	}
}
