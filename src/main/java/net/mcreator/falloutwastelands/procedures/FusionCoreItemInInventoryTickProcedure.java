package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FusionCoreItemInInventoryTickProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
ItemStack itemstack
) {
if(
entity == null
) return ;
double lowestPower = 0;
if ((entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new FalloutWastelandsModVariables.PlayerVariables())).inPowerArmor) {if (itemstack.getOrCreateTag().getBoolean("noCharge")==false) {if (itemstack.getOrCreateTag().getBoolean("selectedFusionCore")==false) {if (itemstack.getOrCreateTag().getBoolean("notSelected")==false) {lowestPower = itemstack.getDamageValue();{
AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
if (_iitemhandlerref.get() != null) {
for(int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
if (itemstackiterator.getItem() == FalloutWastelandsModItems.FUSION_CORE.get()) {if (lowestPower<itemstackiterator.getDamageValue()&&itemstackiterator.getDamageValue()<99) {itemstack.getOrCreateTag().putBoolean("notSelected", true);}}
}
}
}}if (itemstack.getOrCreateTag().getBoolean("notSelected")==false) {itemstack.getOrCreateTag().putBoolean("selectedFusionCore", true);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fallout_wastelands_:revolverreloading")),
SoundSource.NEUTRAL, (float)0.7, (float)0.5);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fallout_wastelands_:revolverreloading")),
SoundSource.NEUTRAL, (float)0.7, (float)0.5, false);
}
}
entity.getPersistentData().putDouble("fusionCoreCounter", 200);}}if (itemstack.getOrCreateTag().getBoolean("selectedFusionCore")) {if (entity.getPersistentData().getDouble("fusionCoreCounter")<=0) {entity.getPersistentData().putDouble("fusionCoreCounter", 200);{
ItemStack _ist = itemstack;
if(_ist.hurt(1, RandomSource.create(), null)) {
_ist.shrink(1);
_ist.setDamageValue(0);
}
}}if (entity.getPersistentData().getDouble("fusionCoreCounter")>0) {entity.getPersistentData().putDouble("fusionCoreCounter", (entity.getPersistentData().getDouble("fusionCoreCounter")-1));}if (itemstack.getDamageValue()>99) {itemstack.getOrCreateTag().putBoolean("noCharge", true);itemstack.getOrCreateTag().putBoolean("notSelected", true);itemstack.getOrCreateTag().putBoolean("selectedFusionCore", false);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
}}if (<=1) {itemstack.getOrCreateTag().putBoolean("notSelected", false);itemstack.getOrCreateTag().putBoolean("selectedFusionCore", false);}}}
}
}
