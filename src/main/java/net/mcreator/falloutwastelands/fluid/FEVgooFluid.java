
package net.mcreator.falloutwastelands.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModFluids;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModFluidTypes;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModBlocks;

public abstract class FEVgooFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> FalloutWastelandsModFluidTypes.FE_VGOO_TYPE.get(), () -> FalloutWastelandsModFluids.FE_VGOO.get(),
			() -> FalloutWastelandsModFluids.FLOWING_FE_VGOO.get()).explosionResistance(100f).bucket(() -> FalloutWastelandsModItems.FE_VGOO_BUCKET.get()).block(() -> (LiquidBlock) FalloutWastelandsModBlocks.FE_VGOO.get());

	private FEVgooFluid() {
		super(PROPERTIES);
	}

	public static class Source extends FEVgooFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends FEVgooFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
