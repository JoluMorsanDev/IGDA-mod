
package net.mcreator.igdamod.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@IgdamodModElements.ModElement.Tag
public class BoulderBricksSlabsBlock extends IgdamodModElements.ModElement {

	@ObjectHolder("igdamod:boulder_bricks_slabs")
	public static final Block block = null;

	public BoulderBricksSlabsBlock(IgdamodModElements instance) {
		super(instance, 187);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(IGDAItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends SlabBlock {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2f, 10f).setLightLevel(s -> 0).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).setRequiresTool().speedFactor(0.9f));

			setRegistryName("boulder_bricks_slabs");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.STONE;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, state.get(TYPE) == SlabType.DOUBLE ? 2 : 1));
		}

	}

}
