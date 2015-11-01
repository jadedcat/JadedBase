package com.jadedpacks.jadedbase.helpers;

import java.util.ArrayList;

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
import forestry.api.arboriculture.IWoodItemAccess;
import forestry.api.arboriculture.TreeManager;
import forestry.api.arboriculture.EnumWoodType;

public class Wood {
	
	Item larch = TreeManager.woodItemAccess.getLog(EnumWoodType LARCH, false);

}
