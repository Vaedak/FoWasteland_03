package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PressRecruitSettlerProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
Entity foundSettler = null;
if (!world.getEntitiesOfClass(SettlerEntity.class,
AABB.ofSize(new Vec3(x, y, z), 7, 7, 7), e -> true)
.isEmpty()) {foundSettler = (Entity) world.getEntitiesOfClass(SettlerEntity.class,
AABB.ofSize(new Vec3(x, y, z), 7, 7, 7), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null);if (!(0>(foundSettler.getPersistentData().getString("assignedBASE")).length())) {{
Entity _ent = foundSettler;
_ent.teleportTo(,,);
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport(, , , _ent.getYRot(), _ent.getXRot());
}if(entity instanceof Player _player) _player.closeContainer();}}
}
}
