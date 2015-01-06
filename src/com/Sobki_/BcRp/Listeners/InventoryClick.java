package com.Sobki_.BcRp.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.Sobki_.BcRp.Commands.SkillsCommand;
import com.Sobki_.BcRp.Handlers.Methods;
import com.Sobki_.BcRp.Handlers.Skills.Forging;
import com.Sobki_.BcRp.Handlers.Skills.Herbalism;
import com.Sobki_.BcRp.Handlers.Skills.Jump;
import com.Sobki_.BcRp.Handlers.Skills.Speed;
import com.Sobki_.BcRp.Handlers.Skills.Strength;

public class InventoryClick implements Listener {
	
	public FileConfiguration config;
		
	@SuppressWarnings("unused")
	private static JavaPlugin plugin;
	
	@SuppressWarnings("static-access")
	public InventoryClick (JavaPlugin plugin) {
		this.plugin = plugin;
		config = plugin.getConfig();
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		final Player p = (Player) event.getWhoClicked();
		if (event.getInventory().getName().equals(PlayerInteractEntity.waterConfirmation.getName())) {
			event.setCancelled(true);
			if (!(event.getCurrentItem().hasItemMeta())) return;
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§e§lCONFIRM") {	
				p.closeInventory();
				if (Methods.getElement(p) == "WATER") {
					p.sendMessage("§5You have already joined the §9§lWater Nation§5.");
				} else if (Methods.getElement(p) == "EARTH") {
					p.sendMessage("§5You have already joined the §2§lEarth Nation§5.");
				} else if (Methods.getElement(p) == "FIRE") {
					p.sendMessage("§5You have already joined the §c§lFire Nation§5.");
				} else if (Methods.getElement(p) == "AIR") {
					p.sendMessage("§5You have already joined the §7§lAir Nation§5.");
				} else {
					Methods.setElement(p, "WATER");
					Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "b choose " + p.getName() + " water");
					p.sendMessage("§6You have joined the §9§lWater Nation§6!");
				}
			}
		}

		if (event.getInventory().getName().equals(PlayerInteractEntity.earthConfirmation.getName())) {
			event.setCancelled(true);
			if (!(event.getCurrentItem().hasItemMeta())) return;
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§e§lCONFIRM") {
				p.closeInventory();
				if (Methods.getElement(p) == "WATER") {
					p.sendMessage("§5You have already joined the §9§lWater Nation§5.");
				} else if (Methods.getElement(p) == "EARTH") {
					p.sendMessage("§5You have already joined the §2§lEarth Nation§5.");
				} else if (Methods.getElement(p) == "FIRE") {
					p.sendMessage("§5You have already joined the §c§lFire Nation§5.");
				} else if (Methods.getElement(p) == "AIR") {
					p.sendMessage("§5You have already joined the §7§lAir Nation§5.");
				} else {
					Methods.setElement(p, "EARTH");
					Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "b choose " + p.getName() + " earth");
					p.sendMessage("§6You have joined the §2§lEarth Nation§6!");
				}
			}
		}

		if (event.getInventory().getName().equals(PlayerInteractEntity.fireConfirmation.getName())) {
			event.setCancelled(true);
			if (!(event.getCurrentItem().hasItemMeta())) return;
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§e§lCONFIRM") {
				p.closeInventory();
				if (Methods.getElement(p) == "WATER") {
					p.sendMessage("§5You have already joined the §9§lWater Nation§5.");
				} else if (Methods.getElement(p) == "EARTH") {
					p.sendMessage("§5You have already joined the §2§lEarth Nation§5.");
				} else if (Methods.getElement(p) == "FIRE") {
					p.sendMessage("§5You have already joined the §c§lFire Nation§5.");
				} else if (Methods.getElement(p) == "AIR") {
					p.sendMessage("§5You have already joined the §7§lAir Nation§5.");
				} else {
					Methods.setElement(p, "FIRE");
					Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "b choose " + p.getName() + " fire");
					p.sendMessage("§6You have joined the §c§lFire Nation§6!");
				}
			}
		}
		
		if (event.getInventory().getName().equals(PlayerInteractEntity.airConfirmation.getName())) {
			event.setCancelled(true);
			if (!(event.getCurrentItem().hasItemMeta())) return;
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§e§lCONFIRM") {
				p.closeInventory();
				if (Methods.getElement(p) == "WATER") {
					p.sendMessage("§5You have already joined the §9§lWater Nation§5.");
				} else if (Methods.getElement(p) == "EARTH") {
					p.sendMessage("§5You have already joined the §2§lEarth Nation§5.");
				} else if (Methods.getElement(p) == "FIRE") {
					p.sendMessage("§5You have already joined the §c§lFire Nation§5.");
				} else if (Methods.getElement(p) == "AIR") {
					p.sendMessage("§5You have already joined the §7§lAir Nation§5.");
				} else {
					Methods.setElement(p, "AIR");
					Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "b choose " + p.getName() + " air");
					p.sendMessage("§6You have joined the §7§lAir Nation§6!");
				}
			}
		}
		
		if (event.getInventory().getName().equals(SkillsCommand.skillsInv.getName())) {
			event.setCancelled(true);
			if (!event.getCurrentItem().hasItemMeta()) return;
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§8§l> §fSpeed §8§l<") {
				if (event.getClick().isLeftClick()) {
					if (Speed.getSpeedLevel(p) >= 50) {
						p.closeInventory();
						p.sendMessage("§5You cannot level your speed skill up anymore.");
					} else {
						Speed.addSpeedLevel(p, 1);
						p.sendMessage("§e+§61 §eSpeed Level ( New Level: §6" + Speed.getSpeedLevel(p) +"§e )");
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 1);
					}
				} else if (event.getClick().isRightClick()) {
					p.closeInventory();
					p.sendMessage("§e" + config.getString("SpeedDescription"));
				} else {}
			} 
			
			
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§8§l> §eJump §8§l<") {
				if (event.getClick().isLeftClick()) {
					if (Jump.getJumpLevel(p) >= 50) {
						p.closeInventory();
						p.sendMessage("§5You cannot level your jump skill up anymore.");
					} else {
						Jump.addJumpLevel(p, 1);
						p.sendMessage("§e+§61 §eJump Level ( New Level: §6" + Jump.getJumpLevel(p) +"§e )");
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 1);
					}
				} else if (event.getClick().isRightClick()) {
					p.closeInventory();
					p.sendMessage("§e" + config.getString("JumpDescription"));
				} else {}
			}
			
			
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§8§l> §aHerbalism §8§l<") {
				if (event.getClick().isLeftClick()) {
					if (Herbalism.getHerbalismLevel(p) >= 50) {
						p.closeInventory();
						p.sendMessage("§5You cannot level your herbalism skill up anymore.");
					} else {
						Herbalism.addHerbalismLevel(p, 1);
						p.sendMessage("§e+§61 §eHerbalism Level ( New Level: §6" + Herbalism.getHerbalismLevel(p) +"§e )");
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 1);
					}
				} else if (event.getClick().isRightClick()) {
					p.closeInventory();
					p.sendMessage("§e" + config.getString("HerbalismDescription"));
				} else {}
			}
			
			
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§8§l> §cStrength §8§l<") {
				if (event.getClick().isLeftClick()) {
					if (Strength.getStrengthLevel(p) >= 50) {
						p.closeInventory();
						p.sendMessage("§5You cannot level your strength skill up anymore.");
					} else {
						Strength.addStrengthLevel(p, 1);
						p.sendMessage("§e+§61 §eStrength Level ( New Level: §6" + Strength.getStrengthLevel(p) +"§e )");
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 1);
					}
				} else if (event.getClick().isRightClick()) {
					p.closeInventory();
					p.sendMessage("§e" + config.getString("StrengthDescription"));
				} else {}
			}
			
			
			if (event.getCurrentItem().getItemMeta().getDisplayName() == "§8§l> §7Forging §8§l<") {
				if (event.getClick().isLeftClick()) {
					if (Forging.getForgingLevel(p) >= 50) {
						p.closeInventory();
						p.sendMessage("§5You cannot level your forging skill up anymore.");
					} else {
						Forging.addForgingLevel(p, 1);
						p.sendMessage("§e+§61 §eForging Level ( New Level: §6" + Forging.getForgingLevel(p) +"§e )");
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 1);
					}
				} else if (event.getClick().isRightClick()) {
					p.closeInventory();
					p.sendMessage("§e" + config.getString("ForgingDescription"));
				} else {}
			}
		}
	}

}
