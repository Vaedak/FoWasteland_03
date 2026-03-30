package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.falloutwastelands.network.FalloutWastelandsModVariables;
import net.mcreator.falloutwastelands.entity.SettlerEntity;

import java.util.Comparator;

public class PressRecruitSettlerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity foundSettler = null;
		if (!world.getEntitiesOfClass(SettlerEntity.class, AABB.ofSize(new Vec3(x, y, z), 7, 7, 7), e -> true).isEmpty()) {
			foundSettler = (Entity) world.getEntitiesOfClass(SettlerEntity.class, AABB.ofSize(new Vec3(x, y, z), 7, 7, 7), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null);
			if (!(0 > (foundSettler.getPersistentData().getString("assignedBASE")).length())) {
				{
					Entity _ent = foundSettler;
					_ent.teleportTo(((entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FalloutWastelandsModVariables.PlayerVariables())).baseX),
							((entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FalloutWastelandsModVariables.PlayerVariables())).baseY),
							((entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FalloutWastelandsModVariables.PlayerVariables())).baseZ));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FalloutWastelandsModVariables.PlayerVariables())).baseX),
								((entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FalloutWastelandsModVariables.PlayerVariables())).baseY),
								((entity.getCapability(FalloutWastelandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FalloutWastelandsModVariables.PlayerVariables())).baseZ), _ent.getYRot(), _ent.getXRot());
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
			}
		}
	}
}
