package com.monsoon.aberrantcraft.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class BeardedDragon extends MobEntity {

	public BeardedDragon(EntityType<? extends MobEntity> type, World worldIn) {
		super(type, worldIn);

	}
		
		public static AttributeModifierMap.MutableAttribute setAttributes() {
			return MobEntity.createMobAttributes()
					.add(Attributes.MAX_HEALTH, 10f)
					.add(Attributes.MOVEMENT_SPEED, 0.15f);
	
	}
	
	protected void registerGoals() {
		super.registerGoals();
		
		this.goalSelector.addGoal(1, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 8.0f));
			
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));	
	}		
	
	protected SoundEvent getDeathSound() {
		return SoundEvents.TURTLE_HURT_BABY;
	}
}
