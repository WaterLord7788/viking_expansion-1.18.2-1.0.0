package com.waterlord7788.viking_expansion.items.custom;

import com.waterlord7788.viking_expansion.entity.projectile.SapphireArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SapphireArrowItem extends ArrowItem {
    public SapphireArrowItem(Properties properties) {
        super(properties);
    }

    public AbstractArrow createArrow(Level pLevel, ItemStack pStack, LivingEntity pShooter) {
        return new SapphireArrow(pLevel, pShooter);
    }
}
