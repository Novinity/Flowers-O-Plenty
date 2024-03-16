package io.github.novinity.flowersoplenty;

import com.mojang.logging.LogUtils;
import io.github.novinity.flowersoplenty.init.ModBlocks;
import io.github.novinity.flowersoplenty.init.CreativeTabInit;
import io.github.novinity.flowersoplenty.init.ItemInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(FlowersOPlenty.MODID)
public class FlowersOPlenty {
    public static final String MODID = "flowersoplenty";
    private static final Logger LOGGER = LogUtils.getLogger();

    public FlowersOPlenty() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        ItemInit.BLOCK_ITEMS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        CreativeTabInit.TABS.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ModBlocks.BLOCKS.getEntries().forEach(block -> {
            ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout());
        });
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.RED_GERANIUM.getId(), ModBlocks.POTTED_RED_GERANIUM);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.RED_POPPY.getId(), ModBlocks.POTTED_RED_POPPY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.RED_CLOVER.getId(), ModBlocks.POTTED_RED_CLOVER);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.RED_FREESIA.getId(), ModBlocks.POTTED_RED_FREESIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.LANTANA.getId(), ModBlocks.POTTED_LANTANA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.SUNNY_ZINNIA.getId(), ModBlocks.POTTED_SUNNY_ZINNIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.STRIPED_ZINNIA.getId(), ModBlocks.POTTED_STRIPED_ZINNIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.MIXED_ZINNIA.getId(), ModBlocks.POTTED_MIXED_ZINNIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.DAHLIA.getId(), ModBlocks.POTTED_DAHLIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.ORANGE_FREESIA.getId(), ModBlocks.POTTED_ORANGE_FREESIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.NASTURTIUM.getId(), ModBlocks.POTTED_NASTURTIUM);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.STICKY_MONKEY.getId(), ModBlocks.POTTED_STICKY_MONKEY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.ORANGE_DAY_LILY.getId(), ModBlocks.POTTED_ORANGE_DAY_LILY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.DAY_LILY.getId(), ModBlocks.POTTED_DAY_LILY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CALIFORNIA_POPPY.getId(), ModBlocks.POTTED_CALIFORNIA_POPPY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.ORANGE_COSMOS.getId(), ModBlocks.POTTED_ORANGE_COSMOS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.ORANGE_LUPIN.getId(), ModBlocks.POTTED_ORANGE_LUPIN);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.LADY_SLIPPER_ORCHID.getId(), ModBlocks.POTTED_LADY_SLIPPER_ORCHID);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_COSMOS.getId(), ModBlocks.POTTED_YELLOW_COSMOS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_CROCUS.getId(), ModBlocks.POTTED_YELLOW_CROCUS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_FREESIA.getId(), ModBlocks.POTTED_YELLOW_FREESIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CORYDALIS.getId(), ModBlocks.POTTED_CORYDALIS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_LUPIN.getId(), ModBlocks.POTTED_YELLOW_LUPIN);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.GOLDEN_BEAN.getId(), ModBlocks.POTTED_GOLDEN_BEAN);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CROCUS_MIX.getId(), ModBlocks.POTTED_CROCUS_MIX);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_DAFFODIL.getId(), ModBlocks.POTTED_YELLOW_DAFFODIL);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_DAFFODIL.getId(), ModBlocks.POTTED_WHITE_DAFFODIL);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.NARCISSUS.getId(), ModBlocks.POTTED_NARCISSUS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PANSY.getId(), ModBlocks.POTTED_PANSY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CLOUD_BLUE_CORYDALIS.getId(), ModBlocks.POTTED_CLOUD_BLUE_CORYDALIS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CYAN_HYACINTH.getId(), ModBlocks.POTTED_CYAN_HYACINTH);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT.getId(), ModBlocks.POTTED_LIGHT_BLUE_FORGET_ME_NOT);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.FORGET_ME_NOT.getId(), ModBlocks.POTTED_FORGET_ME_NOT);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.LIGHT_BLUE_LOBELIA.getId(), ModBlocks.POTTED_LIGHT_BLUE_LOBELIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.MEDIUM_BLUE_LOBELIA.getId(), ModBlocks.POTTED_MEDIUM_BLUE_LOBELIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.ROYAL_BLUE_LOBELIA.getId(), ModBlocks.POTTED_ROYAL_BLUE_LOBELIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.MORNING_GLORY.getId(), ModBlocks.POTTED_MORNING_GLORY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BACHELOR_BUTTON.getId(), ModBlocks.POTTED_BACHELOR_BUTTON);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_BACHELOR_BUTTON.getId(), ModBlocks.POTTED_BLUE_BACHELOR_BUTTON);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_BELL_BACHELOR_BUTTON.getId(), ModBlocks.POTTED_BLUE_BELL_BACHELOR_BUTTON);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BORAGE.getId(), ModBlocks.POTTED_BORAGE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.DARK_BLUE_BORAGE.getId(), ModBlocks.POTTED_DARK_BLUE_BORAGE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.COMMELINA.getId(), ModBlocks.POTTED_COMMELINA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.GRAPE_HYACINTH.getId(), ModBlocks.POTTED_GRAPE_HYACINTH);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.VIRGINIA_COWSLIP.getId(), ModBlocks.POTTED_VIRGINIA_COWSLIP);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PERIWINKLE.getId(), ModBlocks.POTTED_PERIWINKLE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.COMMON_PERIWINKLE.getId(), ModBlocks.POTTED_COMMON_PERIWINKLE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CLOUD_SAGE.getId(), ModBlocks.POTTED_CLOUD_SAGE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_CROCUS.getId(), ModBlocks.POTTED_PURPLE_CROCUS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PEPPERMINT.getId(), ModBlocks.POTTED_PEPPERMINT);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PARROT_FLOWER.getId(), ModBlocks.POTTED_PARROT_FLOWER);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BIRDS_EYE_GILIA.getId(), ModBlocks.POTTED_BIRDS_EYE_GILIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.AFRICAN_DAISY.getId(), ModBlocks.POTTED_AFRICAN_DAISY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.WOLFS_BANE.getId(), ModBlocks.POTTED_WOLFS_BANE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_LUPIN.getId(), ModBlocks.POTTED_PURPLE_LUPIN);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PANSY_PURPLE.getId(), ModBlocks.POTTED_PANSY_PURPLE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.VIOLET.getId(), ModBlocks.POTTED_VIOLET);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.SALVIA.getId(), ModBlocks.POTTED_SALVIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_MAGENTA_SALVIA.getId(), ModBlocks.POTTED_PURPLE_MAGENTA_SALVIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.MEXICAN_SAGE.getId(), ModBlocks.POTTED_MEXICAN_SAGE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_CALLA_LILY.getId(), ModBlocks.POTTED_PURPLE_CALLA_LILY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_AFRICAN_DAISY.getId(), ModBlocks.POTTED_PURPLE_AFRICAN_DAISY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.MAROON_MALLOW.getId(), ModBlocks.POTTED_MAROON_MALLOW);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_PETTICOAT.getId(), ModBlocks.POTTED_PINK_PETTICOAT);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PITCHER_PLANT.getId(), ModBlocks.POTTED_PITCHER_PLANT);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.VENUS_FLY_TRAP.getId(), ModBlocks.POTTED_VENUS_FLY_TRAP);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.MAGENTA_ZINNIA.getId(), ModBlocks.POTTED_MAGENTA_ZINNIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.FUCHSIA.getId(), ModBlocks.POTTED_FUCHSIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.FUCHSIA_SMALL.getId(), ModBlocks.POTTED_FUCHSIA_SMALL);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.MAGENTA_CLOVER.getId(), ModBlocks.POTTED_MAGENTA_CLOVER);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_CLOVER.getId(), ModBlocks.POTTED_PINK_CLOVER);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_GERANIUM.getId(), ModBlocks.POTTED_PINK_GERANIUM);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.ECHINACEA.getId(), ModBlocks.POTTED_ECHINACEA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.LIGHT_PINK_GERANIUM.getId(), ModBlocks.POTTED_LIGHT_PINK_GERANIUM);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BLEEDING_HEART.getId(), ModBlocks.POTTED_BLEEDING_HEART);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.NASTURTIUM_PINK.getId(), ModBlocks.POTTED_NASTURTIUM_PINK);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CLOVER_FLOWERS.getId(), ModBlocks.POTTED_CLOVER_FLOWERS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.SNAPDRAGON_PINK.getId(), ModBlocks.POTTED_SNAPDRAGON_PINK);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BANEBERRY.getId(), ModBlocks.POTTED_BANEBERRY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.COSMOS_MIX.getId(), ModBlocks.POTTED_COSMOS_MIX);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.COSMOS.getId(), ModBlocks.POTTED_COSMOS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.MAGENTA_ORCHID.getId(), ModBlocks.POTTED_MAGENTA_ORCHID);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CLOVER_LEAVES.getId(), ModBlocks.POTTED_CLOVER_LEAVES);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.SNAPDRAGON_WHITE.getId(), ModBlocks.POTTED_SNAPDRAGON_WHITE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.LILY_OF_THE_VALLEY.getId(), ModBlocks.POTTED_LILY_OF_THE_VALLEY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CALLA_LILY.getId(), ModBlocks.POTTED_CALLA_LILY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CHRYSANTHENUM.getId(), ModBlocks.POTTED_CHRYSANTHENUM);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.LEWISIA.getId(), ModBlocks.POTTED_LEWISIA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.AUSTRALIAN_CORNFLOWER.getId(), ModBlocks.POTTED_AUSTRALIAN_CORNFLOWER);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.ALBUCA_NAMAQUENSIS.getId(), ModBlocks.POTTED_ALBUCA_NAMAQUENSIS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CACTUS.getId(), ModBlocks.POTTED_CACTUS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PARODIA_MURICATA.getId(), ModBlocks.POTTED_PARODIA_MURICATA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_STARTHISTLE.getId(), ModBlocks.POTTED_YELLOW_STARTHISTLE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.AUSTRALIAN_FLAME_PEA.getId(), ModBlocks.POTTED_AUSTRALIAN_FLAME_PEA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.ORANGE_AUSTRALIAN_FLAME_PEA.getId(), ModBlocks.POTTED_ORANGE_AUSTRALIAN_FLAME_PEA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.DESERT_PAINTBRUSH.getId(), ModBlocks.POTTED_DESERT_PAINTBRUSH);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.DESERT_STURT_PEA.getId(), ModBlocks.POTTED_DESERT_STURT_PEA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_TINSEL_LILY.getId(), ModBlocks.POTTED_BLUE_TINSEL_LILY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.NOTCH_LEAF_SCORPION_WEED.getId(), ModBlocks.POTTED_NOTCH_LEAF_SCORPION_WEED);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_FLAG.getId(), ModBlocks.POTTED_PURPLE_FLAG);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.OWLS_CLOVER.getId(), ModBlocks.POTTED_OWLS_CLOVER);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.DESERT_SAND_VERBENA.getId(), ModBlocks.POTTED_DESERT_SAND_VERBENA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_DESERT_SAND_VERBENA.getId(), ModBlocks.POTTED_PINK_DESERT_SAND_VERBENA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS.getId(), ModBlocks.POTTED_ENGELMANNS_HEDGEHOG_CACTUS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.DEVILS_CLAW.getId(), ModBlocks.POTTED_DEVILS_CLAW);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.TUMBLE_WEED.getId(), ModBlocks.POTTED_TUMBLE_WEED);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_TINSEL_FLOWER.getId(), ModBlocks.POTTED_WHITE_TINSEL_FLOWER);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.YUCCA.getId(), ModBlocks.POTTED_YUCCA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BABY_BLUE_EYES.getId(), ModBlocks.POTTED_BABY_BLUE_EYES);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BABY_BLUE_EYES_SMALL.getId(), ModBlocks.POTTED_BABY_BLUE_EYES_SMALL);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BEACH_GRASS.getId(), ModBlocks.POTTED_BEACH_GRASS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.LIVE_FOREVER_LEAVES.getId(), ModBlocks.POTTED_LIVE_FOREVER_LEAVES);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.LIVE_FOREVER.getId(), ModBlocks.POTTED_LIVE_FOREVER);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.COASTAL_LOTUS.getId(), ModBlocks.POTTED_COASTAL_LOTUS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.SILVER_CARPET.getId(), ModBlocks.POTTED_SILVER_CARPET);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BEACH_STRAWBERRY.getId(), ModBlocks.POTTED_BEACH_STRAWBERRY);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CINQUEFOIL.getId(), ModBlocks.POTTED_CINQUEFOIL);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CALIFORNIA_SEA_THRIFT.getId(), ModBlocks.POTTED_CALIFORNIA_SEA_THRIFT);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_EYED_GRASS.getId(), ModBlocks.POTTED_BLUE_EYED_GRASS);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CREEPING_THYME.getId(), ModBlocks.POTTED_CREEPING_THYME);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.WOOLY_THYME.getId(), ModBlocks.POTTED_WOOLY_THYME);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BUCKWHEAT.getId(), ModBlocks.POTTED_BUCKWHEAT);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.ROCK_ROSE.getId(), ModBlocks.POTTED_ROCK_ROSE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.ROCK_ROSE_ORCHID.getId(), ModBlocks.POTTED_ROCK_ROSE_ORCHID);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BUCKWHEAT_RED.getId(), ModBlocks.POTTED_BUCKWHEAT_RED);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.JEWEL_OF_THE_DESERT.getId(), ModBlocks.POTTED_JEWEL_OF_THE_DESERT);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BASKET_STINKHORN.getId(), ModBlocks.POTTED_BASKET_STINKHORN);
        });
    }
}