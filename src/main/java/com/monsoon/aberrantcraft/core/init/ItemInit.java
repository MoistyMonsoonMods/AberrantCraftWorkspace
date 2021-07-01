package com.monsoon.aberrantcraft.core.init;

import com.monsoon.aberrantcraft.AberrantCraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			AberrantCraft.MOD_ID);

	public static final RegistryObject<Item> LIZARD_SKIN = ITEMS.register("lizard_skin",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
}
