
package net.mcreator.igdamod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.igdamod.itemgroup.IGDAItemGroup;
import net.mcreator.igdamod.IgdamodModElements;

@IgdamodModElements.ModElement.Tag
public class AngekFaceItem extends IgdamodModElements.ModElement {
	@ObjectHolder("igdamod:angek_face_helmet")
	public static final Item helmet = null;
	@ObjectHolder("igdamod:angek_face_chestplate")
	public static final Item body = null;
	@ObjectHolder("igdamod:angek_face_leggings")
	public static final Item legs = null;
	@ObjectHolder("igdamod:angek_face_boots")
	public static final Item boots = null;
	public AngekFaceItem(IgdamodModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 5;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 1}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 5;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.STRING));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "angek_face";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(IGDAItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "igdamod:textures/models/armor/angekface_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("angek_face_helmet"));
	}
}
