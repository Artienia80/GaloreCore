package corundum.mulberry.data;

import corundum.mulberry.Mulberry;
import corundum.mulberry.content.MBBlocks;
import corundum.mulberry.content.MBItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class MBItemModels extends ItemModelProvider {
    public MBItemModels(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, Mulberry.MODID, fileHelper);
    }

    @Override
    protected void registerModels() {
        // Block items
        simpleBlockItems(
                MBBlocks.METEORITE_ROCK,
                MBBlocks.METEORITE_BLOCK,
                MBBlocks.METEORITE_SLAG_BLOCK
        );

        // Basic items
        basicItems(
                MBItems.METEORITE_INGOT,
                MBItems.METEORITE_SLAG,
                MBItems.METEORITE_PLATE,
                MBItems.IRON_PLATE,
                MBItems.STEEL_PLATE,
                MBItems.ELECTRUM_PLATE,


                MBItems.BREEZE_POWDER

        );
    }

    private void simpleBlockItems(DeferredBlock<?>... blocks) {
        for (var block : blocks)
            withExistingParent(
                    block.getId().toString(),
                    modLoc("block/" + block.getId().getPath())
            );
    }

    private void basicItems(ItemLike... items) {
        for (var item : items)
            basicItem(item.asItem());
    }
}