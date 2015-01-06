package com.Sobki_.BcRp.Handlers.Mobs;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import com.Sobki_.BcRp.Handlers.Methods;
import com.Sobki_.BcRp.Utils.ChatUtilities;

public class Zombies implements Listener {
	
	public static void spawnZombieLvl1(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 1§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, null, null, null, null, Material.STICK);
			amount--;
		}
	}
	
	public static void spawnZombieLvl7(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 7§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, null, Material.LEATHER_CHESTPLATE, Material.LEATHER_LEGGINGS, null, Material.WOOD_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl13(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 13§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.LEATHER_HELMET, Material.LEATHER_CHESTPLATE, Material.LEATHER_LEGGINGS, Material.LEATHER_BOOTS, Material.WOOD_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl19(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 19§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.LEATHER_HELMET, Material.LEATHER_CHESTPLATE, Material.GOLD_LEGGINGS, Material.LEATHER_BOOTS, Material.WOOD_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl25(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 25§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.LEATHER_HELMET, Material.GOLD_CHESTPLATE, Material.GOLD_LEGGINGS, Material.LEATHER_BOOTS, Material.GOLD_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl31(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 31§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.GOLD_HELMET, Material.GOLD_CHESTPLATE, Material.GOLD_LEGGINGS, Material.GOLD_BOOTS, Material.GOLD_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl37(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 37§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.GOLD_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.GOLD_LEGGINGS, Material.GOLD_BOOTS, Material.GOLD_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl43(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 43§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.GOLD_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.CHAINMAIL_LEGGINGS, Material.GOLD_BOOTS, Material.STONE_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl49(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 49§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.CHAINMAIL_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.CHAINMAIL_LEGGINGS, Material.CHAINMAIL_BOOTS, Material.STONE_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl55(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 55§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.CHAINMAIL_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.IRON_LEGGINGS, Material.CHAINMAIL_BOOTS, Material.STONE_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl61(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 61§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.CHAINMAIL_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS, Material.IRON_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl67(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 67§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.IRON_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS, Material.IRON_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl73(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 73§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.IRON_HELMET, Material.IRON_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS, Material.IRON_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl79(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 79§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.IRON_HELMET, Material.DIAMOND_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS, Material.DIAMOND_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl85(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 85§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.IRON_HELMET, Material.DIAMOND_CHESTPLATE, Material.IRON_LEGGINGS, Material.DIAMOND_BOOTS, Material.DIAMOND_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl91(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 91§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.DIAMOND_HELMET, Material.DIAMOND_CHESTPLATE, Material.IRON_LEGGINGS, Material.DIAMOND_BOOTS, Material.DIAMOND_SWORD);
			amount--;
		}
	}
	
	public static void spawnZombieLvl97(Location loc, int amount) {
		while (amount > 0) {
			Zombie z = loc.getWorld().spawn(loc, Zombie.class);
			z.setCustomName("§5Bandit §8[§7Lvl 97§8]");
			z.setCustomNameVisible(true);
			Methods.setZombieEquipment(z, Material.DIAMOND_HELMET, Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS, Material.DIAMOND_SWORD);
			amount--;
		}
	}
	
	@EventHandler
	public void onZombieDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Zombie) {
			Zombie z = (Zombie) event.getEntity();
			if (z.getCustomName() == null) return;
			if (z.getCustomName() == "§5Bandit §8[§7Lvl 1§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				//int helmetDropChance = Methods.randomInteger(1, 100);
				//int chestplateDropChance = Methods.randomInteger(1, 100);
				//int leggingsDropChance = Methods.randomInteger(1, 100);
				//int bootsDropChance = Methods.randomInteger(1, 100);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(1);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 7§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				//int helmetDropChance = Methods.randomInteger(1, 100);
				int chestplateDropChance = Methods.randomInteger(1, 100);
				int leggingsDropChance = Methods.randomInteger(1, 100);
				//int bootsDropChance = Methods.randomInteger(1, 100);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				if (chestplateDropChance <= 50) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_CHESTPLATE, 1, (short) 0, "§fTattered Chestguard", "§6Protection: §e13", "§6Min. Lvl: §e7", ChatUtilities.commonString, null));
				}
				if (leggingsDropChance <= 50) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_LEGGINGS, 1, (short) 0, "§fTattered Leggings", "§6Protection: §e13", "§6Min. Lvl: §e7", ChatUtilities.commonString, null));
				}
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(7);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 13§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				int helmetDropChance = Methods.randomInteger(1, 100);
				int chestplateDropChance = Methods.randomInteger(1, 100);
				int leggingsDropChance = Methods.randomInteger(1, 100);
				int bootsDropChance = Methods.randomInteger(1, 100);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				if (helmetDropChance <= 50) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_HELMET, 1, (short) 0, "§fLeather Cap", "§6Protection: §e13", "§6Min. Lvl: §e13", ChatUtilities.commonString, null));
				}
				if (chestplateDropChance <= 50) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_CHESTPLATE, 1, (short) 0, "§fLeather Chestplate", "§6Protection: §e13", "§6Min. Lvl: §e13", ChatUtilities.commonString, null));
				}
				if (leggingsDropChance <= 50) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_LEGGINGS, 1, (short) 0, "§fLeather Legguards", "§6Protection: §e13", "§6Min. Lvl: §e13", ChatUtilities.commonString, null));
				}
				if (bootsDropChance <= 50) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_BOOTS, 1, (short) 0, "§fLeather Footings", "§6Protection: §e13", "§6Min. Lvl: §e13", ChatUtilities.commonString, null));
				}
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(13);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 19§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				int helmetDropChance = Methods.randomInteger(1, 100);
				int chestplateDropChance = Methods.randomInteger(1, 100);
				int leggingsDropChance = Methods.randomInteger(1, 100);
				int bootsDropChance = Methods.randomInteger(1, 100);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				if (helmetDropChance <= 50) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_HELMET, 1, (short) 0, "§fReinforced Cap", "§6Protection: §e13", "§6Min. Lvl: §e19", ChatUtilities.commonString, null));
				}
				if (chestplateDropChance <= 50) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_CHESTPLATE, 1, (short) 0, "§fReinforced Chestplate", "§6Protection: §e13", "§6Min. Lvl: §e19", ChatUtilities.commonString, null));
				}
				if (leggingsDropChance <= 40) {
					event.getDrops().add(Methods.createItem(Material.GOLD_LEGGINGS, 1, (short) 0, "§fEnchanted Leggings", "§6Protection: §e13", "§6Min. Lvl: §e19", ChatUtilities.uncommonString, null));
				}
				if (bootsDropChance <= 50) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_BOOTS, 1, (short) 0, "§fReinforced Footings", "§6Protection: §e13", "§6Min. Lvl: §e19", ChatUtilities.commonString, null));
				}
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(19);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 25§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				int helmetDropChance = Methods.randomInteger(1, 100);
				int chestplateDropChance = Methods.randomInteger(1, 100);
				int leggingsDropChance = Methods.randomInteger(1, 100);
				int bootsDropChance = Methods.randomInteger(1, 100);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				if (helmetDropChance <= 50) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_HELMET, 1, (short) 0, "§fBurnished Cowl", "§6Protection: §e13", "§6Min. Lvl: §e19", ChatUtilities.commonString, null));
				}
				if (chestplateDropChance <= 40) {
					event.getDrops().add(Methods.createItem(Material.GOLD_CHESTPLATE, 1, (short) 0, "§fEnchanted Tunic", "§6Protection: §e13", "§6Min. Lvl: §e19", ChatUtilities.uncommonString, null));
				}
				if (leggingsDropChance <= 40) {
					event.getDrops().add(Methods.createItem(Material.GOLD_LEGGINGS, 1, (short) 0, "§fEnchanted Kilt", "§6Protection: §e13", "§6Min. Lvl: §e19", ChatUtilities.uncommonString, null));
				}
				if (bootsDropChance <= 50) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_BOOTS, 1, (short) 0, "§fAcolyte's Treads", "§6Protection: §e13", "§6Min. Lvl: §e19", ChatUtilities.commonString, null));
				}
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(25);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 31§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(31);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 37§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(37);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 43§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(43);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 49§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(49);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 55§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(55);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 61§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(61);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 67§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(67);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 73§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(73);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 79§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(79);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 85§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(85);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 91§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(91);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Bandit §8[§7Lvl 97§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, ChatUtilities.junkItemString, null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateZombieExp(97);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			}
		}
	}

}
