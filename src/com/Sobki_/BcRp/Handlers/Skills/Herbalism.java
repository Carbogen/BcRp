package com.Sobki_.BcRp.Handlers.Skills;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.Sobki_.BcRp.Core;
import com.Sobki_.BcRp.Handlers.Methods;
import com.Sobki_.BcRp.config.ConfigManager;

public class Herbalism implements Listener, CommandExecutor {
	
	public ArrayList<UUID> whiteJadeBushList = new ArrayList<UUID>();
	
	@SuppressWarnings("serial")
	ArrayList<ItemStack> WTHerbs = new ArrayList<ItemStack>() {{
		add(Methods.createItem(Material.LONG_GRASS, 1, (short) 2, "§f", null, null, null, null));
	}};
	
	public ItemStack whiteJadeBush = Methods.createItem(Material.RED_ROSE, 1, (short) 8, "§fWhite Jade Bush", "§7- null", "§6§m§l{§e Unique §6§m§l}", null, null);
	public static ItemStack bacuiBerry = Methods.createItem(Material.MELON_SEEDS, 1, (short) 0, "§fBacui berry", "§7- Raw ingredient", "§6§m§l{§e Unique §6§m§l}", null, null);
	public ItemStack makeOleBerry = Methods.createItem(Material.MELON_SEEDS, 1, (short) 0, "§fMaka'ole berry", "§7- null", "§6§m§l{§e Unique §6§m§l}", null, null);
	
	@SuppressWarnings("serial")
	ArrayList<ItemStack> EKHerbs = new ArrayList<ItemStack>() {{
		add(Methods.createItem(Material.RED_ROSE, 1, (short) 8, "§fWhite Jade Bush", "§7- null", "§6§m§l{§e Unique §6§m§l}", null, null));
		add(Methods.createItem(Material.MELON_SEEDS, 1, (short) 0, "§fBacui berry", "§7- Raw ingredient", "§6§m§l{§e Unique §6§m§l}", null, null));
		add(Methods.createItem(Material.MELON_SEEDS, 1, (short) 0, "§fMaka'ole berry", "§7- null", "§6§m§l{§e Unique §6§m§l}", null, null));
		//Maka'ole berry
	}};
	
	@SuppressWarnings("serial")
	ArrayList<ItemStack> FNHerbs = new ArrayList<ItemStack>() {{
		add(Methods.createItem(Material.LONG_GRASS, 1, (short) 2, "§f", null, null, null, null));
	}};
	
	@SuppressWarnings("serial")
	ArrayList<ItemStack> ANHerbs = new ArrayList<ItemStack>() {{
		add(Methods.createItem(Material.LONG_GRASS, 1, (short) 2, "§f", null, null, null, null));
	}};
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		if (event.getBlock().getType() == Material.YELLOW_FLOWER && event.getBlock().getData() == (short) 3 || event.getBlock().getData() == (short) 2) {
			for (ItemStack is : EKHerbs) {
				event.setCancelled(true);
				event.getBlock().setType(Material.AIR);
				event.getBlock().getWorld().dropItem(event.getBlock().getLocation(), is);
			}
		} else if (event.getBlock().getType() == Material.LONG_GRASS && event.getBlock().getData() == (short) 0 || event.getBlock().getData() == (short) 2) {
			for (ItemStack is : EKHerbs) {
				event.setCancelled(true);
				event.getBlock().setType(Material.AIR);
				event.getBlock().getWorld().dropItem(event.getBlock().getLocation(), is);
			}
		} else if (event.getBlock().getType() == Material.SUGAR_CANE_BLOCK) {
			event.setCancelled(true);
			event.getBlock().setType(Material.AIR);
			event.getBlock().getWorld().dropItem(event.getBlock().getLocation(), Methods.createItem(Material.SUGAR_CANE, 1, (short) 0, "§fBamboo", null, null, null, null));
		}
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		Player p = (Player) event.getWhoClicked();
		Inventory inv = event.getInventory();
		if (event.getInventory().getTitle().equals("§0Medicine Crafting")) {
			if (event.getCurrentItem() == null) return;
			if (!(event.getCurrentItem().hasItemMeta())) return;
			if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§fBowl")) {
				if (event.getCursor().getType() == Material.BOWL) {
					inv.setItem(0, new ItemStack(Material.BOWL));
					if (event.getCursor().getAmount() == 1) {
						event.getCursor().setType(null);
					} else {
						event.getCursor().setAmount(event.getCursor().getAmount() - 1);
					}
					event.setCancelled(true);
					if (inv.getItem(0).equals(new ItemStack(Material.BOWL)) && inv.getItem(1).equals(new ItemStack(Material.STICK))) {
						if (inv.getItem(2).equals(bacuiBerry)) {
								
						} else if (null == null) {
							
						}
					}
				} else {
					p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1000000, 1000000);
					event.setCancelled(true);
				}
			} else if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§fStick")) {
				if (event.getCursor().getType() == Material.STICK) {
					inv.setItem(1, new ItemStack(Material.STICK));
					if (event.getCursor().getAmount() == 1) {
						event.getCursor().setType(null);
					} else {
						event.getCursor().setAmount(event.getCursor().getAmount() - 1);
					}
					event.setCancelled(true);
				} else {
					p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1000000, 1000000);
					event.setCancelled(true);
				}
			} else if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§fIngredient 1")) {
				if (event.getCursor().getItemMeta().getDisplayName() == bacuiBerry.getItemMeta().getDisplayName()) {
					inv.setItem(2, bacuiBerry);
					if (event.getCursor().getAmount() == 1) {
						event.getCursor().setType(null);
					} else {
						event.getCursor().setAmount(event.getCursor().getAmount() - 1);
					}
					event.setCancelled(true);
				} else {
					p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1000000, 1000000);
					event.setCancelled(true);
				}
			}
		}
	}
	
	@EventHandler
	public void onHerbRClick(PlayerInteractEvent event) {
		Player p = event.getPlayer();
		if (p.getItemInHand() == null) return;
		if (p.getItemInHand().getItemMeta().getDisplayName().equals("§fWhite Jade Bush")) {
			if (whiteJadeBushList.contains(p.getUniqueId())) whiteJadeBushList.remove(p.getUniqueId());
			Methods.removeItem(p.getItemInHand());
			whiteJadeBushList.add(p.getUniqueId());
			p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20 * 30, 0));
			p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 20 * 7, 0));
			p.playSound(p.getLocation(), Sound.EAT, 10, 1);
			p.sendMessage("§5§oYou start to feel ill after eating a poisonious plant...");
		} else if (p.getItemInHand().getItemMeta().getDisplayName().equals("§fBacui berry")) {
			if (whiteJadeBushList.contains(p.getUniqueId())) {
				Methods.removeItem(p.getItemInHand());
				whiteJadeBushList.remove(p.getUniqueId());
				p.removePotionEffect(PotionEffectType.POISON);
				p.playSound(p.getLocation(), Sound.EAT, 10, 1);
				p.sendMessage("§e§oYou eat some Bacui berries releaving the pain from the White Jade Bush.");
			}
		} else if (p.getItemInHand().getItemMeta().getDisplayName().equals("§fMaka'ole berry")) {
			Methods.removeItem(p.getItemInHand());
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 30, 1));
			p.playSound(p.getLocation(), Sound.EAT, 10, 1);
			p.sendMessage("§5§oYou lose vision after eating a mysterious type of berry.");
		}
	}
	
	public static void addHerbalismLevel(Player p, int amount) {
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		File file = ConfigManager.getPlayerF(p);
		config.set("Skills.herbalismLevel", config.getInt("Skills.herbalismLevel") + amount);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static void takeHerbalismLevel(Player p, int amount) {
		
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		File file = ConfigManager.getPlayerF(p);
		config.set("Skills.herbalismLevel", config.getInt("Skills.herbalismLevel") - amount);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static int getHerbalismLevel(Player p) {
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		return config.getInt("Skills.herbalismLevel");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("herbcraft")) {
				Inventory herbalismInv; {
					herbalismInv = Bukkit.getServer().createInventory(p, 9, "§0Medicine Crafting");
					herbalismInv.setItem(0, Methods.createItem(Material.THIN_GLASS, 1, (short) 0, "§fBowl", "§7This spot is for a bowl", null, null, null));
					herbalismInv.setItem(1, Methods.createItem(Material.THIN_GLASS, 1, (short) 0, "§fStick", "§7This spot is for a stick", null, null, null));
					herbalismInv.setItem(2, Methods.createItem(Material.THIN_GLASS, 1, (short) 0, "§fIngredient 1", "§7This spot is for your first ingredient", null, null, null));
					herbalismInv.setItem(3, Methods.createItem(Material.THIN_GLASS, 1, (short) 0, "§fIngredient 2", "§7This spot is for your second ingredient", "", "§7This spot may not be used", null));
					herbalismInv.setItem(4, Methods.createItem(Material.THIN_GLASS, 1, (short) 0, "§fIngredient 3", "§7This spot is for your third ingredient", "", "§7This spot may not be used", null));
					herbalismInv.setItem(5, Methods.createItem(Material.THIN_GLASS, 1, (short) 0, "§fIngredient 4", "§7This spot is for your fourth ingredient", "", "§7This spot may not be used", null));
					herbalismInv.setItem(6, Methods.createItem(Material.THIN_GLASS, 1, (short) 0, "§fIngredient 5", "§7This spot is for your fifth ingredient", "", "§7This spot may not be used", null));
					herbalismInv.setItem(8, Methods.createItem(Material.THIN_GLASS, 1, (short) 0, "§fResult", "§7This spot is for the item that you craft", null, null, null));
				}
				p.openInventory(herbalismInv);
			}
		} else {
			sender.sendMessage("Only players can use this command.");
		}
		return true;
	}

}
