package com.zbc.nativespawner;

import net.minecraft.entity.monster.*;
import net.minecraft.init.Items;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class LootTableEvent {

    @SubscribeEvent
    public void customLootTableDrop(LivingDropsEvent event) {
        ItemStack spawner_egg = new ItemStack(Items.SPAWN_EGG, 1);
        // =============================== 僵尸掉落 ===============================
        if (event.getEntityLiving() instanceof EntityZombie) {
            // 随机数
            Random rand = new Random();
            ItemMonsterPlacer.applyEntityIdToItemStack(spawner_egg, new ResourceLocation("minecraft", "zombie"));
            if (rand.nextInt(20) == 0)
                event.getEntityLiving().entityDropItem(spawner_egg, 0.0f);
        }
        // =============================== 骷髅掉落 ===============================
        if (event.getEntityLiving() instanceof EntitySkeleton) {
            // 随机数
            Random rand = new Random();
            ItemMonsterPlacer.applyEntityIdToItemStack(spawner_egg, new ResourceLocation("minecraft", "skeleton"));
            if (rand.nextInt(20) == 0)
                event.getEntityLiving().entityDropItem(spawner_egg, 0.0f);
        }
        // =============================== 苦力怕掉落 ===============================
        if (event.getEntityLiving() instanceof EntityCreeper) {
            // 随机数
            Random rand = new Random();
            ItemMonsterPlacer.applyEntityIdToItemStack(spawner_egg, new ResourceLocation("minecraft", "creeper"));
            if (rand.nextInt(20) == 0)
                event.getEntityLiving().entityDropItem(spawner_egg, 0.0f);
        }
        // =============================== 蜘蛛掉落 ===============================
        if (event.getEntityLiving() instanceof EntitySpider) {
            // 随机数
            Random rand = new Random();
            ItemMonsterPlacer.applyEntityIdToItemStack(spawner_egg, new ResourceLocation("minecraft", "spider"));
            if (rand.nextInt(20) == 0)
                event.getEntityLiving().entityDropItem(spawner_egg, 0.0f);
        }
        // =============================== 烈焰人掉落 ===============================
        if (event.getEntityLiving() instanceof EntityBlaze) {
            // 随机数
            Random rand = new Random();
            ItemMonsterPlacer.applyEntityIdToItemStack(spawner_egg, new ResourceLocation("minecraft", "blaze"));
            if (rand.nextInt(20) == 0)
                event.getEntityLiving().entityDropItem(spawner_egg, 0.0f);
        }
        // =============================== 僵尸猪人掉落 ===============================
        if (event.getEntityLiving() instanceof EntityPigZombie) {
            // 随机数
            Random rand = new Random();
            ItemMonsterPlacer.applyEntityIdToItemStack(spawner_egg, new ResourceLocation("minecraft", "zombie_pigman"));
            if (rand.nextInt(20) == 0)
                event.getEntityLiving().entityDropItem(spawner_egg, 0.0f);
        }
        // =============================== 凋零骷髅掉落 ===============================
        if (event.getEntityLiving() instanceof EntityWitherSkeleton) {
            // 随机数
            Random rand = new Random();
            ItemMonsterPlacer.applyEntityIdToItemStack(spawner_egg, new ResourceLocation("minecraft", "wither_skeleton"));
            if (rand.nextInt(20) == 0)
                event.getEntityLiving().entityDropItem(spawner_egg, 0.0f);
        }
        // =============================== 末影人掉落 ===============================
        if (event.getEntityLiving() instanceof EntityEnderman) {
            // 随机数
            Random rand = new Random();
            ItemMonsterPlacer.applyEntityIdToItemStack(spawner_egg, new ResourceLocation("minecraft", "enderman"));
            if (rand.nextInt(20) == 0)
                event.getEntityLiving().entityDropItem(spawner_egg, 0.0f);
        }
        // =============================== 守卫者掉落 ===============================
        if (event.getEntityLiving() instanceof EntityGuardian) {
            // 随机数
            Random rand = new Random();
            int rand1 = rand.nextInt(4);
            ItemStack guardian_egg = new ItemStack(Items.SPAWN_EGG, rand1);

            ItemMonsterPlacer.applyEntityIdToItemStack(guardian_egg, new ResourceLocation("minecraft", "guardian"));
            if (rand.nextInt(10) == 0)
                event.getEntityLiving().entityDropItem(guardian_egg, 0.0f);
        }
    }
}
