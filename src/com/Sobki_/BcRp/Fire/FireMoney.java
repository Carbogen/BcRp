package com.Sobki_.BcRp.Fire;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

import com.Sobki_.BcRp.Handlers.Methods;

public class FireMoney {
	
	public static void giveFireCopperPiece(Player p, int amount) {
		PlayerInventory pi = p.getInventory();
		pi.addItem(Methods.createItem(Material.CLAY_BRICK, amount, (short) 0, "§fCopper Piece", "§c§oOfficial Currency of the Fire Nation", null, null, null));
	}
	
	public static void giveFireSilverPiece(Player p, int amount) {
		PlayerInventory pi = p.getInventory();
		pi.addItem(Methods.createItem(Material.IRON_INGOT, amount, (short) 0, "§fSilver Piece", "§c§oOfficial Currency of the Fire Nation", null, null, null));
	}
	
	public static void giveFireGoldPiece(Player p, int amount) {
		PlayerInventory pi = p.getInventory();
		pi.addItem(Methods.createItem(Material.GOLD_NUGGET, amount,(short) 0,  "§fGold Piece", "§c§oOfficial Currency of the Fire Nation", null, null, null));
	}

}
