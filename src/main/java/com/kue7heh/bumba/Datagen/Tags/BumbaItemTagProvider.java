package com.kue7heh.bumba.Datagen.Tags;

import com.kue7heh.bumba.Bumba;
import com.kue7heh.bumba.registry.bumbaitemregistry;
import io.redspace.irons_artifice.utils.IronsArtificeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BumbaItemTagProvider extends ItemTagsProvider {
    public BumbaItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Bumba.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(IronsArtificeTags.GUNS)
                .add(bumbaitemregistry.HANDCANNON.get())
                .add(bumbaitemregistry.GATLINGGUN.get())
                .add(bumbaitemregistry.M1.get())
                .add(bumbaitemregistry.DOUBLEBARRELSHOTGUN.get())
        ;

    }
}