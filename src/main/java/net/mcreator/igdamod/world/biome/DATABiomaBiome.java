
package net.mcreator.igdamod.world.biome;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;

import net.mcreator.igdamod.block.DATABlockBlock;
import net.mcreator.igdamod.IgdamodModElements;

@IgdamodModElements.ModElement.Tag
public class DATABiomaBiome extends IgdamodModElements.ModElement {
	public static Biome biome;
	public DATABiomaBiome(IgdamodModElements instance) {
		super(instance, 172);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-16638972).setWaterColor(-2888725).setWaterFogColor(-2888725)
						.withSkyColor(-16638972).withFoliageColor(-15508131).withGrassColor(-14847894).build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder()
						.withSurfaceBuilder(SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(DATABlockBlock.block.getDefaultState(),
								DATABlockBlock.block.getDefaultState(), DATABlockBlock.block.getDefaultState())));
				DefaultBiomeFeatures.withCavesAndCanyons(biomeGenerationSettings);
				DefaultBiomeFeatures.withOverworldOres(biomeGenerationSettings);
				DefaultBiomeFeatures.withFossils(biomeGenerationSettings);
				DefaultBiomeFeatures.withLavaAndWaterLakes(biomeGenerationSettings);
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				biome = new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.NONE).depth(0f).scale(0.1f).temperature(0.6f)
						.downfall(0.9f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("igdamod:data_bioma"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
