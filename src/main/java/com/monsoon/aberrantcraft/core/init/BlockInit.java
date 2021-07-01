package com.monsoon.aberrantcraft.core.init;

import com.monsoon.aberrantcraft.AberrantCraft;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			AberrantCraft.MOD_ID);

	public static final RegistryObject<Block> ABERRANT_DIRT = BLOCKS.register("aberrant_dirt",
			() -> new Block(AbstractBlock.Properties.of(Material.DIRT, MaterialColor.CLAY)
					.strength(0.5f, 0.5f).harvestTool(ToolType.SHOVEL).harvestLevel(0)
					.sound(SoundType.GRAVEL)));
	
	public static final RegistryObject<Block> ABERRANT_GRASS_BLOCK = BLOCKS.register("aberrant_grass_block",
			() -> new Block(AbstractBlock.Properties.of(Material.DIRT, MaterialColor.COLOR_CYAN)
					.strength(0.6f, 0.6f).harvestTool(ToolType.SHOVEL).harvestLevel(0)
					.sound(SoundType.GRASS)));
}
