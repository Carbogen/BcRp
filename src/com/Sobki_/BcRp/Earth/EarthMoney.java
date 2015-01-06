package com.Sobki_.BcRp.Earth;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

import com.Sobki_.BcRp.Handlers.Methods;



public class EarthMoney {
	
	public static void giveEarthCopperPiece(Player p, int amount) {
		PlayerInventory pi = p.getInventory();
		pi.addItem(Methods.createItem(Material.CLAY_BRICK, amount, (short) 0, "§fCopper Piece", "§2§oOfficial Currency of the Earth Nation", null, null, null));
	}
	
	public static void giveEarthSilverPiece(Player p, int amount) {
		PlayerInventory pi = p.getInventory();
		pi.addItem(Methods.createItem(Material.IRON_INGOT, amount, (short) 0, "§fSilver Piece", "§2§oOfficial Currency of the Earth Nation", null, null, null));
	}
	
	public static void giveEarthGoldPiece(Player p, int amount) {
		PlayerInventory pi = p.getInventory();
		pi.addItem(Methods.createItem(Material.GOLD_NUGGET, amount,(short) 0,  "§fGold Piece", "§2§oOfficial Currency of the Earth Nation", null, null, null));
	}
	
	public static void giveEarthGoldIngot(Player p, int amount) {
		PlayerInventory pi = p.getInventory();
		pi.addItem(Methods.createItem(Material.GOLD_INGOT, amount,(short) 0,  "§fGold Ingot", "§2§oOfficial Currency of the Earth Nation", null, null, null));
	}
	
}
