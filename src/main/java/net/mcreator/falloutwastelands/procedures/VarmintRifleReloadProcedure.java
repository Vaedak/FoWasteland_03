package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class VarmintRifleReloadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double ammoCount = 0;
		boolean ammoChecked = false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.VARMINT_RIFLE.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() > 0) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FalloutWastelandsModItems.NINEMMAMMO.get())) : false) {
					if (ammoChecked == false) {
						{
							AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
							entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
							if (_iitemhandlerref.get() != null) {
								for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
									ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
									if (itemstackiterator.getItem() == FalloutWastelandsModItems.NINEMMAMMO.get()) {
										ammoCount = ammoCount + itemstackiterator.getCount();
									}
									ammoChecked = true;
								}
							}
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.NINEMMAMMO.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue(),
									_player.inventoryMenu.getCraftSlots());
						}
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.setDamageValue((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() - ammoCount));
						entity.getPersistentData().putBoolean("ReloadGun", false);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_break")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_break")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 40);
						entity.getPersistentData().putDouble("cooldown", 40);
					}
				} else {
					entity.getPersistentData().putBoolean("ReloadGun", false);
				}
			} else {
				entity.getPersistentData().putBoolean("ReloadGun", false);
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.OFF_HAND, true);
	}
}
