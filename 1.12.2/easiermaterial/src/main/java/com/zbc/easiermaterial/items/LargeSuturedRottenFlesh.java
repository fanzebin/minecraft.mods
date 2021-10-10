package com.zbc.easiermaterial.items;

import com.zbc.easiermaterial.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LargeSuturedRottenFlesh extends Item {
    public LargeSuturedRottenFlesh(){
        this.setUnlocalizedName(Main.MODID+".largeSuturedRottenFlesh");
        this.setRegistryName("large_sutured_rotten_flesh");
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }
}
