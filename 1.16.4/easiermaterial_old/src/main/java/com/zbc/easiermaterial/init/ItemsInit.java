package com.zbc.easiermaterial.init;

import com.zbc.easiermaterial.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    // 大块的缝合腐肉
    public static final RegistryObject<Item> LARGE_SUTURED_ROTTEN_FLESH = ITEMS.register("large_sutured_rotten_flesh", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)));

    // 小块铁皮
    public static final RegistryObject<Item> LITTLE_IRON_SHEET = ITEMS.register("little_iron_sheet",()->new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)));

    // 潜影壳模型
    public static final RegistryObject<Item> SHULKER_SHELL_MODEL = ITEMS.register("shulker_shell_model",()->new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)));

    // 末影之眼粉末
    public static final RegistryObject<Item> ENDER_EYE_POWDER = ITEMS.register("ender_eye_powder",()->new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)));

    // 未知的有机结晶体
    public static final RegistryObject<Item> UNKNOWN_ORGANIC_CRYSTALLIZATION = ITEMS.register("unknown_organic_crystallization",()->new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)));

}
