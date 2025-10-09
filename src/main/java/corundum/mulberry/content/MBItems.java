package corundum.mulberry.content;

import corundum.mulberry.Mulberry;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MBItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mulberry.MODID);

    public static final DeferredItem<Item> METEORITE_INGOT = ITEMS.registerSimpleItem(
            "meteorite_ingot",
            new Item.Properties()
    );

    public static final DeferredItem<Item> METEORITE_SLAG = ITEMS.registerSimpleItem(
            "meteorite_slag",
            new Item.Properties()
    );

    public static final DeferredItem<Item> METEORITE_PLATE = ITEMS.registerSimpleItem(
            "meteorite_plate",
            new Item.Properties()
    );

    public static final DeferredItem<Item> IRON_PLATE = ITEMS.registerSimpleItem(
            "iron_plate",
            new Item.Properties()
    );

    public static final DeferredItem<Item> STEEL_PLATE = ITEMS.registerSimpleItem(
            "steel_plate",
            new Item.Properties()
    );

    public static final DeferredItem<Item> ELECTRUM_PLATE = ITEMS.registerSimpleItem(
            "electrum_plate",
            new Item.Properties()
    );

    public static final DeferredItem<Item> BREEZE_POWDER = ITEMS.registerSimpleItem(
            "breeze_powder",
            new Item.Properties()
    );
}