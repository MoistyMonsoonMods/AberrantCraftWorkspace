package com.monsoon.aberrantcraft.client.entity;

import com.monsoon.aberrantcraft.AberrantCraft;
import com.monsoon.aberrantcraft.client.entity.model.BeardedDragonModel;
import com.monsoon.aberrantcraft.common.entity.BeardedDragon;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BeardedDragonRenderer extends MobRenderer<BeardedDragon, BeardedDragonModel<BeardedDragon>> {
	
	public static final ResourceLocation TEXTURE = new ResourceLocation(AberrantCraft.MOD_ID, "entity/beardeddragon/beardeddragon.png");

	public BeardedDragonRenderer(EntityRendererManager manager) {
		super(manager, new BeardedDragonModel<>(), 0.5f);


	}
	@Override
	public ResourceLocation getTextureLocation(BeardedDragon p_110775_1_) {
		return TEXTURE;
	}

}
