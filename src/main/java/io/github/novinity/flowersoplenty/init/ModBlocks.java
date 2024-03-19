package io.github.novinity.flowersoplenty.init;

import io.github.novinity.flowersoplenty.FlowersOPlenty;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FlowersOPlenty.MODID);

    // RED
    public static final RegistryObject<FlowerBlock> RED_GERANIUM = BLOCKS.register("red_geranium", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> RED_POPPY = BLOCKS.register("red_poppy", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> RED_CLOVER = BLOCKS.register("red_clover", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> RED_FREESIA = BLOCKS.register("red_freesia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> LANTANA = BLOCKS.register("lantana", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    // ORANGE
    public static final RegistryObject<FlowerBlock> SUNNY_ZINNIA = BLOCKS.register("sunny_zinnia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> STRIPED_ZINNIA = BLOCKS.register("striped_zinnia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> MIXED_ZINNIA = BLOCKS.register("mixed_zinnia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> DAHLIA = BLOCKS.register("dahlia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> ORANGE_FREESIA = BLOCKS.register("orange_freesia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> NASTURTIUM = BLOCKS.register("nasturtium", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> STICKY_MONKEY = BLOCKS.register("sticky_monkey", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> ORANGE_DAY_LILY = BLOCKS.register("orange_day_lily", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> DAY_LILY = BLOCKS.register("day_lily", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> CALIFORNIA_POPPY = BLOCKS.register("california_poppy", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> ORANGE_COSMOS = BLOCKS.register("orange_cosmos", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> ORANGE_LUPIN = BLOCKS.register("orange_lupin", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> LADY_SLIPPER_ORCHID = BLOCKS.register("lady_slipper_orchid", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    // YELLOW
    public static final RegistryObject<FlowerBlock> YELLOW_COSMOS = BLOCKS.register("yellow_cosmos", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> YELLOW_CROCUS = BLOCKS.register("yellow_crocus", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> YELLOW_FREESIA = BLOCKS.register("yellow_freesia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> CORYDALIS = BLOCKS.register("corydalis", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> YELLOW_LUPIN = BLOCKS.register("yellow_lupin", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> GOLDEN_BEAN = BLOCKS.register("golden_bean", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> CROCUS_MIX = BLOCKS.register("crocus_mix", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> YELLOW_DAFFODIL = BLOCKS.register("yellow_daffodil", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> WHITE_DAFFODIL = BLOCKS.register("white_daffodil", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> NARCISSUS = BLOCKS.register("narcissus", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    // BLUE
    public static final RegistryObject<FlowerBlock> PANSY = BLOCKS.register("pansy", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> CLOUD_BLUE_CORYDALIS = BLOCKS.register("cloud_blue_corydalis", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> CYAN_HYACINTH = BLOCKS.register("cyan_hyacinth", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> LIGHT_BLUE_FORGET_ME_NOT = BLOCKS.register("light_blue_forget_me_not", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> FORGET_ME_NOT = BLOCKS.register("forget_me_not", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> LIGHT_BLUE_LOBELIA = BLOCKS.register("light_blue_lobelia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> MEDIUM_BLUE_LOBELIA = BLOCKS.register("medium_blue_lobelia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> ROYAL_BLUE_LOBELIA = BLOCKS.register("royal_blue_lobelia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> MORNING_GLORY = BLOCKS.register("morning_glory", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BACHELOR_BUTTON = BLOCKS.register("bachelor_button", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BLUE_BACHELOR_BUTTON = BLOCKS.register("blue_bachelor_button", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BLUE_BELL_BACHELOR_BUTTON = BLOCKS.register("blue_bell_bachelor_button", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BORAGE = BLOCKS.register("borage", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> DARK_BLUE_BORAGE = BLOCKS.register("dark_blue_borage", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> COMMELINA = BLOCKS.register("commelina", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> GRAPE_HYACINTH = BLOCKS.register("grape_hyacinth", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> VIRGINIA_COWSLIP = BLOCKS.register("virginia_cowslip", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));


    // PURPLE
    public static final RegistryObject<FlowerBlock> PERIWINKLE = BLOCKS.register("periwinkle", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> COMMON_PERIWINKLE = BLOCKS.register("common_periwinkle", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> CLOUD_SAGE = BLOCKS.register("cloud_sage", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PURPLE_CROCUS = BLOCKS.register("purple_crocus", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PEPPERMINT = BLOCKS.register("peppermint", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PARROT_FLOWER = BLOCKS.register("parrot_flower", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BIRDS_EYE_GILIA = BLOCKS.register("birds_eye_gilia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> AFRICAN_DAISY = BLOCKS.register("african_daisy", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<TallFlowerBlock> IRIS_FANCY_DRESS = BLOCKS.register("iris_fancy_dress", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<FlowerBlock> WOLFS_BANE = BLOCKS.register("wolfs_bane", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PURPLE_LUPIN = BLOCKS.register("purple_lupin", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PANSY_PURPLE = BLOCKS.register("pansy_purple", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> VIOLET = BLOCKS.register("violet", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> SALVIA = BLOCKS.register("salvia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PURPLE_MAGENTA_SALVIA = BLOCKS.register("purple_magenta_salvia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> MEXICAN_SAGE = BLOCKS.register("mexican_sage", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PURPLE_CALLA_LILY = BLOCKS.register("purple_calla_lily", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PURPLE_AFRICAN_DAISY = BLOCKS.register("purple_african_daisy", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    // PINK
    public static final RegistryObject<FlowerBlock> MAROON_MALLOW = BLOCKS.register("maroon_mallow", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PINK_PETTICOAT = BLOCKS.register("pink_petticoat", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PITCHER_PLANT = BLOCKS.register("pitcher_plant", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> VENUS_FLY_TRAP = BLOCKS.register("venus_fly_trap", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> MAGENTA_ZINNIA = BLOCKS.register("magenta_zinnia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> FUCHSIA = BLOCKS.register("fuchsia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> FUCHSIA_SMALL = BLOCKS.register("fuchsia_small", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> MAGENTA_CLOVER = BLOCKS.register("magenta_clover", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PINK_CLOVER = BLOCKS.register("pink_clover", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PINK_GERANIUM = BLOCKS.register("pink_geranium", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> ECHINACEA = BLOCKS.register("echinacea", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> LIGHT_PINK_GERANIUM = BLOCKS.register("light_pink_geranium", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BLEEDING_HEART = BLOCKS.register("bleeding_heart", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> NASTURTIUM_PINK = BLOCKS.register("nasturtium_pink", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<TallFlowerBlock> FLOWERING_CURRENT = BLOCKS.register("flowering_current", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<FlowerBlock> CLOVER_FLOWERS = BLOCKS.register("clover_flowers", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> SNAPDRAGON_PINK = BLOCKS.register("snapdragon_pink", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BANEBERRY = BLOCKS.register("baneberry", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> COSMOS_MIX = BLOCKS.register("cosmos_mix", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> COSMOS = BLOCKS.register("cosmos", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> MAGENTA_ORCHID = BLOCKS.register("magenta_orchid", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));


    // UNSORTED
    public static final RegistryObject<FlowerBlock> CLOVER_LEAVES = BLOCKS.register("clover_leaves", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> SNAPDRAGON_WHITE = BLOCKS.register("snapdragon_white", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> LILY_OF_THE_VALLEY = BLOCKS.register("lily_of_the_valley", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> CALLA_LILY = BLOCKS.register("calla_lily", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> CHRYSANTHENUM = BLOCKS.register("chrysanthenum", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> LEWISIA = BLOCKS.register("lewisia", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<TallFlowerBlock> GLORIOSA_LILY = BLOCKS.register("gloriosa_lily", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> CAPE_ALOE = BLOCKS.register("cape_aloe", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> RED_SUNFLOWER = BLOCKS.register("red_sunflower", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> PARADOX_SUNFLOWER = BLOCKS.register("paradox_sunflower", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> DRIED_SUNFLOWER = BLOCKS.register("dried_sunflower", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> SKYSCRAPER_SUNFLOWER = BLOCKS.register("skyscraper_sunflower", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> SUNDANCE_KID_SUNFLOWER = BLOCKS.register("sundance_kid_sunflower", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> TEDDY_BEAR_SUNFLOWER = BLOCKS.register("teddy_bear_sunflower", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> TALL_ORANGE_COSMOS = BLOCKS.register("tall_orange_cosmos", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> ORANGE_GLADIOLA = BLOCKS.register("orange_gladiola", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> PEACH_GLADIOLA = BLOCKS.register("peach_gladiola", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> GLADIOLA = BLOCKS.register("gladiola", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> CRIMSON_GLADIOLA = BLOCKS.register("crimson_gladiola", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> QUINCE = BLOCKS.register("quince", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> HAWTHORNE = BLOCKS.register("hawthorne", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> ORNAMENTAL_CHERRY = BLOCKS.register("ornamental_cherry", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> DATURA = BLOCKS.register("datura", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> MANZANITA_BUSH = BLOCKS.register("manzanita_bush", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> IRIS = BLOCKS.register("iris", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> TALL_LUPIN = BLOCKS.register("tall_lupin", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> PURPLE_SWEET_PEAS = BLOCKS.register("purple_sweet_peas", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> DARK_BLUE_SWEET_PEAS = BLOCKS.register("dark_blue_sweet_peas", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> BLUE_BELL_SWEET_PEAS = BLOCKS.register("blue_bell_sweet_peas", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> MIXED_PINK_SWEET_PEAS = BLOCKS.register("mixed_pink_sweet_peas", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> MAGENTA_SWEET_PEAS = BLOCKS.register("magenta_sweet_peas", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> BRIGHT_MAGENTA_SWEET_PEAS = BLOCKS.register("bright_magenta_sweet_peas", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> TALL_COSMOS = BLOCKS.register("tall_cosmos", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> MENDOCINO_POPPY = BLOCKS.register("mendocino_poppy", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> TALL_CALLA_LILY = BLOCKS.register("tall_calla_lily", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> WHITE_LARKSPUR = BLOCKS.register("white_larkspur", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> LAVENDER_LARKSPUR = BLOCKS.register("lavender_larkspur", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> LARKSPUR = BLOCKS.register("larkspur", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> PURPLE_LARKSPUR = BLOCKS.register("purple_larkspur", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> MAGENTA_LARKSPUR = BLOCKS.register("magenta_larkspur", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> PINK_LARKSPUR = BLOCKS.register("pink_larkspur", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> LIGHT_PINK_LARKSPUR = BLOCKS.register("light_pink_larkspur", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> HIMALAYAN_BLUE_POPPY = BLOCKS.register("himalayan_blue_poppy", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<FlowerBlock> AUSTRALIAN_CORNFLOWER = BLOCKS.register("australian_cornflower", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> ALBUCA_NAMAQUENSIS = BLOCKS.register("albuca_namaquensis", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> CACTUS = BLOCKS.register("cactus", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PARODIA_MURICATA = BLOCKS.register("parodia_muricata", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> YELLOW_STARTHISTLE = BLOCKS.register("yellow_starthistle", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> AUSTRALIAN_FLAME_PEA = BLOCKS.register("australian_flame_pea", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> ORANGE_AUSTRALIAN_FLAME_PEA = BLOCKS.register("orange_australian_flame_pea", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> DESERT_PAINTBRUSH = BLOCKS.register("desert_paintbrush", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> DESERT_STURT_PEA = BLOCKS.register("desert_sturt_pea", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BLUE_TINSEL_LILY = BLOCKS.register("blue_tinsel_lily", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<TallFlowerBlock> MOJAVE_INDIGO_BUSH = BLOCKS.register("mojave_indigo_bush", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<FlowerBlock> NOTCH_LEAF_SCORPION_WEED = BLOCKS.register("notch_leaf_scorpion_weed", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PURPLE_FLAG = BLOCKS.register("purple_flag", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> OWLS_CLOVER = BLOCKS.register("owls_clover", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> DESERT_SAND_VERBENA = BLOCKS.register("desert_sand_verbena", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> PINK_DESERT_SAND_VERBENA = BLOCKS.register("pink_desert_sand_verbena", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> ENGELMANNS_HEDGEHOG_CACTUS = BLOCKS.register("engelmanns_hedgehog_cactus", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> DEVILS_CLAW = BLOCKS.register("devils_claw", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> TUMBLE_WEED = BLOCKS.register("tumble_weed", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<TallFlowerBlock> DRY_SHRUB = BLOCKS.register("dry_shrub", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<FlowerBlock> WHITE_TINSEL_FLOWER = BLOCKS.register("white_tinsel_flower", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<TallFlowerBlock> YUCCA_FLOWER = BLOCKS.register("yucca_flower", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<FlowerBlock> YUCCA = BLOCKS.register("yucca", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<TallFlowerBlock> OCOTILLO = BLOCKS.register("ocotillo", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<TallFlowerBlock> TALL_CACTUS = BLOCKS.register("tall_cactus", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<FlowerBlock> BABY_BLUE_EYES = BLOCKS.register("baby_blue_eyes", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BABY_BLUE_EYES_SMALL = BLOCKS.register("baby_blue_eyes_small", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BEACH_GRASS = BLOCKS.register("beach_grass", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> LIVE_FOREVER_LEAVES = BLOCKS.register("live_forever_leaves", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> LIVE_FOREVER = BLOCKS.register("live_forever", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> COASTAL_LOTUS = BLOCKS.register("coastal_lotus", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> SILVER_CARPET = BLOCKS.register("silver_carpet", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BEACH_STRAWBERRY = BLOCKS.register("beach_strawberry", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> CINQUEFOIL = BLOCKS.register("cinquefoil", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> CALIFORNIA_SEA_THRIFT = BLOCKS.register("california_sea_thrift", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BLUE_EYED_GRASS = BLOCKS.register("blue_eyed_grass", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> CREEPING_THYME = BLOCKS.register("creeping_thyme", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> WOOLY_THYME = BLOCKS.register("wooly_thyme", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BUCKWHEAT = BLOCKS.register("buckwheat", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> ROCK_ROSE = BLOCKS.register("rock_rose", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> ROCK_ROSE_ORCHID = BLOCKS.register("rock_rose_orchid", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BUCKWHEAT_RED = BLOCKS.register("buckwheat_red", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> JEWEL_OF_THE_DESERT = BLOCKS.register("jewel_of_the_desert", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<FlowerBlock> BASKET_STINKHORN = BLOCKS.register("basket_stinkhorn", () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> POTTED_RED_GERANIUM = BLOCKS.register("potted_red_geranium",
            () -> new FlowerPotBlock(ModBlocks.RED_GERANIUM.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> POTTED_RED_POPPY = BLOCKS.register("potted_red_poppy",
            () -> new FlowerPotBlock(ModBlocks.RED_POPPY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_RED_CLOVER = BLOCKS.register("potted_red_clover",
            () -> new FlowerPotBlock(ModBlocks.RED_CLOVER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_RED_FREESIA = BLOCKS.register("potted_red_freesia",
            () -> new FlowerPotBlock(ModBlocks.RED_FREESIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LANTANA = BLOCKS.register("potted_lantana",
            () -> new FlowerPotBlock(ModBlocks.LANTANA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SUNNY_ZINNIA = BLOCKS.register("potted_sunny_zinnia",
            () -> new FlowerPotBlock(ModBlocks.SUNNY_ZINNIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_STRIPED_ZINNIA = BLOCKS.register("potted_striped_zinnia",
            () -> new FlowerPotBlock(ModBlocks.STRIPED_ZINNIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MIXED_ZINNIA = BLOCKS.register("potted_mixed_zinnia",
            () -> new FlowerPotBlock(ModBlocks.MIXED_ZINNIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_DAHLIA = BLOCKS.register("potted_dahlia",
            () -> new FlowerPotBlock(ModBlocks.DAHLIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORANGE_FREESIA = BLOCKS.register("potted_orange_freesia",
            () -> new FlowerPotBlock(ModBlocks.ORANGE_FREESIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_NASTURTIUM = BLOCKS.register("potted_nasturtium",
            () -> new FlowerPotBlock(ModBlocks.NASTURTIUM.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_STICKY_MONKEY = BLOCKS.register("potted_sticky_monkey",
            () -> new FlowerPotBlock(ModBlocks.STICKY_MONKEY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORANGE_DAY_LILY = BLOCKS.register("potted_orange_day_lily",
            () -> new FlowerPotBlock(ModBlocks.ORANGE_DAY_LILY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_DAY_LILY = BLOCKS.register("potted_day_lily",
            () -> new FlowerPotBlock(ModBlocks.DAY_LILY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CALIFORNIA_POPPY = BLOCKS.register("potted_california_poppy",
            () -> new FlowerPotBlock(ModBlocks.CALIFORNIA_POPPY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORANGE_COSMOS = BLOCKS.register("potted_orange_cosmos",
            () -> new FlowerPotBlock(ModBlocks.ORANGE_COSMOS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORANGE_LUPIN = BLOCKS.register("potted_orange_lupin",
            () -> new FlowerPotBlock(ModBlocks.ORANGE_LUPIN.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LADY_SLIPPER_ORCHID = BLOCKS.register("potted_lady_slipper_orchid",
            () -> new FlowerPotBlock(ModBlocks.LADY_SLIPPER_ORCHID.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_YELLOW_COSMOS = BLOCKS.register("potted_yellow_cosmos",
            () -> new FlowerPotBlock(ModBlocks.YELLOW_COSMOS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_YELLOW_CROCUS = BLOCKS.register("potted_yellow_crocus",
            () -> new FlowerPotBlock(ModBlocks.YELLOW_CROCUS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_YELLOW_FREESIA = BLOCKS.register("potted_yellow_freesia",
            () -> new FlowerPotBlock(ModBlocks.YELLOW_FREESIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CORYDALIS = BLOCKS.register("potted_corydalis",
            () -> new FlowerPotBlock(ModBlocks.CORYDALIS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_YELLOW_LUPIN = BLOCKS.register("potted_yellow_lupin",
            () -> new FlowerPotBlock(ModBlocks.YELLOW_LUPIN.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_GOLDEN_BEAN = BLOCKS.register("potted_golden_bean",
            () -> new FlowerPotBlock(ModBlocks.GOLDEN_BEAN.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CROCUS_MIX = BLOCKS.register("potted_crocus_mix",
            () -> new FlowerPotBlock(ModBlocks.CROCUS_MIX.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_YELLOW_DAFFODIL = BLOCKS.register("potted_yellow_daffodil",
            () -> new FlowerPotBlock(ModBlocks.YELLOW_DAFFODIL.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_WHITE_DAFFODIL = BLOCKS.register("potted_white_daffodil",
            () -> new FlowerPotBlock(ModBlocks.WHITE_DAFFODIL.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_NARCISSUS = BLOCKS.register("potted_narcissus",
            () -> new FlowerPotBlock(ModBlocks.NARCISSUS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PANSY = BLOCKS.register("potted_pansy",
            () -> new FlowerPotBlock(ModBlocks.PANSY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CLOUD_BLUE_CORYDALIS = BLOCKS.register("potted_cloud_blue_corydalis",
            () -> new FlowerPotBlock(ModBlocks.CLOUD_BLUE_CORYDALIS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CYAN_HYACINTH = BLOCKS.register("potted_cyan_hyacinth",
            () -> new FlowerPotBlock(ModBlocks.CYAN_HYACINTH.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LIGHT_BLUE_FORGET_ME_NOT = BLOCKS.register("potted_light_blue_forget_me_not",
            () -> new FlowerPotBlock(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_FORGET_ME_NOT = BLOCKS.register("potted_forget_me_not",
            () -> new FlowerPotBlock(ModBlocks.FORGET_ME_NOT.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LIGHT_BLUE_LOBELIA = BLOCKS.register("potted_light_blue_lobelia",
            () -> new FlowerPotBlock(ModBlocks.LIGHT_BLUE_LOBELIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MEDIUM_BLUE_LOBELIA = BLOCKS.register("potted_medium_blue_lobelia",
            () -> new FlowerPotBlock(ModBlocks.MEDIUM_BLUE_LOBELIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ROYAL_BLUE_LOBELIA = BLOCKS.register("potted_royal_blue_lobelia",
            () -> new FlowerPotBlock(ModBlocks.ROYAL_BLUE_LOBELIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MORNING_GLORY = BLOCKS.register("potted_morning_glory",
            () -> new FlowerPotBlock(ModBlocks.MORNING_GLORY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BACHELOR_BUTTON = BLOCKS.register("potted_bachelor_button",
            () -> new FlowerPotBlock(ModBlocks.BACHELOR_BUTTON.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLUE_BACHELOR_BUTTON = BLOCKS.register("potted_blue_bachelor_button",
            () -> new FlowerPotBlock(ModBlocks.BLUE_BACHELOR_BUTTON.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLUE_BELL_BACHELOR_BUTTON = BLOCKS.register("potted_blue_bell_bachelor_button",
            () -> new FlowerPotBlock(ModBlocks.BLUE_BELL_BACHELOR_BUTTON.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BORAGE = BLOCKS.register("potted_borage",
            () -> new FlowerPotBlock(ModBlocks.BORAGE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_DARK_BLUE_BORAGE = BLOCKS.register("potted_dark_blue_borage",
            () -> new FlowerPotBlock(ModBlocks.DARK_BLUE_BORAGE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_COMMELINA = BLOCKS.register("potted_commelina",
            () -> new FlowerPotBlock(ModBlocks.COMMELINA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_GRAPE_HYACINTH = BLOCKS.register("potted_grape_hyacinth",
            () -> new FlowerPotBlock(ModBlocks.GRAPE_HYACINTH.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_VIRGINIA_COWSLIP = BLOCKS.register("potted_virginia_cowslip",
            () -> new FlowerPotBlock(ModBlocks.VIRGINIA_COWSLIP.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PERIWINKLE = BLOCKS.register("potted_periwinkle",
            () -> new FlowerPotBlock(ModBlocks.PERIWINKLE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_COMMON_PERIWINKLE = BLOCKS.register("potted_common_periwinkle",
            () -> new FlowerPotBlock(ModBlocks.COMMON_PERIWINKLE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CLOUD_SAGE = BLOCKS.register("potted_cloud_sage",
            () -> new FlowerPotBlock(ModBlocks.CLOUD_SAGE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_CROCUS = BLOCKS.register("potted_purple_crocus",
            () -> new FlowerPotBlock(ModBlocks.PURPLE_CROCUS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PEPPERMINT = BLOCKS.register("potted_peppermint",
            () -> new FlowerPotBlock(ModBlocks.PEPPERMINT.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PARROT_FLOWER = BLOCKS.register("potted_parrot_flower",
            () -> new FlowerPotBlock(ModBlocks.PARROT_FLOWER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BIRDS_EYE_GILIA = BLOCKS.register("potted_birds_eye_gilia",
            () -> new FlowerPotBlock(ModBlocks.BIRDS_EYE_GILIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_AFRICAN_DAISY = BLOCKS.register("potted_african_daisy",
            () -> new FlowerPotBlock(ModBlocks.AFRICAN_DAISY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_WOLFS_BANE = BLOCKS.register("potted_wolfs_bane",
            () -> new FlowerPotBlock(ModBlocks.WOLFS_BANE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_LUPIN = BLOCKS.register("potted_purple_lupin",
            () -> new FlowerPotBlock(ModBlocks.PURPLE_LUPIN.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PANSY_PURPLE = BLOCKS.register("potted_pansy_purple",
            () -> new FlowerPotBlock(ModBlocks.PANSY_PURPLE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_VIOLET = BLOCKS.register("potted_violet",
            () -> new FlowerPotBlock(ModBlocks.VIOLET.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SALVIA = BLOCKS.register("potted_salvia",
            () -> new FlowerPotBlock(ModBlocks.SALVIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_MAGENTA_SALVIA = BLOCKS.register("potted_purple_magenta_salvia",
            () -> new FlowerPotBlock(ModBlocks.PURPLE_MAGENTA_SALVIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MEXICAN_SAGE = BLOCKS.register("potted_mexican_sage",
            () -> new FlowerPotBlock(ModBlocks.MEXICAN_SAGE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_CALLA_LILY = BLOCKS.register("potted_purple_calla_lily",
            () -> new FlowerPotBlock(ModBlocks.PURPLE_CALLA_LILY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_AFRICAN_DAISY = BLOCKS.register("potted_purple_african_daisy",
            () -> new FlowerPotBlock(ModBlocks.PURPLE_AFRICAN_DAISY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MAROON_MALLOW = BLOCKS.register("potted_maroon_mallow",
            () -> new FlowerPotBlock(ModBlocks.MAROON_MALLOW.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PINK_PETTICOAT = BLOCKS.register("potted_pink_petticoat",
            () -> new FlowerPotBlock(ModBlocks.PINK_PETTICOAT.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PITCHER_PLANT = BLOCKS.register("potted_pitcher_plant",
            () -> new FlowerPotBlock(ModBlocks.PITCHER_PLANT.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_VENUS_FLY_TRAP = BLOCKS.register("potted_venus_fly_trap",
            () -> new FlowerPotBlock(ModBlocks.VENUS_FLY_TRAP.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MAGENTA_ZINNIA = BLOCKS.register("potted_magenta_zinnia",
            () -> new FlowerPotBlock(ModBlocks.MAGENTA_ZINNIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_FUCHSIA = BLOCKS.register("potted_fuchsia",
            () -> new FlowerPotBlock(ModBlocks.FUCHSIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_FUCHSIA_SMALL = BLOCKS.register("potted_fuchsia_small",
            () -> new FlowerPotBlock(ModBlocks.FUCHSIA_SMALL.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MAGENTA_CLOVER = BLOCKS.register("potted_magenta_clover",
            () -> new FlowerPotBlock(ModBlocks.MAGENTA_CLOVER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PINK_CLOVER = BLOCKS.register("potted_pink_clover",
            () -> new FlowerPotBlock(ModBlocks.PINK_CLOVER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PINK_GERANIUM = BLOCKS.register("potted_pink_geranium",
            () -> new FlowerPotBlock(ModBlocks.PINK_GERANIUM.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ECHINACEA = BLOCKS.register("potted_echinacea",
            () -> new FlowerPotBlock(ModBlocks.ECHINACEA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LIGHT_PINK_GERANIUM = BLOCKS.register("potted_light_pink_geranium",
            () -> new FlowerPotBlock(ModBlocks.LIGHT_PINK_GERANIUM.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLEEDING_HEART = BLOCKS.register("potted_bleeding_heart",
            () -> new FlowerPotBlock(ModBlocks.BLEEDING_HEART.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_NASTURTIUM_PINK = BLOCKS.register("potted_nasturtium_pink",
            () -> new FlowerPotBlock(ModBlocks.NASTURTIUM_PINK.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CLOVER_FLOWERS = BLOCKS.register("potted_clover_flowers",
            () -> new FlowerPotBlock(ModBlocks.CLOVER_FLOWERS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SNAPDRAGON_PINK = BLOCKS.register("potted_snapdragon_pink",
            () -> new FlowerPotBlock(ModBlocks.SNAPDRAGON_PINK.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BANEBERRY = BLOCKS.register("potted_baneberry",
            () -> new FlowerPotBlock(ModBlocks.BANEBERRY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_COSMOS_MIX = BLOCKS.register("potted_cosmos_mix",
            () -> new FlowerPotBlock(ModBlocks.COSMOS_MIX.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_COSMOS = BLOCKS.register("potted_cosmos",
            () -> new FlowerPotBlock(ModBlocks.COSMOS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MAGENTA_ORCHID = BLOCKS.register("potted_magenta_orchid",
            () -> new FlowerPotBlock(ModBlocks.MAGENTA_ORCHID.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CLOVER_LEAVES = BLOCKS.register("potted_clover_leaves",
            () -> new FlowerPotBlock(ModBlocks.CLOVER_LEAVES.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SNAPDRAGON_WHITE = BLOCKS.register("potted_snapdragon_white",
            () -> new FlowerPotBlock(ModBlocks.SNAPDRAGON_WHITE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("potted_lily_of_the_valley",
            () -> new FlowerPotBlock(ModBlocks.LILY_OF_THE_VALLEY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CALLA_LILY = BLOCKS.register("potted_calla_lily",
            () -> new FlowerPotBlock(ModBlocks.CALLA_LILY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CHRYSANTHENUM = BLOCKS.register("potted_chrysanthenum",
            () -> new FlowerPotBlock(ModBlocks.CHRYSANTHENUM.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LEWISIA = BLOCKS.register("potted_lewisia",
            () -> new FlowerPotBlock(ModBlocks.LEWISIA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_AUSTRALIAN_CORNFLOWER = BLOCKS.register("potted_australian_cornflower",
            () -> new FlowerPotBlock(ModBlocks.AUSTRALIAN_CORNFLOWER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ALBUCA_NAMAQUENSIS = BLOCKS.register("potted_albuca_namaquensis",
            () -> new FlowerPotBlock(ModBlocks.ALBUCA_NAMAQUENSIS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CACTUS = BLOCKS.register("potted_cactus",
            () -> new FlowerPotBlock(ModBlocks.CACTUS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PARODIA_MURICATA = BLOCKS.register("potted_parodia_muricata",
            () -> new FlowerPotBlock(ModBlocks.PARODIA_MURICATA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_YELLOW_STARTHISTLE = BLOCKS.register("potted_yellow_starthistle",
            () -> new FlowerPotBlock(ModBlocks.YELLOW_STARTHISTLE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_AUSTRALIAN_FLAME_PEA = BLOCKS.register("potted_australian_flame_pea",
            () -> new FlowerPotBlock(ModBlocks.AUSTRALIAN_FLAME_PEA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORANGE_AUSTRALIAN_FLAME_PEA = BLOCKS.register("potted_orange_australian_flame_pea",
            () -> new FlowerPotBlock(ModBlocks.ORANGE_AUSTRALIAN_FLAME_PEA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_DESERT_PAINTBRUSH = BLOCKS.register("potted_desert_paintbrush",
            () -> new FlowerPotBlock(ModBlocks.DESERT_PAINTBRUSH.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_DESERT_STURT_PEA = BLOCKS.register("potted_desert_sturt_pea",
            () -> new FlowerPotBlock(ModBlocks.DESERT_STURT_PEA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLUE_TINSEL_LILY = BLOCKS.register("potted_blue_tinsel_lily",
            () -> new FlowerPotBlock(ModBlocks.BLUE_TINSEL_LILY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_NOTCH_LEAF_SCORPION_WEED = BLOCKS.register("potted_notch_leaf_scorpion_weed",
            () -> new FlowerPotBlock(ModBlocks.NOTCH_LEAF_SCORPION_WEED.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_FLAG = BLOCKS.register("potted_purple_flag",
            () -> new FlowerPotBlock(ModBlocks.PURPLE_FLAG.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_OWLS_CLOVER = BLOCKS.register("potted_owls_clover",
            () -> new FlowerPotBlock(ModBlocks.OWLS_CLOVER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_DESERT_SAND_VERBENA = BLOCKS.register("potted_desert_sand_verbena",
            () -> new FlowerPotBlock(ModBlocks.DESERT_SAND_VERBENA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PINK_DESERT_SAND_VERBENA = BLOCKS.register("potted_pink_desert_sand_verbena",
            () -> new FlowerPotBlock(ModBlocks.PINK_DESERT_SAND_VERBENA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ENGELMANNS_HEDGEHOG_CACTUS = BLOCKS.register("potted_engelmanns_hedgehog_cactus",
            () -> new FlowerPotBlock(ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_DEVILS_CLAW = BLOCKS.register("potted_devils_claw",
            () -> new FlowerPotBlock(ModBlocks.DEVILS_CLAW.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_TUMBLE_WEED = BLOCKS.register("potted_tumble_weed",
            () -> new FlowerPotBlock(ModBlocks.TUMBLE_WEED.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_WHITE_TINSEL_FLOWER = BLOCKS.register("potted_white_tinsel_flower",
            () -> new FlowerPotBlock(ModBlocks.WHITE_TINSEL_FLOWER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_YUCCA = BLOCKS.register("potted_yucca",
            () -> new FlowerPotBlock(ModBlocks.YUCCA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BABY_BLUE_EYES = BLOCKS.register("potted_baby_blue_eyes",
            () -> new FlowerPotBlock(ModBlocks.BABY_BLUE_EYES.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BABY_BLUE_EYES_SMALL = BLOCKS.register("potted_baby_blue_eyes_small",
            () -> new FlowerPotBlock(ModBlocks.BABY_BLUE_EYES_SMALL.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BEACH_GRASS = BLOCKS.register("potted_beach_grass",
            () -> new FlowerPotBlock(ModBlocks.BEACH_GRASS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LIVE_FOREVER_LEAVES = BLOCKS.register("potted_live_forever_leaves",
            () -> new FlowerPotBlock(ModBlocks.LIVE_FOREVER_LEAVES.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LIVE_FOREVER = BLOCKS.register("potted_live_forever",
            () -> new FlowerPotBlock(ModBlocks.LIVE_FOREVER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_COASTAL_LOTUS = BLOCKS.register("potted_coastal_lotus",
            () -> new FlowerPotBlock(ModBlocks.COASTAL_LOTUS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SILVER_CARPET = BLOCKS.register("potted_silver_carpet",
            () -> new FlowerPotBlock(ModBlocks.SILVER_CARPET.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BEACH_STRAWBERRY = BLOCKS.register("potted_beach_strawberry",
            () -> new FlowerPotBlock(ModBlocks.BEACH_STRAWBERRY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CINQUEFOIL = BLOCKS.register("potted_cinquefoil",
            () -> new FlowerPotBlock(ModBlocks.CINQUEFOIL.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CALIFORNIA_SEA_THRIFT = BLOCKS.register("potted_california_sea_thrift",
            () -> new FlowerPotBlock(ModBlocks.CALIFORNIA_SEA_THRIFT.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLUE_EYED_GRASS = BLOCKS.register("potted_blue_eyed_grass",
            () -> new FlowerPotBlock(ModBlocks.BLUE_EYED_GRASS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CREEPING_THYME = BLOCKS.register("potted_creeping_thyme",
            () -> new FlowerPotBlock(ModBlocks.CREEPING_THYME.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_WOOLY_THYME = BLOCKS.register("potted_wooly_thyme",
            () -> new FlowerPotBlock(ModBlocks.WOOLY_THYME.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BUCKWHEAT = BLOCKS.register("potted_buckwheat",
            () -> new FlowerPotBlock(ModBlocks.BUCKWHEAT.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ROCK_ROSE = BLOCKS.register("potted_rock_rose",
            () -> new FlowerPotBlock(ModBlocks.ROCK_ROSE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ROCK_ROSE_ORCHID = BLOCKS.register("potted_rock_rose_orchid",
            () -> new FlowerPotBlock(ModBlocks.ROCK_ROSE_ORCHID.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BUCKWHEAT_RED = BLOCKS.register("potted_buckwheat_red",
            () -> new FlowerPotBlock(ModBlocks.BUCKWHEAT_RED.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_JEWEL_OF_THE_DESERT = BLOCKS.register("potted_jewel_of_the_desert",
            () -> new FlowerPotBlock(ModBlocks.JEWEL_OF_THE_DESERT.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BASKET_STINKHORN = BLOCKS.register("potted_basket_stinkhorn",
            () -> new FlowerPotBlock(ModBlocks.BASKET_STINKHORN.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_IRIS_FANCY_DRESS = BLOCKS.register("potted_iris_fancy_dress",
            () -> new FlowerPotBlock(ModBlocks.IRIS_FANCY_DRESS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_FLOWERING_CURRENT = BLOCKS.register("potted_flowering_current",
            () -> new FlowerPotBlock(ModBlocks.FLOWERING_CURRENT.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_GLORIOSA_LILY = BLOCKS.register("potted_gloriosa_lily",
            () -> new FlowerPotBlock(ModBlocks.GLORIOSA_LILY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CAPE_ALOE = BLOCKS.register("potted_cape_aloe",
            () -> new FlowerPotBlock(ModBlocks.CAPE_ALOE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_RED_SUNFLOWER = BLOCKS.register("potted_red_sunflower",
            () -> new FlowerPotBlock(ModBlocks.RED_SUNFLOWER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PARADOX_SUNFLOWER = BLOCKS.register("potted_paradox_sunflower",
            () -> new FlowerPotBlock(ModBlocks.PARADOX_SUNFLOWER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_DRIED_SUNFLOWER = BLOCKS.register("potted_dried_sunflower",
            () -> new FlowerPotBlock(ModBlocks.DRIED_SUNFLOWER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SKYSCRAPER_SUNFLOWER = BLOCKS.register("potted_skyscraper_sunflower",
            () -> new FlowerPotBlock(ModBlocks.SKYSCRAPER_SUNFLOWER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SUNDANCE_KID_SUNFLOWER = BLOCKS.register("potted_sundance_kid_sunflower",
            () -> new FlowerPotBlock(ModBlocks.SUNDANCE_KID_SUNFLOWER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_TEDDY_BEAR_SUNFLOWER = BLOCKS.register("potted_teddy_bear_sunflower",
            () -> new FlowerPotBlock(ModBlocks.TEDDY_BEAR_SUNFLOWER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_TALL_ORANGE_COSMOS = BLOCKS.register("potted_tall_orange_cosmos",
            () -> new FlowerPotBlock(ModBlocks.TALL_ORANGE_COSMOS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORANGE_GLADIOLA = BLOCKS.register("potted_orange_gladiola",
            () -> new FlowerPotBlock(ModBlocks.ORANGE_GLADIOLA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PEACH_GLADIOLA = BLOCKS.register("potted_peach_gladiola",
            () -> new FlowerPotBlock(ModBlocks.PEACH_GLADIOLA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_GLADIOLA = BLOCKS.register("potted_gladiola",
            () -> new FlowerPotBlock(ModBlocks.GLADIOLA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CRIMSON_GLADIOLA = BLOCKS.register("potted_crimson_gladiola",
            () -> new FlowerPotBlock(ModBlocks.CRIMSON_GLADIOLA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_QUINCE = BLOCKS.register("potted_quince",
            () -> new FlowerPotBlock(ModBlocks.QUINCE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_HAWTHORNE = BLOCKS.register("potted_hawthorne",
            () -> new FlowerPotBlock(ModBlocks.HAWTHORNE.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORNAMENTAL_CHERRY = BLOCKS.register("potted_ornamental_cherry",
            () -> new FlowerPotBlock(ModBlocks.ORNAMENTAL_CHERRY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_DATURA = BLOCKS.register("potted_datura",
            () -> new FlowerPotBlock(ModBlocks.DATURA.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MANZANITA_BUSH = BLOCKS.register("potted_manzanita_bush",
            () -> new FlowerPotBlock(ModBlocks.MANZANITA_BUSH.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_IRIS = BLOCKS.register("potted_iris",
            () -> new FlowerPotBlock(ModBlocks.IRIS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_TALL_LUPIN = BLOCKS.register("potted_tall_lupin",
            () -> new FlowerPotBlock(ModBlocks.TALL_LUPIN.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_SWEET_PEAS = BLOCKS.register("potted_purple_sweet_peas",
            () -> new FlowerPotBlock(ModBlocks.PURPLE_SWEET_PEAS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_DARK_BLUE_SWEET_PEAS = BLOCKS.register("potted_dark_blue_sweet_peas",
            () -> new FlowerPotBlock(ModBlocks.DARK_BLUE_SWEET_PEAS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLUE_BELL_SWEET_PEAS = BLOCKS.register("potted_blue_bell_sweet_peas",
            () -> new FlowerPotBlock(ModBlocks.BLUE_BELL_SWEET_PEAS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MIXED_PINK_SWEET_PEAS = BLOCKS.register("potted_mixed_pink_sweet_peas",
            () -> new FlowerPotBlock(ModBlocks.MIXED_PINK_SWEET_PEAS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MAGENTA_SWEET_PEAS = BLOCKS.register("potted_magenta_sweet_peas",
            () -> new FlowerPotBlock(ModBlocks.MAGENTA_SWEET_PEAS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BRIGHT_MAGENTA_SWEET_PEAS = BLOCKS.register("potted_bright_magenta_sweet_peas",
            () -> new FlowerPotBlock(ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_TALL_COSMOS = BLOCKS.register("potted_tall_cosmos",
            () -> new FlowerPotBlock(ModBlocks.TALL_COSMOS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MENDOCINO_POPPY = BLOCKS.register("potted_mendocino_poppy",
            () -> new FlowerPotBlock(ModBlocks.MENDOCINO_POPPY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_TALL_CALLA_LILY = BLOCKS.register("potted_tall_calla_lily",
            () -> new FlowerPotBlock(ModBlocks.TALL_CALLA_LILY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_WHITE_LARKSPUR = BLOCKS.register("potted_white_larkspur",
            () -> new FlowerPotBlock(ModBlocks.WHITE_LARKSPUR.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LAVENDER_LARKSPUR = BLOCKS.register("potted_lavender_larkspur",
            () -> new FlowerPotBlock(ModBlocks.LAVENDER_LARKSPUR.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LARKSPUR = BLOCKS.register("potted_larkspur",
            () -> new FlowerPotBlock(ModBlocks.LARKSPUR.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_LARKSPUR = BLOCKS.register("potted_purple_larkspur",
            () -> new FlowerPotBlock(ModBlocks.PURPLE_LARKSPUR.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MAGENTA_LARKSPUR = BLOCKS.register("potted_magenta_larkspur",
            () -> new FlowerPotBlock(ModBlocks.MAGENTA_LARKSPUR.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PINK_LARKSPUR = BLOCKS.register("potted_pink_larkspur",
            () -> new FlowerPotBlock(ModBlocks.PINK_LARKSPUR.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LIGHT_PINK_LARKSPUR = BLOCKS.register("potted_light_pink_larkspur",
            () -> new FlowerPotBlock(ModBlocks.LIGHT_PINK_LARKSPUR.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_HIMALAYAN_BLUE_POPPY = BLOCKS.register("potted_himalayan_blue_poppy",
            () -> new FlowerPotBlock(ModBlocks.HIMALAYAN_BLUE_POPPY.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MOJAVE_INDIGO_BUSH = BLOCKS.register("potted_mojave_indigo_bush",
            () -> new FlowerPotBlock(ModBlocks.MOJAVE_INDIGO_BUSH.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_DRY_SHRUB = BLOCKS.register("potted_dry_shrub",
            () -> new FlowerPotBlock(ModBlocks.DRY_SHRUB.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_YUCCA_FLOWER = BLOCKS.register("potted_yucca_flower",
            () -> new FlowerPotBlock(ModBlocks.YUCCA_FLOWER.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_OCOTILLO = BLOCKS.register("potted_ocotillo",
            () -> new FlowerPotBlock(ModBlocks.OCOTILLO.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_TALL_CACTUS = BLOCKS.register("potted_tall_cactus",
            () -> new FlowerPotBlock(ModBlocks.TALL_CACTUS.get(),
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
}
