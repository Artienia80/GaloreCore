package corundum.mulberry.data;

import corundum.mulberry.Mulberry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Mulberry.MODID, bus = EventBusSubscriber.Bus.MOD)
public class MBDatagen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(
                event.includeClient(),
                new MBBlockStates(output, fileHelper)
        );

        generator.addProvider(
                event.includeClient(),
                new MBItemModels(output, fileHelper)
        );

        generator.addProvider(
                event.includeServer(),
                new MBRecipeProvider(output, lookupProvider)
        );
    }
}