package io.github.novinity.flowersoplenty.init;

import io.github.novinity.flowersoplenty.FlowersOPlenty;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FlowersOPlenty.MODID);

    public static final RegistryObject<CreativeModeTab> ITEM_TAB = TABS.register("flowersoplenty_item_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.flowersoplenty_item"))
                    .icon(ItemInit.BOUQUET.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        ItemInit.ITEMS.getEntries().forEach(item -> {
                            output.accept(item.get());
                        });
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> MAIN_TAB = TABS.register("flowersoplenty_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.flowersoplenty"))
                    .icon(ItemInit.AFRICAN_DAISY.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        ItemInit.BLOCK_ITEMS.getEntries().forEach(item -> {
                            output.accept(item.get());
                        });
                    })
                    .build()
    );
}
