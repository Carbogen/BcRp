package com.Sobki_.BcRp.Water;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

import com.Sobki_.BcRp.Handlers.Methods;

public class WaterMoney {
	
	public static void giveWaterTribeMoney(Player p, int amount) {
		PlayerInventory pi = p.getInventory();
		pi.addItem(Methods.createItem(Material.INK_SACK, amount, (short) 4, "§fWater Tribe Money", "§2§oOfficial Currency of the Water Nation", null, null, null));
	}
	

}
   