package corundum.mulberry.data;

import corundum.mulberry.Mulberry;
import corundum.mulberry.content.MBBlocks;
import corundum.mulberry.content.MBItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class MBItemModels extends ItemModelProvider {
    public MBItemModels(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, Mulberry.MODID, fileHelper);
    }

    @Override
    protected void registerModels() {
        // Block item uses the block's model
        withExistingParent(
                MBBlocks.METEORIC_ROCK_ITEM.getId().toString(),
                modLoc("block/meteoric_rock")
        );

        // Regular item uses generated model
        basicItem(MBItems.METEORITE_INGOT.get());
    }
}