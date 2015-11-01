package com.jadedpacks.jadedbase;



import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.jadedpacks.jadedbase.helpers.OreDictionaryTweaks;
import com.jadedpacks.jadedbase.helpers.RecipeRemover;
import com.jadedpacks.jadedbase.helpers.Parts;
import com.jadedpacks.jadedbase.helpers.Basic;

import forestry.api.arboriculture.IWoodItemAccess;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.ItemStackHolderInjector;
import cpw.mods.fml.common.event.FMLLoadCompleteEvent;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME,  dependencies = "required-after:Forge@[10.13.3.1384,11.14);")

public class Main {
	public static final String MODID = "JCBase";
	public static final String NAME = "JCBase";
	public static final String VERSION = "1.0.2";
	public static final Logger log = LogManager.getLogger(MODID);

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ItemStackHolderInjector.INSTANCE.inject();
		Parts.preInit();
		OreDictionaryTweaks.preInit();
		Basic.preInit();
	}
	@Mod.EventHandler
	public void init (FMLInitializationEvent event)

	{
		ItemStackHolderInjector.INSTANCE.inject();
		Parts.init();
		Main.log.info("parts");		
		OreDictionaryTweaks.init();
		Basic.init();

	}

	@Mod.EventHandler
	public void postInit (FMLPostInitializationEvent event)

	{
		ItemStackHolderInjector.INSTANCE.inject();
		Parts.postInit();		
		Basic.preInit();
	}

	@Mod.EventHandler
	public void loadComplete(FMLLoadCompleteEvent event)

	{
		if (Loader.isModLoaded("ThermalExpansion"))
		{
			//ThermalExpansionHelper.loadComplete();
		}

	}
}



