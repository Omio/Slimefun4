package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines;

import me.mrCookieSlime.CSCoreLibPlugin.compatibility.MaterialHelper;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;

public abstract class ElectrifiedCrucible extends AContainer {

	public ElectrifiedCrucible(Category category, ItemStack item, String name, RecipeType recipeType, ItemStack[] recipe) {
		super(category, item, name, recipeType, recipe);
	}
	
	@Override
	public void registerDefaultRecipes() {
		registerRecipe(10, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.COBBLESTONE, 16)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		// Cycle through the 15 colours of Terracotta by hand until we can get a better loop fix.
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.WHITE_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.ORANGE_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.MAGENTA_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.LIGHT_BLUE_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.YELLOW_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.LIME_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.PINK_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.GRAY_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.LIGHT_GRAY_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.CYAN_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.PURPLE_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.BLUE_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.BROWN_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.RED_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		registerRecipe(8, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.BLACK_TERRACOTTA, 12)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
		// Now that we're done with that...
		registerRecipe(10, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.OAK_LEAVES, 16)}, new ItemStack[]{new ItemStack(Material.WATER_BUCKET)});
		registerRecipe(10, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.BIRCH_LEAVES, 16)}, new ItemStack[]{new ItemStack(Material.WATER_BUCKET)});
		registerRecipe(10, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.SPRUCE_LEAVES, 16)}, new ItemStack[]{new ItemStack(Material.WATER_BUCKET)});
		registerRecipe(10, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.JUNGLE_LEAVES, 16)}, new ItemStack[]{new ItemStack(Material.WATER_BUCKET)});
		registerRecipe(10, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.ACACIA_LEAVES, 16)}, new ItemStack[]{new ItemStack(Material.WATER_BUCKET)});
		registerRecipe(10, new ItemStack[] {new ItemStack(Material.BUCKET), new ItemStack(Material.DARK_OAK_LEAVES, 16)}, new ItemStack[]{new ItemStack(Material.WATER_BUCKET)});
	}
	
	@Override
	public String getMachineIdentifier() {
		return "ELECTRIFIED_CRUCIBLE";
	}

	@Override
	public ItemStack getProgressBar() {
		return new ItemStack(Material.FLINT_AND_STEEL);
	}
	
	@Override
	public String getInventoryTitle() {
		return "&4Electrified Crucible";
	}

}
