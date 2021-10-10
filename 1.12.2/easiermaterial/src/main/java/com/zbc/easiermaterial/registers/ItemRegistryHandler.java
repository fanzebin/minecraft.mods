package com.zbc.easiermaterial.registers;

import com.zbc.easiermaterial.items.LargeSuturedRottenFlesh;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ItemRegistryHandler {

    public static final LargeSuturedRottenFlesh LARGE_SUTURED_ROTTEN_FLESH = new LargeSuturedRottenFlesh();

    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(LARGE_SUTURED_ROTTEN_FLESH);
    }

    @SubscribeEvent
    public static void onModelRegistry(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(LARGE_SUTURED_ROTTEN_FLESH,0,new ModelResourceLocation(LARGE_SUTURED_ROTTEN_FLESH.getRegistryName(),"inventory"));
    }


}
