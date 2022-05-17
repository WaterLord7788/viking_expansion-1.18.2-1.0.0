package com.waterlord7788.viking_expansion.blocks.custom;

import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class SpeedyBlock extends Block {

    // Changed the name using click on the name and pushing SHIFT+F6
    public SpeedyBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(!pLevel.isClientSide()){ // `!` means not - `!true` means not true
            if(pEntity instanceof LivingEntity){
                LivingEntity livingEntity = ((LivingEntity) pEntity);
                livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300));
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
