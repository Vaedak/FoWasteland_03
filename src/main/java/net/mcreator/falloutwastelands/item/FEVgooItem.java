
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModFluids;

public class FEVgooItem extends BucketItem {
	public FEVgooItem() {
		super(FalloutWastelandsModFluids.FE_VGOO, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
