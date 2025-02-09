package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PAVisorDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FalloutWastelandsModVariables.PlayerVariables())).inPowerArmor
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_helmet")))
				&& world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) > 7) {
			return true;
		}
		return false;
	}
}
