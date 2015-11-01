package com.jadedpacks.jadedbase.helpers;

import java.util.ArrayList;
import java.util.HashMap;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ItemStackHolder;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;
import forestry.api.arboriculture.EnumWoodType;
import forestry.api.arboriculture.IWoodItemAccess;
import forestry.api.arboriculture.TreeManager;
import static forestry.api.arboriculture.EnumWoodType.*;

public class Wood {
	
	public static void Init()
	{
		getLogs();
	}	
	

	private static final HashMap<EnumWoodType, ItemStack> logs = new HashMap<EnumWoodType, ItemStack>();

	public static ItemStack getLog(EnumWoodType type) {
		if(logs.containsKey(type)) {
			return logs.get(type).copy();
		}
		ItemStack log = TreeManager.woodItemAccess.getLog(type, false);
		logs.put(type, log);
		return log.copy();
	}
	
private static void getLogs() {
		
		larch = Wood.getLog(LARCH);
		teak = Wood.getLog(TEAK);
		acacia = Wood.getLog(ACACIA);
		lime = Wood.getLog(LIME);
		chesnut = Wood.getLog(CHESTNUT);
		wenge = Wood.getLog(WENGE);
		baobab = Wood.getLog(BAOBAB);
		sequoia = Wood.getLog(SEQUOIA);
		kapok = Wood.getLog(KAPOK);
		ebony = Wood.getLog(EBONY);
		mahogany = Wood.getLog(MAHOGANY);
		balsa = Wood.getLog(BALSA);
		willow = Wood.getLog(WILLOW);
		walnut = Wood.getLog(WALNUT);
		greenheart = Wood.getLog(GREENHEART);
		cherry = Wood.getLog(CHERRY);
		mahoe = Wood.getLog(MAHOE);
		poplar = Wood.getLog(POPLAR);
		palm = Wood.getLog(PALM);
		papaya = Wood.getLog(PAPAYA);
		pine = Wood.getLog(PINE);
		plum = Wood.getLog(PLUM);
		maple = Wood.getLog(MAPLE);
		citrus = Wood.getLog(CITRUS);
		giant = Wood.getLog(GIGANTEUM);
		ipe = Wood.getLog(IPE);
		padauk = Wood.getLog(PADAUK);
		coco = Wood.getLog(COCOBOLO);
		zebra = Wood.getLog(ZEBRAWOOD);
		
		
	}
	
	public static ItemStack pine;
	public static ItemStack plum;
	public static ItemStack maple;
	public static ItemStack citrus;
	public static ItemStack giant;
	public static ItemStack ipe;
	public static ItemStack padauk;
	public static ItemStack coco;
	public static ItemStack zebra;
	public static ItemStack walnut;
	public static ItemStack greenheart;
	public static ItemStack cherry;
	public static ItemStack mahoe;
	public static ItemStack poplar;
	public static ItemStack palm;
	public static ItemStack papaya;
	public static ItemStack chesnut;
	public static ItemStack wenge;
	public static ItemStack baobab;
	public static ItemStack sequoia;
	public static ItemStack kapok;
	public static ItemStack ebony;
	public static ItemStack mahogany;
	public static ItemStack balsa;
	public static ItemStack willow;
	public static ItemStack larch;
	public static ItemStack teak;
	public static ItemStack acacia;
	public static ItemStack lime;

}

