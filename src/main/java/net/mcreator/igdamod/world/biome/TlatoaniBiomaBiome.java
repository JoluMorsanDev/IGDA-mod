
package net.mcreator.igdamod.world.biome;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;

import net.mcreator.igdamod.block.TlatoaniBlockBlock;
import net.mcreator.igdamod.IgdamodModElements;

@IgdamodModElements.ModElement.Tag
public class TlatoaniBiomaBiome extends IgdamodModElements.ModElement {
	public static Biome biome;
	public TlatoaniBiomaBiome(IgdamodModElements instance) {
		super(instance, 164);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-1).setWaterColor(-1).setWaterFogColor(-1).withSkyColor(-1)
						.withFoliageColor(-1).withGrassColor(-1).build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder()
						.withSurfaceBuilder(SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(TlatoaniBlockBlock.block.getDefaultState(),
								TlatoaniBlockBlock.block.getDefaultState(), TlatoaniBlockBlock.block.getDefaultState())));
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				biome = new Biome.Builder().precipitation(Biome.RainType.NONE).category(Biome.Category.NONE).depth(0.2f).scale(0.3f).temperature(2f)
						.downfall(0f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("igdamod:tlatoani_bioma"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
