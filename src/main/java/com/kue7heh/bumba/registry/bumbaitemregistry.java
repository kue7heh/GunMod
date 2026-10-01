package com.kue7heh.bumba.registry;

import com.kue7heh.bumba.Items.Guns.bumbaguns;
import com.kue7heh.bumba.Bumba;
import io.redspace.irons_artifice.item.GunItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class bumbaitemregistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Bumba.MODID);


    public static final DeferredItem<GunItem> HANDCANNON = ITEMS.registerItem("handcannon",
            properties -> new GunItem(properties, bumbaguns.HANDCANNON)
    );
    public static final DeferredItem<GunItem> GATLINGGUN = ITEMS.registerItem("gatlinggun",
            properties -> new GunItem(properties, bumbaguns.GATLINGGUN)
    );
    public static final DeferredItem<GunItem> DOUBLEBARRELSHOTGUN = ITEMS.registerItem("double_barrel_shotgun",
            properties -> new GunItem(properties, bumbaguns.DOUBLEBARRELSHOTGUN)
    );
    public static final DeferredItem<GunItem> M1 = ITEMS.registerItem("m1",
            properties -> new GunItem(properties, bumbaguns.M1)
    );

    public static void register(IEventBus modEventBus){
        ITEMS.register(modEventBus);
    }
}