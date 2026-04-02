
package net.mcreator.falloutwastelands.item;

import net.minecraft.network.chat.Component;

public class FEVgooItem extends BucketItem {

	public FEVgooItem() {
		super(FalloutWastelandsModFluids.FE_VGOO, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}

}
