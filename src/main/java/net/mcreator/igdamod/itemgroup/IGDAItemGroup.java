
package net.mcreator.igdamod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.igdamod.item.IGDApowderItem;
import net.mcreator.igdamod.IgdamodModElements;

@IgdamodModElements.ModElement.Tag
public class IGDAItemGroup extends IgdamodModElements.ModElement {
	public IGDAItemGroup(IgdamodModElements instance) {
		super(instance, 81);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabigda") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(IGDApowderItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
