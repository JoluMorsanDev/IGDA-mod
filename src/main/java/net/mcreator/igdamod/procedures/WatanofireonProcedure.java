package net.mcreator.igdamod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.igdamod.item.WatanodimensionItem;
import net.mcreator.igdamod.item.CataxisDimensionItem;
import net.mcreator.igdamod.item.AngekDimensionItem;
import net.mcreator.igdamod.block.WatanoFireBlock;
import net.mcreator.igdamod.block.IGDAblockBlock;
import net.mcreator.igdamod.block.CataxisFireBlock;
import net.mcreator.igdamod.block.AngekFireBlock;
import net.mcreator.igdamod.IgdamodMod;

import java.util.Map;
import java.util.HashMap;

public class WatanofireonProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
			PlayerEntity entity = event.getPlayer();
			if (event.getHand() != entity.getActiveHand()) {
				return;
			}
			double i = event.getPos().getX();
			double j = event.getPos().getY();
			double k = event.getPos().getZ();
			IWorld world = event.getWorld();
			BlockState state = world.getBlockState(event.getPos());
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("direction", event.getFace());
			dependencies.put("blockstate", state);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				IgdamodMod.LOGGER.warn("Failed to load dependency entity for procedure Watanofireon!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				IgdamodMod.LOGGER.warn("Failed to load dependency x for procedure Watanofireon!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				IgdamodMod.LOGGER.warn("Failed to load dependency y for procedure Watanofireon!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				IgdamodMod.LOGGER.warn("Failed to load dependency z for procedure Watanofireon!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				IgdamodMod.LOGGER.warn("Failed to load dependency world for procedure Watanofireon!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == WatanodimensionItem.block)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR)
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.VOID_AIR)
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.CAVE_AIR))))
				&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == IGDAblockBlock.block)))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), WatanoFireBlock.block.getDefaultState(), 3);
		}
		if ((((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == CataxisDimensionItem.block)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR)
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.VOID_AIR)
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.CAVE_AIR))))
				&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == IGDAblockBlock.block)))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), CataxisFireBlock.block.getDefaultState(), 3);
		}
		if ((((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == AngekDimensionItem.block)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR)
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.VOID_AIR)
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.CAVE_AIR))))
				&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == IGDAblockBlock.block)))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), AngekFireBlock.block.getDefaultState(), 3);
		}
	}
}
