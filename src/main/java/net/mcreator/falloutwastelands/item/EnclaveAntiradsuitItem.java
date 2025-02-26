
package net.mcreator.falloutwastelands.item;

import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class EnclaveAntiradsuitItem extends ArmorItem {

	public EnclaveAntiradsuitItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 10;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{2, 2, 2, 2}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 0;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FalloutWastelandsModItems.ANTIRADCLOTHING.get()));
			}

			@Override
			public String getName() {
				return "enclave_antiradsuit";
			}

			@Override
			public float getToughness() {
				return 0.1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, type, properties);
	}

	public static class Helmet extends EnclaveAntiradsuitItem {

		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fallout_wastelands_:textures/models/armor/enclave_hazmat__layer_1.png";
		}

	}

	public static class Chestplate extends EnclaveAntiradsuitItem {

		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fallout_wastelands_:textures/models/armor/enclave_hazmat__layer_1.png";
		}

	}

	public static class Leggings extends EnclaveAntiradsuitItem {

		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fallout_wastelands_:textures/models/armor/enclave_hazmat__layer_2.png";
		}

	}

	public static class Boots extends EnclaveAntiradsuitItem {

		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fallout_wastelands_:textures/models/armor/enclave_hazmat__layer_1.png";
		}

	}

}
