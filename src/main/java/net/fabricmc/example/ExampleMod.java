package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {
	public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Block FABRIC_BLOCK = new Block(FabricBlockSettings.of(Material.WOOL).hardness(4.0f));
    public static final Item WOOL_YARN = new Item(new Item.Settings().group(ItemGroup.MISC));



	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("fabric_mod", "fabric_item"), FABRIC_ITEM);
        Registry.register(Registry.BLOCK, new Identifier("fabric_mod", "fabric_block"), FABRIC_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("fabric_mod", "wool_yarn");
		Registry.register(Registry.ITEM, new Identifier("fabric_mod", "fabric_block"), new BlockItem(FABRIC_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
		System.out.println("Hello Fabric world!");
	}
}
