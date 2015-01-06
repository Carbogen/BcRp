package com.Sobki_.BcRp.Handlers.NPCs;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.Sobki_.BcRp.Handlers.Methods;

public class Blacksmith implements Listener {
	
	public static ItemStack createItem(Material material, int amount, String name, String lore1, String lore2, String lore3, String lore4, String lore5, Enchantment enchantment, int enchantmentNum) {
		ItemStack is = new ItemStack(material, amount);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(name);
		ArrayList<String> lore = new ArrayList<String>();
		if (lore1 != null) {
			lore.add(lore1);
		}
		if (lore2 != null) {
			lore.add(lore2);
		}
		if (lore3 != null) {
			lore.add(lore3);
		}
		if (lore4 != null) {
			lore.add(lore4);
		}
		if (lore5 != null) {
			lore.add(lore5);
		}
		
		if (enchantment !=null && enchantmentNum != 0) {
			is.addUnsafeEnchantment(enchantment, enchantmentNum);
		}
		
		im.setLore(lore);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static Inventory WNblacksmithInventoryMAIN = Bukkit.getServer().createInventory(null, 9, "§8§l[§3Water§8§l] §9Blacksmith"); {
		WNblacksmithInventoryMAIN.setItem(2, Methods.createItem(Material.DIAMOND_SWORD, 1, (short) 0, "§fWeapons", null, null, null, null));
		WNblacksmithInventoryMAIN.setItem(6, Methods.createItem(Material.IRON_CHESTPLATE, 1, (short) 0, "§fArmour", null, null, null, null));
	}
	
	public static Inventory WNblacksmithInventoryARMOUR = Bukkit.getServer().createInventory(null, 9, "§0Armour"); {
		WNblacksmithInventoryARMOUR.setItem(0, Methods.createItem(Material.LEATHER_CHESTPLATE, 1, (short) 0, "§fDeer Skin Armour", null, null, null, null));
	}
	
	public static Inventory WNblacksmithInventoryDeerSkinARMOUR = Bukkit.getServer().createInventory(null, 9, "§0Deer Skin Armour"); {
		WNblacksmithInventoryDeerSkinARMOUR.setItem(0, createItem(Material.LEATHER_HELMET, 1, "§fDeer Skin Cap", "§6Protection: §e1", "§6Min. Lvl: §e1", "§8§m§l{§7 Common §8§m§l}", "§d§lL.Click §8- §5Purchase", "§d§lR.Click §8- §5View Ingredients and Price", Enchantment.THORNS, 1));
	}
	
	public static Inventory WNblacksmithInventoryDeerSkinCapIngredients = Bukkit.getServer().createInventory(null, 9, "§0Deer Skin Cap Ingredients"); {
		WNblacksmithInventoryDeerSkinCapIngredients.setItem(0, Methods.createItem(Material.LEATHER_HELMET, 1, (short) 0, "§fDeer Skin Cap", "§6Protection: §e1", "§6Min. Lvl: §e1", "§8§m§l{§7 Common §8§m§l}", null));
		WNblacksmithInventoryDeerSkinCapIngredients.setItem(1, Methods.createItem(Material.QUARTZ, 1, (short) 0, "§fBoar-q-pine Tusk", "§8§m§l{§7 Common §8§m§l}", null, null, null));
		//WNblacksmithInventoryDeerSkinCapIngredients.setItem(8, Methods.createItem(Material.GOLD_INGOT, 10, null, null, null, null));
	}
	
	public static void setupIngredients() {

	}
	
	public static void spawnWNBlacksmith(Location loc) {
		Villager v = (Villager) loc.getWorld().spawn(loc, Villager.class);
		v.setCustomName("§8§l[§3Water§8§l] §9Blacksmith");
		v.setCustomNameVisible(true);
		v.setRemoveWhenFarAway(false);
		v.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 30));
		v.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000000, -30));
	}
	
	@EventHandler
	public void onPlayerInteractWNblacksmith(PlayerInteractEntityEvent event) {
		Player p = event.getPlayer();
		Entity e = event.getRightClicked();
		if (e instanceof Villager) {
			Villager v = (Villager) e;
			if (v.getCustomName() == null) return;
			if (v.getCustomName() == "§8§l[§3Water§8§l] §9Blacksmith") {
				event.setCancelled(true);
				p.openInventory(WNblacksmithInventoryMAIN);
				p.sendMessage("§8§l[§3Water§8§l] §9Blacksmith§8: §fWhat can I get for you?");
			}
		}
	}
	
	@EventHandler
	public void onInventoryClickWNblacksmith(InventoryClickEvent event) {
		Player p = (Player) event.getWhoClicked();
		if (event.getInventory().getName().equals(Blacksmith.WNblacksmithInventoryMAIN.getName())) {
			event.setCancelled(true);
			if (!event.getCurrentItem().hasItemMeta()) return;
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§fWeapons") {
				p.closeInventory();
				p.sendMessage("This feature has not been coded.");
			}
			
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§fArmour") {
				p.openInventory(WNblacksmithInventoryARMOUR);
			}
		}
		
		
		if (event.getInventory().getName().equalsIgnoreCase(Blacksmith.WNblacksmithInventoryARMOUR.getName())) {
			event.setCancelled(true);
			if (!event.getCurrentItem().hasItemMeta()) return;
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§fDeer Skin Armour") {
				p.openInventory(WNblacksmithInventoryDeerSkinARMOUR);
			}
		}
		
		if (event.getInventory().getName().equalsIgnoreCase(Blacksmith.WNblacksmithInventoryDeerSkinARMOUR.getName())) {
			event.setCancelled(true);
			if (!event.getCurrentItem().hasItemMeta()) return;
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§fDeer Skin Cap") {
				if (event.getClick().isRightClick()) {
					p.openInventory(WNblacksmithInventoryDeerSkinCapIngredients);
				} else if (event.getClick().isLeftClick()) {
					
				} else {}
			}
		}
	}

}
