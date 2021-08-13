
package net.mcreator.igdamod.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@IgdamodModElements.ModElement.Tag
public class BoulderBricksWallBlock extends IgdamodModElements.ModElement {

	@ObjectHolder("igdamod:boulder_bricks_wall")
	public static final Block block = null;

	public BoulderBricksWallBlock(IgdamodModElements instance) {
		super(instance, 188);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(IGDAItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends WallBlock {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2f, 10f).setLightLevel(s -> 0).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).setRequiresTool().speedFactor(0.9f));

			setRegistryName("boulder_bricks_wall");
		}

		private static final VoxelShape CENTER_POLE_SHAPE = Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);
		private static final VoxelShape WALL_CONNECTION_NORTH_SIDE_SHAPE = Block.makeCuboidShape(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 9.0D);
		private static final VoxelShape WALL_CONNECTION_SOUTH_SIDE_SHAPE = Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 16.0D);
		private static final VoxelShape WALL_CONNECTION_WEST_SIDE_SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);
		private static final VoxelShape WALL_CONNECTION_EAST_SIDE_SHAPE = Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);

		private boolean shouldConnect(BlockState state, boolean checkattach, Direction face) {
			boolean flag = state.getBlock() instanceof WallBlock
					|| state.getBlock() instanceof FenceGateBlock && FenceGateBlock.isParallel(state, face);
			return !cannotAttach(state.getBlock()) && checkattach || flag;
		}

		@Override /* failed to load code for net.minecraft.block.WallBlock */
		@Override /* failed to load code for net.minecraft.block.WallBlock */
		/* failed to load code for net.minecraft.block.WallBlock */
		/* failed to load code for net.minecraft.block.WallBlock */
		/* failed to load code for net.minecraft.block.WallBlock */
		/* failed to load code for net.minecraft.block.WallBlock */
		/* failed to load code for net.minecraft.block.WallBlock */
		/* failed to load code for net.minecraft.block.WallBlock */

		private static boolean hasHeightForProperty(BlockState state, Property<WallHeight> heightProperty) {
			return state.get(heightProperty) != WallHeight.NONE;
		}

		private static boolean compareShapes(VoxelShape shape1, VoxelShape shape2) {
			return !VoxelShapes.compare(shape2, shape1, IBooleanFunction.ONLY_FIRST);
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
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
