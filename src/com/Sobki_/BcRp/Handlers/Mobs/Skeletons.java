package com.Sobki_.BcRp.Handlers.Mobs;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import com.Sobki_.BcRp.Handlers.Methods;

public class Skeletons implements Listener {
	
	public static void spawnSkeletonLvl1(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 1§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, null, null, null, null, Material.STICK);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl7(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 7§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, null, Material.LEATHER_CHESTPLATE, Material.LEATHER_LEGGINGS, null, Material.WOOD_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl13(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 13§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.LEATHER_HELMET, Material.LEATHER_CHESTPLATE, Material.LEATHER_LEGGINGS, Material.LEATHER_BOOTS, Material.WOOD_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl19(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 19§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.LEATHER_HELMET, Material.LEATHER_CHESTPLATE, Material.GOLD_LEGGINGS, Material.LEATHER_BOOTS, Material.WOOD_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl25(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 25§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.LEATHER_HELMET, Material.GOLD_CHESTPLATE, Material.GOLD_LEGGINGS, Material.LEATHER_BOOTS, Material.GOLD_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl31(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 31§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.GOLD_HELMET, Material.GOLD_CHESTPLATE, Material.GOLD_LEGGINGS, Material.GOLD_BOOTS, Material.GOLD_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl37(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 37§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.GOLD_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.GOLD_LEGGINGS, Material.GOLD_BOOTS, Material.GOLD_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl43(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 43§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.GOLD_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.CHAINMAIL_LEGGINGS, Material.GOLD_BOOTS, Material.STONE_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl49(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 49§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.CHAINMAIL_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.CHAINMAIL_LEGGINGS, Material.CHAINMAIL_BOOTS, Material.STONE_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl55(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 55§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.CHAINMAIL_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.IRON_LEGGINGS, Material.CHAINMAIL_BOOTS, Material.STONE_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl61(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 61§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.CHAINMAIL_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS, Material.IRON_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl67(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 67§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.IRON_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS, Material.IRON_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl73(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 73§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.IRON_HELMET, Material.IRON_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS, Material.IRON_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl79(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 79§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.IRON_HELMET, Material.DIAMOND_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS, Material.DIAMOND_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl85(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 85§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.IRON_HELMET, Material.DIAMOND_CHESTPLATE, Material.IRON_LEGGINGS, Material.DIAMOND_BOOTS, Material.DIAMOND_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl91(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 91§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.DIAMOND_HELMET, Material.DIAMOND_CHESTPLATE, Material.IRON_LEGGINGS, Material.DIAMOND_BOOTS, Material.DIAMOND_SWORD);
			amount--;
		}
	}
	
	public static void spawnSkeletonLvl97(Location loc, int amount) {
		while (amount > 0) {
			Skeleton z = loc.getWorld().spawn(loc, Skeleton.class);
			z.setCustomName("§5Skeleton §8[§7Lvl 97§8]");
			z.setCustomNameVisible(true);
			Methods.setSkeletonEquipment(z, Material.DIAMOND_HELMET, Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS, Material.DIAMOND_SWORD);
			amount--;
		}
	}
	
	@EventHandler
	public void onSkeletonDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Skeleton) {
			Skeleton z = (Skeleton) event.getEntity();
			if (z.getCustomName() == null) return;
			if (z.getCustomName() == "§5Skeleton §8[§7Lvl 1§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(1);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 7§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				//int otterPenguinTunicDropChance = Methods.randomInteger(1, 2);
				//int otterPenguinPantsDropChance = Methods.randomInteger(1, 2);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				/*
				if (otterPenguinTunicDropChance == 1) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_CHESTPLATE, 1, (short) 0, "§7Otter Penguin Tunic", "§6Protection: §e13", "§6Min. Lvl: §e7", "§8§m§l{§f Common §8§m§l}", null));
				}
				if (otterPenguinPantsDropChance == 11) {
					event.getDrops().add(Methods.createItem(Material.LEATHER_LEGGINGS, 1, (short) 0, "§7Otter Penguin Pants", "§6Protection: §e13", "§6Min. Lvl: §e7", "§8§m§l{§f Common §8§m§l}", null));
				}
				*/
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(7);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 13§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(13);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 19§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(19);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 25§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(25);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 31§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(31);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 37§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(37);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 43§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(43);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 49§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(49);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 55§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(55);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 61§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(61);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 67§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(67);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 73§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(73);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 79§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(79);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 85§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(85);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 91§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(91);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			} else if (z.getCustomName() == "§5Skeleton §8[§7Lvl 97§8]") {
				event.getDrops().clear();
				int rottenFleshDropChance = Methods.randomInteger(1, 10);
				if (rottenFleshDropChance < 10) {
					event.getDrops().add(Methods.createItem(Material.ROTTEN_FLESH, Methods.randomInteger(1, 3), (short) 0, null, "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				}
				
				// TODO ARMOUR / WEAPON DROPS
				
				event.setDroppedExp(0);
				if (z.getKiller() instanceof Player) {
					Player p = (Player) z.getKiller();
					int experience = Methods.calculateSkeletonExp(97);
					Methods.giveExperience(p, experience);
					Methods.sendExpGainMsg(p, experience);
				}
			}
		}
	}

}
