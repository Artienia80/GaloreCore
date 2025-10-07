package corundum.mulberry.content;

import corundum.mulberry.Mulberry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MBBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mulberry.MODID);
    public static final DeferredRegister.Items BLOCK_ITEMS = DeferredRegister.createItems(Mulberry.MODID);

    public static final DeferredBlock<Block> METEORIC_ROCK = BLOCKS.registerSimpleBlock(
            "meteoric_rock",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 6.0F)
    );

    public static final DeferredItem<BlockItem> METEORIC_ROCK_ITEM = BLOCK_ITEMS.registerSimpleBlockItem(
            "meteoric_rock",
            METEORIC_ROCK
    );
}