
package net.mcreator.igdamod.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@IgdamodModElements.ModElement.Tag
public class IGDAbricksBlock extends IgdamodModElements.ModElement {

	@ObjectHolder("igdamod:igd_abricks")
	public static final Block block = null;

	public IGDAbricksBlock(IgdamodModElements instance) {
		super(instance, 178);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(IGDAItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1.5f, 16f).setLightLevel(s -> 2).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE).setRequiresTool().setNeedsPostProcessing((bs, br, bp) -> true)
					.setEmmisiveRendering((bs, br, bp) -> true));

			setRegistryName("igd_abricks");
		}

		@Override
		public float[] getBeaconColorMultiplier(BlockState state, IWorldReader world, BlockPos pos, BlockPos beaconPos) {
			return new float[]{0.913725490196f, 0.56862745098f, 0.423529411765f};
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
