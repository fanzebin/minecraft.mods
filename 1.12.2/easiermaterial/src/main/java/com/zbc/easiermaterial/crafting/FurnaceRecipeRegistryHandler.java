package com.zbc.easiermaterial.crafting;

import com.zbc.easiermaterial.registers.ItemRegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipeRegistryHandler {
    public static void register() {

        Block Granite = GameRegistry.findBlock();

        // 大块的缝合腐肉=>皮革
        GameRegistry.addSmelting(ItemRegistryHandler.LARGE_SUTURED_ROTTEN_FLESH, new ItemStack(Items.LEATHER), 1F);
        // 骨块=>石英块
        GameRegistry.addSmelting(Blocks.BONE_BLOCK, new ItemStack(Blocks.QUARTZ_BLOCK), 1F);
        // 花岗岩=>石英
        GameRegistry.addSmelting(Blocks.STONE, new ItemStack(Items.QUARTZ,4), 1F);
        // 磨制花岗岩=>石英
//        GameRegistry.addSmelting(ItemRegistryHandler.LARGE_SUTURED_ROTTEN_FLESH, new ItemStack(Items.LEATHER), 1F);
        // 闪长岩=>石英
//        GameRegistry.addSmelting(ItemRegistryHandler.LARGE_SUTURED_ROTTEN_FLESH, new ItemStack(Items.LEATHER), 1F);
        // 磨制闪长岩=>石英
//        GameRegistry.addSmelting(ItemRegistryHandler.LARGE_SUTURED_ROTTEN_FLESH, new ItemStack(Items.LEATHER), 1F);

    }


}