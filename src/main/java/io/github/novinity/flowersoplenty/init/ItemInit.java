package io.github.novinity.flowersoplenty.init;

import io.github.novinity.flowersoplenty.FlowersOPlenty;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FlowersOPlenty.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FlowersOPlenty.MODID);

    // RED
    public static final RegistryObject<BlockItem> RED_GERANIUM = BLOCK_ITEMS.register("red_geranium", () -> new BlockItem(ModBlocks.RED_GERANIUM.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_POPPY = BLOCK_ITEMS.register("red_poppy", () -> new BlockItem(ModBlocks.RED_POPPY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_CLOVER = BLOCK_ITEMS.register("red_clover", () -> new BlockItem(ModBlocks.RED_CLOVER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_FREESIA = BLOCK_ITEMS.register("red_freesia", () -> new BlockItem(ModBlocks.RED_FREESIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LANTANA = BLOCK_ITEMS.register("lantana", () -> new BlockItem(ModBlocks.LANTANA.get(), new Item.Properties()));

    // ORANGE
    public static final RegistryObject<BlockItem> SUNNY_ZINNIA = BLOCK_ITEMS.register("sunny_zinnia", () -> new BlockItem(ModBlocks.SUNNY_ZINNIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> STRIPED_ZINNIA = BLOCK_ITEMS.register("striped_zinnia", () -> new BlockItem(ModBlocks.STRIPED_ZINNIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MIXED_ZINNIA = BLOCK_ITEMS.register("mixed_zinnia", () -> new BlockItem(ModBlocks.MIXED_ZINNIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DAHLIA = BLOCK_ITEMS.register("dahlia", () -> new BlockItem(ModBlocks.DAHLIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ORANGE_FREESIA = BLOCK_ITEMS.register("orange_freesia", () -> new BlockItem(ModBlocks.ORANGE_FREESIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> NASTURTIUM = BLOCK_ITEMS.register("nasturtium", () -> new BlockItem(ModBlocks.NASTURTIUM.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> STICKY_MONKEY = BLOCK_ITEMS.register("sticky_monkey", () -> new BlockItem(ModBlocks.STICKY_MONKEY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ORANGE_DAY_LILY = BLOCK_ITEMS.register("orange_day_lily", () -> new BlockItem(ModBlocks.ORANGE_DAY_LILY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DAY_LILY = BLOCK_ITEMS.register("day_lily", () -> new BlockItem(ModBlocks.DAY_LILY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CALIFORNIA_POPPY = BLOCK_ITEMS.register("california_poppy", () -> new BlockItem(ModBlocks.CALIFORNIA_POPPY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ORANGE_COSMOS = BLOCK_ITEMS.register("orange_cosmos", () -> new BlockItem(ModBlocks.ORANGE_COSMOS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ORANGE_LUPIN = BLOCK_ITEMS.register("orange_lupin", () -> new BlockItem(ModBlocks.ORANGE_LUPIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LADY_SLIPPER_ORCHID = BLOCK_ITEMS.register("lady_slipper_orchid", () -> new BlockItem(ModBlocks.LADY_SLIPPER_ORCHID.get(), new Item.Properties()));

    // YELLOW
    public static final RegistryObject<BlockItem> YELLOW_COSMOS = BLOCK_ITEMS.register("yellow_cosmos", () -> new BlockItem(ModBlocks.YELLOW_COSMOS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> YELLOW_CROCUS = BLOCK_ITEMS.register("yellow_crocus", () -> new BlockItem(ModBlocks.YELLOW_CROCUS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> YELLOW_FREESIA = BLOCK_ITEMS.register("yellow_freesia", () -> new BlockItem(ModBlocks.YELLOW_FREESIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORYDALIS = BLOCK_ITEMS.register("corydalis", () -> new BlockItem(ModBlocks.CORYDALIS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> YELLOW_LUPIN = BLOCK_ITEMS.register("yellow_lupin", () -> new BlockItem(ModBlocks.YELLOW_LUPIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GOLDEN_BEAN = BLOCK_ITEMS.register("golden_bean", () -> new BlockItem(ModBlocks.GOLDEN_BEAN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CROCUS_MIX = BLOCK_ITEMS.register("crocus_mix", () -> new BlockItem(ModBlocks.CROCUS_MIX.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> YELLOW_DAFFODIL = BLOCK_ITEMS.register("yellow_daffodil", () -> new BlockItem(ModBlocks.YELLOW_DAFFODIL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WHITE_DAFFODIL = BLOCK_ITEMS.register("white_daffodil", () -> new BlockItem(ModBlocks.WHITE_DAFFODIL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> NARCISSUS = BLOCK_ITEMS.register("narcissus", () -> new BlockItem(ModBlocks.NARCISSUS.get(), new Item.Properties()));

    // BLUE
    public static final RegistryObject<BlockItem> PANSY = BLOCK_ITEMS.register("pansy", () -> new BlockItem(ModBlocks.PANSY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CLOUD_BLUE_CORYDALIS = BLOCK_ITEMS.register("cloud_blue_corydalis", () -> new BlockItem(ModBlocks.CLOUD_BLUE_CORYDALIS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CYAN_HYACINTH = BLOCK_ITEMS.register("cyan_hyacinth", () -> new BlockItem(ModBlocks.CYAN_HYACINTH.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_FORGET_ME_NOT = BLOCK_ITEMS.register("light_blue_forget_me_not", () -> new BlockItem(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> FORGET_ME_NOT = BLOCK_ITEMS.register("forget_me_not", () -> new BlockItem(ModBlocks.FORGET_ME_NOT.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_LOBELIA = BLOCK_ITEMS.register("light_blue_lobelia", () -> new BlockItem(ModBlocks.LIGHT_BLUE_LOBELIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MEDIUM_BLUE_LOBELIA = BLOCK_ITEMS.register("medium_blue_lobelia", () -> new BlockItem(ModBlocks.MEDIUM_BLUE_LOBELIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ROYAL_BLUE_LOBELIA = BLOCK_ITEMS.register("royal_blue_lobelia", () -> new BlockItem(ModBlocks.ROYAL_BLUE_LOBELIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MORNING_GLORY = BLOCK_ITEMS.register("morning_glory", () -> new BlockItem(ModBlocks.MORNING_GLORY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BACHELOR_BUTTON = BLOCK_ITEMS.register("bachelor_button", () -> new BlockItem(ModBlocks.BACHELOR_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BLUE_BACHELOR_BUTTON = BLOCK_ITEMS.register("blue_bachelor_button", () -> new BlockItem(ModBlocks.BLUE_BACHELOR_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BLUE_BELL_BACHELOR_BUTTON = BLOCK_ITEMS.register("blue_bell_bachelor_button", () -> new BlockItem(ModBlocks.BLUE_BELL_BACHELOR_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BORAGE = BLOCK_ITEMS.register("borage", () -> new BlockItem(ModBlocks.BORAGE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DARK_BLUE_BORAGE = BLOCK_ITEMS.register("dark_blue_borage", () -> new BlockItem(ModBlocks.DARK_BLUE_BORAGE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> COMMELINA = BLOCK_ITEMS.register("commelina", () -> new BlockItem(ModBlocks.COMMELINA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRAPE_HYACINTH = BLOCK_ITEMS.register("grape_hyacinth", () -> new BlockItem(ModBlocks.GRAPE_HYACINTH.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> VIRGINIA_COWSLIP = BLOCK_ITEMS.register("virginia_cowslip", () -> new BlockItem(ModBlocks.VIRGINIA_COWSLIP.get(), new Item.Properties()));

    // PURPLE
    public static final RegistryObject<BlockItem> PERIWINKLE = BLOCK_ITEMS.register("periwinkle", () -> new BlockItem(ModBlocks.PERIWINKLE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> COMMON_PERIWINKLE = BLOCK_ITEMS.register("common_periwinkle", () -> new BlockItem(ModBlocks.COMMON_PERIWINKLE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CLOUD_SAGE = BLOCK_ITEMS.register("cloud_sage", () -> new BlockItem(ModBlocks.CLOUD_SAGE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PURPLE_CROCUS = BLOCK_ITEMS.register("purple_crocus", () -> new BlockItem(ModBlocks.PURPLE_CROCUS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PEPPERMINT = BLOCK_ITEMS.register("peppermint", () -> new BlockItem(ModBlocks.PEPPERMINT.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PARROT_FLOWER = BLOCK_ITEMS.register("parrot_flower", () -> new BlockItem(ModBlocks.PARROT_FLOWER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BIRDS_EYE_GILIA = BLOCK_ITEMS.register("birds_eye_gilia", () -> new BlockItem(ModBlocks.BIRDS_EYE_GILIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> AFRICAN_DAISY = BLOCK_ITEMS.register("african_daisy", () -> new BlockItem(ModBlocks.AFRICAN_DAISY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> IRIS_FANCY_DRESS = BLOCK_ITEMS.register("iris_fancy_dress", () -> new BlockItem(ModBlocks.IRIS_FANCY_DRESS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WOLFS_BANE = BLOCK_ITEMS.register("wolfs_bane", () -> new BlockItem(ModBlocks.WOLFS_BANE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PURPLE_LUPIN = BLOCK_ITEMS.register("purple_lupin", () -> new BlockItem(ModBlocks.PURPLE_LUPIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PANSY_PURPLE = BLOCK_ITEMS.register("pansy_purple", () -> new BlockItem(ModBlocks.PANSY_PURPLE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> VIOLET = BLOCK_ITEMS.register("violet", () -> new BlockItem(ModBlocks.VIOLET.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SALVIA = BLOCK_ITEMS.register("salvia", () -> new BlockItem(ModBlocks.SALVIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PURPLE_MAGENTA_SALVIA = BLOCK_ITEMS.register("purple_magenta_salvia", () -> new BlockItem(ModBlocks.PURPLE_MAGENTA_SALVIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MEXICAN_SAGE = BLOCK_ITEMS.register("mexican_sage", () -> new BlockItem(ModBlocks.MEXICAN_SAGE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PURPLE_CALLA_LILY = BLOCK_ITEMS.register("purple_calla_lily", () -> new BlockItem(ModBlocks.PURPLE_CALLA_LILY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PURPLE_AFRICAN_DAISY = BLOCK_ITEMS.register("purple_african_daisy", () -> new BlockItem(ModBlocks.PURPLE_AFRICAN_DAISY.get(), new Item.Properties()));

    // PINK
    public static final RegistryObject<BlockItem> MAROON_MALLOW = BLOCK_ITEMS.register("maroon_mallow", () -> new BlockItem(ModBlocks.MAROON_MALLOW.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PINK_PETTICOAT = BLOCK_ITEMS.register("pink_petticoat", () -> new BlockItem(ModBlocks.PINK_PETTICOAT.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PITCHER_PLANT = BLOCK_ITEMS.register("pitcher_plant", () -> new BlockItem(ModBlocks.PITCHER_PLANT.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> VENUS_FLY_TRAP = BLOCK_ITEMS.register("venus_fly_trap", () -> new BlockItem(ModBlocks.VENUS_FLY_TRAP.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MAGENTA_ZINNIA = BLOCK_ITEMS.register("magenta_zinnia", () -> new BlockItem(ModBlocks.MAGENTA_ZINNIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> FUCHSIA = BLOCK_ITEMS.register("fuchsia", () -> new BlockItem(ModBlocks.FUCHSIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> FUCHSIA_SMALL = BLOCK_ITEMS.register("fuchsia_small", () -> new BlockItem(ModBlocks.FUCHSIA_SMALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MAGENTA_CLOVER = BLOCK_ITEMS.register("magenta_clover", () -> new BlockItem(ModBlocks.MAGENTA_CLOVER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PINK_CLOVER = BLOCK_ITEMS.register("pink_clover", () -> new BlockItem(ModBlocks.PINK_CLOVER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PINK_GERANIUM = BLOCK_ITEMS.register("pink_geranium", () -> new BlockItem(ModBlocks.PINK_GERANIUM.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ECHINACEA = BLOCK_ITEMS.register("echinacea", () -> new BlockItem(ModBlocks.ECHINACEA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LIGHT_PINK_GERANIUM = BLOCK_ITEMS.register("light_pink_geranium", () -> new BlockItem(ModBlocks.LIGHT_PINK_GERANIUM.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BLEEDING_HEART = BLOCK_ITEMS.register("bleeding_heart", () -> new BlockItem(ModBlocks.BLEEDING_HEART.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> NASTURTIUM_PINK = BLOCK_ITEMS.register("nasturtium_pink", () -> new BlockItem(ModBlocks.NASTURTIUM_PINK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> FLOWERING_CURRENT = BLOCK_ITEMS.register("flowering_current", () -> new BlockItem(ModBlocks.FLOWERING_CURRENT.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CLOVER_FLOWERS = BLOCK_ITEMS.register("clover_flowers", () -> new BlockItem(ModBlocks.CLOVER_FLOWERS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SNAPDRAGON_PINK = BLOCK_ITEMS.register("snapdragon_pink", () -> new BlockItem(ModBlocks.SNAPDRAGON_PINK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BANEBERRY = BLOCK_ITEMS.register("baneberry", () -> new BlockItem(ModBlocks.BANEBERRY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> COSMOS_MIX = BLOCK_ITEMS.register("cosmos_mix", () -> new BlockItem(ModBlocks.COSMOS_MIX.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> COSMOS = BLOCK_ITEMS.register("cosmos", () -> new BlockItem(ModBlocks.COSMOS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MAGENTA_ORCHID = BLOCK_ITEMS.register("magenta_orchid", () -> new BlockItem(ModBlocks.MAGENTA_ORCHID.get(), new Item.Properties()));

    // UNSORTED

    public static final RegistryObject<BlockItem> CLOVER_LEAVES = BLOCK_ITEMS.register("clover_leaves", () -> new BlockItem(ModBlocks.CLOVER_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SNAPDRAGON_WHITE = BLOCK_ITEMS.register("snapdragon_white", () -> new BlockItem(ModBlocks.SNAPDRAGON_WHITE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LILY_OF_THE_VALLEY = BLOCK_ITEMS.register("lily_of_the_valley", () -> new BlockItem(ModBlocks.LILY_OF_THE_VALLEY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CALLA_LILY = BLOCK_ITEMS.register("calla_lily", () -> new BlockItem(ModBlocks.CALLA_LILY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CHRYSANTHENUM = BLOCK_ITEMS.register("chrysanthenum", () -> new BlockItem(ModBlocks.CHRYSANTHENUM.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LEWISIA = BLOCK_ITEMS.register("lewisia", () -> new BlockItem(ModBlocks.LEWISIA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GLORIOSA_LILY = BLOCK_ITEMS.register("gloriosa_lily", () -> new BlockItem(ModBlocks.GLORIOSA_LILY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CAPE_ALOE = BLOCK_ITEMS.register("cape_aloe", () -> new BlockItem(ModBlocks.CAPE_ALOE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SUNFLOWER = BLOCK_ITEMS.register("red_sunflower", () -> new BlockItem(ModBlocks.RED_SUNFLOWER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PARADOX_SUNFLOWER = BLOCK_ITEMS.register("paradox_sunflower", () -> new BlockItem(ModBlocks.PARADOX_SUNFLOWER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DRIED_SUNFLOWER = BLOCK_ITEMS.register("dried_sunflower", () -> new BlockItem(ModBlocks.DRIED_SUNFLOWER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SKYSCRAPER_SUNFLOWER = BLOCK_ITEMS.register("skyscraper_sunflower", () -> new BlockItem(ModBlocks.SKYSCRAPER_SUNFLOWER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SUNDANCE_KID_SUNFLOWER = BLOCK_ITEMS.register("sundance_kid_sunflower", () -> new BlockItem(ModBlocks.SUNDANCE_KID_SUNFLOWER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TEDDY_BEAR_SUNFLOWER = BLOCK_ITEMS.register("teddy_bear_sunflower", () -> new BlockItem(ModBlocks.TEDDY_BEAR_SUNFLOWER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TALL_ORANGE_COSMOS = BLOCK_ITEMS.register("tall_orange_cosmos", () -> new BlockItem(ModBlocks.TALL_ORANGE_COSMOS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ORANGE_GLADIOLA = BLOCK_ITEMS.register("orange_gladiola", () -> new BlockItem(ModBlocks.ORANGE_GLADIOLA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PEACH_GLADIOLA = BLOCK_ITEMS.register("peach_gladiola", () -> new BlockItem(ModBlocks.PEACH_GLADIOLA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GLADIOLA = BLOCK_ITEMS.register("gladiola", () -> new BlockItem(ModBlocks.GLADIOLA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CRIMSON_GLADIOLA = BLOCK_ITEMS.register("crimson_gladiola", () -> new BlockItem(ModBlocks.CRIMSON_GLADIOLA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> QUINCE = BLOCK_ITEMS.register("quince", () -> new BlockItem(ModBlocks.QUINCE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> HAWTHORNE = BLOCK_ITEMS.register("hawthorne", () -> new BlockItem(ModBlocks.HAWTHORNE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ORNAMENTAL_CHERRY = BLOCK_ITEMS.register("ornamental_cherry", () -> new BlockItem(ModBlocks.ORNAMENTAL_CHERRY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DATURA = BLOCK_ITEMS.register("datura", () -> new BlockItem(ModBlocks.DATURA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MANZANITA_BUSH = BLOCK_ITEMS.register("manzanita_bush", () -> new BlockItem(ModBlocks.MANZANITA_BUSH.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> IRIS = BLOCK_ITEMS.register("iris", () -> new BlockItem(ModBlocks.IRIS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TALL_LUPIN = BLOCK_ITEMS.register("tall_lupin", () -> new BlockItem(ModBlocks.TALL_LUPIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PURPLE_SWEET_PEAS = BLOCK_ITEMS.register("purple_sweet_peas", () -> new BlockItem(ModBlocks.PURPLE_SWEET_PEAS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DARK_BLUE_SWEET_PEAS = BLOCK_ITEMS.register("dark_blue_sweet_peas", () -> new BlockItem(ModBlocks.DARK_BLUE_SWEET_PEAS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BLUE_BELL_SWEET_PEAS = BLOCK_ITEMS.register("blue_bell_sweet_peas", () -> new BlockItem(ModBlocks.BLUE_BELL_SWEET_PEAS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MIXED_PINK_SWEET_PEAS = BLOCK_ITEMS.register("mixed_pink_sweet_peas", () -> new BlockItem(ModBlocks.MIXED_PINK_SWEET_PEAS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MAGENTA_SWEET_PEAS = BLOCK_ITEMS.register("magenta_sweet_peas", () -> new BlockItem(ModBlocks.MAGENTA_SWEET_PEAS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BRIGHT_MAGENTA_SWEET_PEAS = BLOCK_ITEMS.register("bright_magenta_sweet_peas", () -> new BlockItem(ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TALL_COSMOS = BLOCK_ITEMS.register("tall_cosmos", () -> new BlockItem(ModBlocks.TALL_COSMOS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MENDOCINO_POPPY = BLOCK_ITEMS.register("mendocino_poppy", () -> new BlockItem(ModBlocks.MENDOCINO_POPPY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TALL_CALLA_LILY = BLOCK_ITEMS.register("tall_calla_lily", () -> new BlockItem(ModBlocks.TALL_CALLA_LILY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WHITE_LARKSPUR = BLOCK_ITEMS.register("white_larkspur", () -> new BlockItem(ModBlocks.WHITE_LARKSPUR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LAVENDER_LARKSPUR = BLOCK_ITEMS.register("lavender_larkspur", () -> new BlockItem(ModBlocks.LAVENDER_LARKSPUR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LARKSPUR = BLOCK_ITEMS.register("larkspur", () -> new BlockItem(ModBlocks.LARKSPUR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PURPLE_LARKSPUR = BLOCK_ITEMS.register("purple_larkspur", () -> new BlockItem(ModBlocks.PURPLE_LARKSPUR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MAGENTA_LARKSPUR = BLOCK_ITEMS.register("magenta_larkspur", () -> new BlockItem(ModBlocks.MAGENTA_LARKSPUR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PINK_LARKSPUR = BLOCK_ITEMS.register("pink_larkspur", () -> new BlockItem(ModBlocks.PINK_LARKSPUR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LIGHT_PINK_LARKSPUR = BLOCK_ITEMS.register("light_pink_larkspur", () -> new BlockItem(ModBlocks.LIGHT_PINK_LARKSPUR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> HIMALAYAN_BLUE_POPPY = BLOCK_ITEMS.register("himalayan_blue_poppy", () -> new BlockItem(ModBlocks.HIMALAYAN_BLUE_POPPY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> AUSTRALIAN_CORNFLOWER = BLOCK_ITEMS.register("australian_cornflower", () -> new BlockItem(ModBlocks.AUSTRALIAN_CORNFLOWER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ALBUCA_NAMAQUENSIS = BLOCK_ITEMS.register("albuca_namaquensis", () -> new BlockItem(ModBlocks.ALBUCA_NAMAQUENSIS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CACTUS = BLOCK_ITEMS.register("cactus", () -> new BlockItem(ModBlocks.CACTUS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PARODIA_MURICATA = BLOCK_ITEMS.register("parodia_muricata", () -> new BlockItem(ModBlocks.PARODIA_MURICATA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> YELLOW_STARTHISTLE = BLOCK_ITEMS.register("yellow_starthistle", () -> new BlockItem(ModBlocks.YELLOW_STARTHISTLE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> AUSTRALIAN_FLAME_PEA = BLOCK_ITEMS.register("australian_flame_pea", () -> new BlockItem(ModBlocks.AUSTRALIAN_FLAME_PEA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ORANGE_AUSTRALIAN_FLAME_PEA = BLOCK_ITEMS.register("orange_australian_flame_pea", () -> new BlockItem(ModBlocks.ORANGE_AUSTRALIAN_FLAME_PEA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DESERT_PAINTBRUSH = BLOCK_ITEMS.register("desert_paintbrush", () -> new BlockItem(ModBlocks.DESERT_PAINTBRUSH.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DESERT_STURT_PEA = BLOCK_ITEMS.register("desert_sturt_pea", () -> new BlockItem(ModBlocks.DESERT_STURT_PEA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BLUE_TINSEL_LILY = BLOCK_ITEMS.register("blue_tinsel_lily", () -> new BlockItem(ModBlocks.BLUE_TINSEL_LILY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> MOJAVE_INDIGO_BUSH = BLOCK_ITEMS.register("mojave_indigo_bush", () -> new BlockItem(ModBlocks.MOJAVE_INDIGO_BUSH.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> NOTCH_LEAF_SCORPION_WEED = BLOCK_ITEMS.register("notch_leaf_scorpion_weed", () -> new BlockItem(ModBlocks.NOTCH_LEAF_SCORPION_WEED.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PURPLE_FLAG = BLOCK_ITEMS.register("purple_flag", () -> new BlockItem(ModBlocks.PURPLE_FLAG.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> OWLS_CLOVER = BLOCK_ITEMS.register("owls_clover", () -> new BlockItem(ModBlocks.OWLS_CLOVER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DESERT_SAND_VERBENA = BLOCK_ITEMS.register("desert_sand_verbena", () -> new BlockItem(ModBlocks.DESERT_SAND_VERBENA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PINK_DESERT_SAND_VERBENA = BLOCK_ITEMS.register("pink_desert_sand_verbena", () -> new BlockItem(ModBlocks.PINK_DESERT_SAND_VERBENA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ENGELMANNS_HEDGEHOG_CACTUS = BLOCK_ITEMS.register("engelmanns_hedgehog_cactus", () -> new BlockItem(ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DEVILS_CLAW = BLOCK_ITEMS.register("devils_claw", () -> new BlockItem(ModBlocks.DEVILS_CLAW.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TUMBLE_WEED = BLOCK_ITEMS.register("tumble_weed", () -> new BlockItem(ModBlocks.TUMBLE_WEED.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DRY_SHRUB = BLOCK_ITEMS.register("dry_shrub", () -> new BlockItem(ModBlocks.DRY_SHRUB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WHITE_TINSEL_FLOWER = BLOCK_ITEMS.register("white_tinsel_flower", () -> new BlockItem(ModBlocks.WHITE_TINSEL_FLOWER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> YUCCA_FLOWER = BLOCK_ITEMS.register("yucca_flower", () -> new BlockItem(ModBlocks.YUCCA_FLOWER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> YUCCA = BLOCK_ITEMS.register("yucca", () -> new BlockItem(ModBlocks.YUCCA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> OCOTILLO = BLOCK_ITEMS.register("ocotillo", () -> new BlockItem(ModBlocks.OCOTILLO.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TALL_CACTUS = BLOCK_ITEMS.register("tall_cactus", () -> new BlockItem(ModBlocks.TALL_CACTUS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BABY_BLUE_EYES = BLOCK_ITEMS.register("baby_blue_eyes", () -> new BlockItem(ModBlocks.BABY_BLUE_EYES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BABY_BLUE_EYES_SMALL = BLOCK_ITEMS.register("baby_blue_eyes_small", () -> new BlockItem(ModBlocks.BABY_BLUE_EYES_SMALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BEACH_GRASS = BLOCK_ITEMS.register("beach_grass", () -> new BlockItem(ModBlocks.BEACH_GRASS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LIVE_FOREVER_LEAVES = BLOCK_ITEMS.register("live_forever_leaves", () -> new BlockItem(ModBlocks.LIVE_FOREVER_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LIVE_FOREVER = BLOCK_ITEMS.register("live_forever", () -> new BlockItem(ModBlocks.LIVE_FOREVER.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> COASTAL_LOTUS = BLOCK_ITEMS.register("coastal_lotus", () -> new BlockItem(ModBlocks.COASTAL_LOTUS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SILVER_CARPET = BLOCK_ITEMS.register("silver_carpet", () -> new BlockItem(ModBlocks.SILVER_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BEACH_STRAWBERRY = BLOCK_ITEMS.register("beach_strawberry", () -> new BlockItem(ModBlocks.BEACH_STRAWBERRY.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CINQUEFOIL = BLOCK_ITEMS.register("cinquefoil", () -> new BlockItem(ModBlocks.CINQUEFOIL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CALIFORNIA_SEA_THRIFT = BLOCK_ITEMS.register("california_sea_thrift", () -> new BlockItem(ModBlocks.CALIFORNIA_SEA_THRIFT.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BLUE_EYED_GRASS = BLOCK_ITEMS.register("blue_eyed_grass", () -> new BlockItem(ModBlocks.BLUE_EYED_GRASS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WOOLY_THYME = BLOCK_ITEMS.register("wooly_thyme", () -> new BlockItem(ModBlocks.WOOLY_THYME.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CREEPING_THYME = BLOCK_ITEMS.register("creeping_thyme", () -> new BlockItem(ModBlocks.CREEPING_THYME.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BUCKWHEAT = BLOCK_ITEMS.register("buckwheat", () -> new BlockItem(ModBlocks.BUCKWHEAT.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ROCK_ROSE = BLOCK_ITEMS.register("rock_rose", () -> new BlockItem(ModBlocks.ROCK_ROSE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ROCK_ROSE_ORCHID = BLOCK_ITEMS.register("rock_rose_orchid", () -> new BlockItem(ModBlocks.ROCK_ROSE_ORCHID.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BUCKWHEAT_RED = BLOCK_ITEMS.register("buckwheat_red", () -> new BlockItem(ModBlocks.BUCKWHEAT_RED.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> JEWEL_OF_THE_DESERT = BLOCK_ITEMS.register("jewel_of_the_desert", () -> new BlockItem(ModBlocks.JEWEL_OF_THE_DESERT.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> BASKET_STINKHORN = BLOCK_ITEMS.register("basket_stinkhorn", () -> new BlockItem(ModBlocks.BASKET_STINKHORN.get(), new Item.Properties()));

    public static final RegistryObject<Item> BOUQUET = ITEMS.register("bouquet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBBER_BAND = ITEMS.register("rubber_band", () -> new Item(new Item.Properties()));
}
