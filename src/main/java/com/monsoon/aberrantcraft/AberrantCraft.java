package com.monsoon.aberrantcraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.monsoon.aberrantcraft.common.entity.BeardedDragon;
import com.monsoon.aberrantcraft.core.init.BlockInit;
import com.monsoon.aberrantcraft.core.init.EntityTypesInit;
import com.monsoon.aberrantcraft.core.init.ItemInit;
import com.monsoon.aberrantcraft.core.network.BasicNetwork;

import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("aberrantcraft")
@Mod.EventBusSubscriber(modid = AberrantCraft.MOD_ID, bus = Bus.MOD)
public class AberrantCraft {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "aberrantcraft";

	public AberrantCraft() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		bus.addListener(this::commonSetup);
		
		EntityTypesInit.ENTITY_TYPES.register(bus);
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(ItemGroup.TAB_MISC))
					.setRegistryName(block.getRegistryName()));
		});
	}
	
	@SuppressWarnings("deprecation")
	public void commonSetup(final FMLCommonSetupEvent event) {
		BasicNetwork.init();
		
		DeferredWorkQueue.runLater(() -> {
			GlobalEntityTypeAttributes.put(EntityTypesInit.BEARDEDDRAGON.get(), BeardedDragon.setAttributes().build());
		});
	}

}
