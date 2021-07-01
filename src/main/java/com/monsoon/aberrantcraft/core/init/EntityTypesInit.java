package com.monsoon.aberrantcraft.core.init;

import com.monsoon.aberrantcraft.AberrantCraft;
import com.monsoon.aberrantcraft.common.entity.BeardedDragon;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypesInit {

	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			AberrantCraft.MOD_ID);

	public static final RegistryObject<EntityType<BeardedDragon>> BEARDEDDRAGON = ENTITY_TYPES.register("beardeddragon",
			() -> EntityType.Builder.of(BeardedDragon::new, EntityClassification.CREATURE).sized(1.3f, 0.6f)
					.build(new ResourceLocation(AberrantCraft.MOD_ID, "beardeddragon").toString()));

}
