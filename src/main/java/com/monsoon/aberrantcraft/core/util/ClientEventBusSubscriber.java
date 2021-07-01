package com.monsoon.aberrantcraft.core.util;

import com.monsoon.aberrantcraft.AberrantCraft;
import com.monsoon.aberrantcraft.client.entity.BeardedDragonRenderer;
import com.monsoon.aberrantcraft.core.init.EntityTypesInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = AberrantCraft.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
	
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BEARDEDDRAGON.get(), BeardedDragonRenderer::new);
		
		
		
		
		
	}

}
