
package net.mcreator.igdamod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.igdamod.itemgroup.IGDAItemGroup;
import net.mcreator.igdamod.IgdamodModElements;

import java.util.List;
import java.util.Collections;

@IgdamodModElements.ModElement.Tag
public class PointsBrickBlock extends IgdamodModElements.ModElement {
	@ObjectHolder("igdamod:points_brick")
	public static final Block block = null;
	public PointsBrickBlock(IgdamodModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(IGDAItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(0.3f, 30f).setLightLevel(s -> 15)
					.harvestLevel(-1).harvestTool(ToolType.PICKAXE).setRequiresTool().setNeedsPostProcessing((bs, br, bp) -> true)
					.setEmmisiveRendering((bs, br, bp) -> true));
			setRegistryName("points_brick");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public boolean canProvidePower(BlockState state) {
			return true;
		}

		@Override
		public int getWeakPower(BlockState blockstate, IBlockReader blockAccess, BlockPos pos, Direction side) {
			return 8;
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.YELLOW;
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
