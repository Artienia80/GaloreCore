package corundum.mulberry.data;

import corundum.mulberry.Mulberry;
import corundum.mulberry.content.MBBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class MBBlockStates extends BlockStateProvider {
    public MBBlockStates(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, Mulberry.MODID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(MBBlocks.METEORIC_ROCK.get());
    }
}