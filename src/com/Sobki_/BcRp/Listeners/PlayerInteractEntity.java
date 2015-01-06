package com.Sobki_.BcRp.Listeners;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.Sobki_.BcRp.Water.Quests.DangeredVillage;

public class PlayerInteractEntity implements Listener {
	
	public ItemStack createItem(Material material, int amount, short shrt,
			String displayname, String lore1, String lore2, String lore3, String lore4, String lore5) {
			ItemStack item = new ItemStack(material, amount, (short) shrt);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(displayname);
			ArrayList<String> Lore = new ArrayList<String>();
			Lore.add(lore1);
			Lore.add(lore2);
			Lore.add(lore3);
			Lore.add(lore4);
			Lore.add(lore5);
			meta.setLore(Lore);

			item.setItemMeta(meta);
			return item;
		}
	
	public static Inventory waterConfirmation; {
		waterConfirmation = Bukkit.getServer().createInventory(null, 9, "§9§lWater Confirmation");
		
		waterConfirmation.setItem(4, createItem(Material.WATER, 1, (short) 0, "§e§lCONFIRM", "", "§fDo you wish to join the Water Nation?", "", "§4§lWARNING:", "§cAfter choosing a nation, you cannot change."));
	}
	
	public static Inventory earthConfirmation; {
		earthConfirmation = Bukkit.getServer().createInventory(null, 9, "§2§lEarth Confirmation");
		
		earthConfirmation.setItem(4, createItem(Material.DIRT, 1, (short) 0, "§e§lCONFIRM", "", "§fDo you wish to join the Earth Nation?", "", "§4§lWARNING:", "§cAfter choosing a nation, you cannot change."));
	}
	
	public static Inventory fireConfirmation; {
		fireConfirmation = Bukkit.getServer().createInventory(null, 9, "§c§lFire Confirmation");
		
		fireConfirmation.setItem(4, createItem(Material.FIRE, 1, (short) 0, "§e§lCONFIRM", "", "§fDo you wish to join the Fire Nation?", "", "§4§lWARNING:", "§cAfter choosing a nation, you cannot change."));
	}
	
	public static Inventory airConfirmation; {
		airConfirmation = Bukkit.getServer().createInventory(null, 9, "§7§lAir Confirmation");
		
		airConfirmation.setItem(4, createItem(Material.STICK, 1, (short) 0, "§e§lCONFIRM", "", "§fDo you wish to join the Air Nation?", "", "§4§lWARNING:", "§cAfter choosing a nation, you cannot change."));
	}
	
	@EventHandler
	public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
		Player p = event.getPlayer();
		Entity e = event.getRightClicked();
		if (e instanceof Villager) {
			Villager v = (Villager) e;
			if (v.getCustomName() == null) return;
			if (v.getCustomName().equals("§9§lWater")) {
				event.setCancelled(true);
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
				p.openInventory(waterConfirmation);
			}
			
			else if (v.getCustomName().equals("§2§lEarth")) {
				event.setCancelled(true);
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
				p.openInventory(earthConfirmation);
			}

			else if (v.getCustomName().equals("§c§lFire")) {
				event.setCancelled(true);
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
				p.openInventory(fireConfirmation);
			}

			else if (v.getCustomName().equals("§7§lAir")) {
				event.setCancelled(true);
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
				p.openInventory(airConfirmation);
			}
			
			else if (v.getCustomName().equals(DangeredVillage.mainNPCName)) {
				DangeredVillage.runDangeredVillage(p);
			}
			
		}
	}

}
