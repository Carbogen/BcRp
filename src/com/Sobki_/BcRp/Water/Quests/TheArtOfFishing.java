package com.Sobki_.BcRp.Water.Quests;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.Sobki_.BcRp.Handlers.Methods;
import com.Sobki_.BcRp.config.ConfigManager;

public class TheArtOfFishing implements Listener {
	
	static ArrayList<UUID> YuFuSpeaking = new ArrayList<UUID>();
	static ArrayList<UUID> YuFuSpoken = new ArrayList<UUID>();
	
	public static void spawnYuFu(Location loc) {
		Villager v = (Villager) loc.getWorld().spawn(loc, Villager.class);
		v.setCustomName("§8(§37§8) §8§l[§3Water§8§l] §9Yu Fu §8§oQuest NPC");
		v.setCustomNameVisible(true);
		v.setRemoveWhenFarAway(false);
		v.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 30));
		v.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, -30));
	}
	
	public  static  Inventory inv = Bukkit.getServer().createInventory(null, 9); {
		inv.setItem(2, Methods.createItem(Material.WOOL, 1, (short) 4, "§eAccept", null, null, null, null));
		inv.setItem(6, Methods.createItem(Material.WOOL, 1, (short) 10, "§5Decline", null, null, null, null));
	}
	
	public static void runTheArtOfFishing(Player p) {
		if (YuFuSpeaking.contains(p.getUniqueId())) return;
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		if (config.getBoolean("Quests.Water.TheArtOfFishing") == false) {
			if (YuFuSpoken.contains(p.getUniqueId())) {
				if (p.getInventory().getItemInHand().getType() == Material.RAW_FISH && p.getInventory().getItemInHand().getAmount() <= 5) {
					p.getInventory().getItemInHand().setAmount(p.getInventory().getItemInHand().getAmount() - 5);
					p.sendMessage("§8(§31§8) §8§l[§3Water§8§l] §9Yu Fu§8: §fThank you for getting me the fish.");
					config.set("Quests.Water.TheArtOfFishing", true);
					//TODO Give Rewards
				} else {
					p.sendMessage("§8(§31§8) §8§l[§3Water§8§l] §9Yu Fu§8: §fWhere are the fish I asked for?");
				}
			} else {
				p.sendMessage("What the kind gentleman says on first speak");
				YuFuSpoken.add(p.getUniqueId());
			}
		}
	}
	
	
	@EventHandler
	public void onInvClick(InventoryClickEvent e){
		if(e.getInventory().getTitle().equalsIgnoreCase("")){
			if(!e.getCurrentItem().hasItemMeta()) return;
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(null)) return;
			Player p = (Player) e.getWhoClicked();
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Accept")){
				
				p.closeInventory();
				p.sendMessage(ChatColor.YELLOW + "You have accepted: The Art Of Fishing");
				p.sendMessage(ChatColor.YELLOW + "To complete this quest, you must collect 5 Fish and return them to Yu Fu");
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Deny")){
				p.closeInventory();
				p.sendMessage(ChatColor.RED + "You have denied the quest: The Art of Fishing");
				
			}
		}
	}

}
