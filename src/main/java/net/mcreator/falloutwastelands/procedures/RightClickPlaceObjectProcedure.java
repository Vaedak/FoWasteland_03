package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class RightClickPlaceObjectProcedure {
	@SubscribeEvent
	public static void onRightClick(PlayerInteractEvent.RightClickEmpty event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new RightClickPlaceObjectMessage());
		execute(event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RightClickPlaceObjectMessage {
		public RightClickPlaceObjectMessage() {
		}

		public RightClickPlaceObjectMessage(FriendlyByteBuf buffer) {
		}

		public static void buffer(RightClickPlaceObjectMessage message, FriendlyByteBuf buffer) {
		}

		public static void handler(RightClickPlaceObjectMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getSender().level().hasChunkAt(context.getSender().blockPosition()))
					return;
				execute(context.getSender().level(), context.getSender().getX(), context.getSender().getY(), context.getSender().getZ(), context.getSender());
			});
			context.setPacketHandled(true);
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			FalloutWastelandsMod.addNetworkMessage(RightClickPlaceObjectMessage.class, RightClickPlaceObjectMessage::buffer, RightClickPlaceObjectMessage::new, RightClickPlaceObjectMessage::handler);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(FalloutWastelandsModMobEffects.IN_BASE.get())) {
			if (entity.getPersistentData().getBoolean("placeMK1")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FalloutWastelandsModEntities.FRIENDLY_MK_1_TURRET.get().spawn(_level,
							new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
							MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				entity.getPersistentData().putBoolean("placeMK1", false);
			} else {
				entity.getPersistentData().putBoolean("placeMK1", false);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(FalloutWastelandsModMobEffects.DELETED_MOD_ELEMENT.get())) {
						entityiterator.getPersistentData().putDouble("homeX", (entity.getX()));
						entityiterator.getPersistentData().putDouble("homeY", (entity.getY()));
						entityiterator.getPersistentData().putDouble("homeZ", (entity.getZ()));
						if (entityiterator instanceof LivingEntity _entity)
							_entity.removeEffect(FalloutWastelandsModMobEffects.DELETED_MOD_ELEMENT.get());
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Set Home Of Farmer"), true);
					}
				}
			}
		}
	}
}
