
package net.mcreator.igdamod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.igdamod.itemgroup.IGDAItemGroup;
import net.mcreator.igdamod.IgdamodModElements;

import java.util.List;
import java.util.Collections;

@IgdamodModElements.ModElement.Tag
public class DATABlockBlock extends IgdamodModElements.ModElement {
	@ObjectHolder("igdamod:data_block")
	public static final Block block = null;
	public DATABlockBlock(IgdamodModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(IGDAItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2f, 0.6f).setLightLevel(s -> 1).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("data_block");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
