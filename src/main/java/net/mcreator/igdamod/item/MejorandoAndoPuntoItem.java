
package net.mcreator.igdamod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.igdamod.itemgroup.IGDAItemGroup;
import net.mcreator.igdamod.IgdamodModElements;

@IgdamodModElements.ModElement.Tag
public class MejorandoAndoPuntoItem extends IgdamodModElements.ModElement {
	@ObjectHolder("igdamod:mejorando_ando_punto")
	public static final Item block = null;
	public MejorandoAndoPuntoItem(IgdamodModElements instance) {
		super(instance, 53);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(IGDAItemGroup.tab).maxStackSize(50).rarity(Rarity.EPIC));
			setRegistryName("mejorando_ando_punto");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
