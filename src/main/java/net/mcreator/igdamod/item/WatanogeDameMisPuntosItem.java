
package net.mcreator.igdamod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.igdamod.itemgroup.IGDAItemGroup;
import net.mcreator.igdamod.IgdamodModElements;

import java.util.List;

@IgdamodModElements.ModElement.Tag
public class WatanogeDameMisPuntosItem extends IgdamodModElements.ModElement {
	@ObjectHolder("igdamod:watanoge_dame_mis_puntos")
	public static final Item block = null;
	public WatanogeDameMisPuntosItem(IgdamodModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, IgdamodModElements.sounds.get(new ResourceLocation("igdamod:damemispuntosextended")),
					new Item.Properties().group(IGDAItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("watanoge_dame_mis_puntos");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Sos sleider"));
			list.add(new StringTextComponent("catasi o jolumorsan"));
		}
	}
}
