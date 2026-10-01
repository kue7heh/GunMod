package com.kue7heh.bumba.registry;

import com.kue7heh.bumba.Bumba;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class bumbacreativemodetabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Bumba.MODID);

    public static final Supplier<CreativeModeTab> BUMBA_ITEMS = CREATIVE_MODE_TABS.register("bumba",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(bumbaitemregistry.HANDCANNON.get()))
                    .title(Component.translatable("Bumba"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(bumbaitemregistry.HANDCANNON);
                        output.accept(bumbaitemregistry.GATLINGGUN);
                        output.accept(bumbaitemregistry.DOUBLEBARRELSHOTGUN);
                        output.accept(bumbaitemregistry.M1);

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
