package corundum.mulberry.content;

import corundum.mulberry.Mulberry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MBBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mulberry.MODID);

    public static final DeferredBlock<Block> METEORITE_ROCK = registerBlockAndItem(
            "meteorite_rock",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 6.0F)
            )
    );

    public static final DeferredBlock<Block> METEORITE_BLOCK = registerBlockAndItem(
            "meteorite_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 6.0F)
            )
    );

    public static final DeferredBlock<Block> METEORITE_SLAG_BLOCK = registerBlockAndItem(
            "meteorite_slag_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 6.0F)
            )
    );

    public static <T extends Block> DeferredBlock<T> registerBlockAndItem(String name, Supplier<T> block) {
        var register = BLOCKS.register(name, block);

        MBItems.ITEMS.registerSimpleBlockItem(
                name,
                register
        );

        return register;
    }
}