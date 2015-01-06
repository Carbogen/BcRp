package com.Sobki_.BcRp.Handlers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import com.Sobki_.BcRp.Core;
import com.Sobki_.BcRp.config.ConfigManager;

public class Methods {
	
	public static int maxLevel = 100;
	
	public static ItemStack createItem(Material material, int amount, short shrt, String name, String lore1, String lore2, String lore3, String lore4) {
		ItemStack is = new ItemStack(material, amount, (short) shrt);
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
		
		im.setLore(lore);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static void sendExpGainMsg(Player p, int experience) {
		p.sendMessage("§e+§6" + experience + " §eExperience");
	}
	
	// nSolve(50=10+x*97,x)
	
	public static int calculateZombieExp(int zombieLevel) {
		double rate = 0.412371;
		int experience = (int) (10 + rate * zombieLevel);
		return experience;
	}
	
	public static int calculateSkeletonExp(int skeletonLevel) {
		double rate = 0.412371;
		int experience = (int) (10 + rate * skeletonLevel);
		return experience;
	}
	
	/*
	public static void addFriend(Player player, Player target) {
		File file = new File(Core.plugin.getDataFolder() + "/Players/", player.getUniqueId().toString() + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		if (config.getString("Friends." + target.getUniqueId().toString()) == null) {
			config.set("Friends." + target.getUniqueId().toString() + ".Name", target.getName());
			config.set("Friends." + target.getUniqueId().toString() + ".PlayerInformation", target);
			config.set("Friends." + target.getUniqueId().toString() + ".Friends", true);
		}
	}
	/*
	public static void removeFriend(Player player, Player target) {
		File file = new File(Core.plugin.getDataFolder() + "/Players/", player.getUniqueId().toString() + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		if (config.getString("Friends." + target.getUniqueId().toString()) != null) {
			config.set("Friends." + target.getUniqueId().toString() + ".Name", target.getName());
			config.set("Friends." + target.getUniqueId().toString() + ".PlayerInformation", target);
			config.set("Friends." + target.getUniqueId().toString() + ".Friends", false);
		}
	}
	
	public static String getFriends(Player player) {
		//File file = new File(Core.plugin.getDataFolder() + "/Players/", player.getUniqueId().toString() + ".yml");
		//FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		/*for (String playerName : config.get("")) {
			
		}*/
		//return null;
	//}
	
	
	
	public static boolean checkQuest() {
		return true;
	}
	
	/*
	public static void updatePlayerFile() {
		for (Player p : Bukkit.getServer().getOnlinePlayers()) {
			File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
			FileConfiguration config = YamlConfiguration.loadConfiguration(file);
			config.addDefault("Name", p.getName());
			config.addDefault("UUID", p.getUniqueId().toString());
			config.addDefault("Element", getElement(p));
			config.addDefault("Level", getLevel(p));
			config.addDefault("Experience", getExperience(p));
			config.addDefault("Disconnect Location" + ".World", p.getWorld().getName());
			config.addDefault("Disconnect Location" + ".x", p.getLocation().getX());
			config.addDefault("Disconnect Location" + ".y", p.getLocation().getY());
			config.addDefault("Disconnect Location" + ".z", p.getLocation().getZ());
			config.addDefault("Disconnect Location" + ".Yaw", p.getLocation().getYaw());
			config.addDefault("Disconnect Location" + ".Pitch", p.getLocation().getPitch());
			config.options().copyDefaults(true);
			try {
				config.save(file);
			} catch (IOException localIOException) {
				localIOException.printStackTrace();
			}
		}

	}
	*/
	
	/*
	 	In player file store:
	 	- Name
	 	- Element
	 	- Level
	 	- Disconnect location
	 	
	*/
	
	public static String getElement(Player p) {
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		return config.getString("Element");
	}
	
	public static void setElement(Player p, String element) {
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Element", element);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static void resetElement(Player p) {
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Element", null);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static int getLevel(Player p) {
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		return config.getInt("Level");
	}
	
	public static void giveLevel(Player p, int exp) {
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Level", config.getInt("Level") + exp);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static void takeLevel(Player p, int exp) {
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Experience", config.getInt("Experience") - exp);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static int getExperience(Player p) {
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		return config.getInt("Experience");
	}
	
	public static int calculateExperience(Player p) {
		double rate = 2350;
		return (int) (1 + rate * getLevel(p));
	}
	
	public static void giveExperience(Player p, int exp) {
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Experience", config.getInt("Experience") + exp);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
		if (getExperience(p) >= calculateExperience(p) && getLevel(p) < maxLevel) {
			giveLevel(p, 1);
			p.sendMessage("§eLevel up! You are now level §6" + getLevel(p) + "§e!");
			takeExperience(p, 500);
			if (getLevel(p) == 100) {
				Bukkit.broadcastMessage("§eCongratulations! §6§l" + p.getName() + " §ehas reached level §6§l100§e!");
			}
		}
	}
	
	public static void takeExperience(Player p, int exp) {
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Experience", config.getInt("Experience") - exp);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static File getPlayerFile(String uniqueID) {
		File file = new File(Core.plugin.getDataFolder() + "/Players/", uniqueID + ".yml");
		return file;
	}
	 
	public static void setZombieEquipment(Zombie z, Material helmetType, Material chestplateType, Material leggingsType, Material bootsType, Material weaponType) {
		EntityEquipment equipment = z.getEquipment();
		if (helmetType != null) {
			 equipment.setHelmet(new ItemStack(helmetType));
			 equipment.setHelmetDropChance(0);
		}
		if (chestplateType != null) {
			 equipment.setChestplate(new ItemStack(chestplateType));
			 equipment.setChestplateDropChance(0);
		}
		if (leggingsType != null) {
			 equipment.setLeggings(new ItemStack(leggingsType));
			 equipment.setLeggingsDropChance(0);
		}
		if (bootsType != null) {
			 equipment.setBoots(new ItemStack(bootsType));
			 equipment.setBootsDropChance(0);
		}
		 
		if (weaponType != null) {
			 equipment.setItemInHand(new ItemStack(weaponType));
			 equipment.setItemInHandDropChance(0);
		}
	}
	
	public static void setSkeletonEquipment(Skeleton s, Material helmetType, Material chestplateType, Material leggingsType, Material bootsType, Material weaponType) {
		EntityEquipment equipment = s.getEquipment();
		if (helmetType != null) {
			 equipment.setHelmet(new ItemStack(helmetType));
			 equipment.setHelmetDropChance(0);
		}
		if (chestplateType != null) {
			 equipment.setChestplate(new ItemStack(chestplateType));
			 equipment.setChestplateDropChance(0);
		}
		if (leggingsType != null) {
			 equipment.setLeggings(new ItemStack(leggingsType));
			 equipment.setLeggingsDropChance(0);
		}
		if (bootsType != null) {
			 equipment.setBoots(new ItemStack(bootsType));
			 equipment.setBootsDropChance(0);
		}
		 
		if (weaponType != null) {
			 equipment.setItemInHand(new ItemStack(weaponType));
			 equipment.setItemInHandDropChance(0);
		}
	}
	 
	public static int randomInteger(int min, int max) {
		Random rand = new Random();
		int randomNumber = rand.nextInt((max - min) + 1) + min;
		return randomNumber;
	}
		
	public static boolean isInt(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	
	public static void removeItem(ItemStack is) {
		if (is.getAmount() > 1) {
			is.setAmount(is.getAmount() - 1);
		}
	}
	
	public static void sendDelayedMessage(final Player p, int delay, final String[] messages) {
		new BukkitRunnable() {
			int i = 0;
			@Override
			public void run() {
				if (i == messages.length) {
					cancel();
				}
				
				p.sendMessage(messages[i]);
				i++;
			}
		}.runTaskTimer(Core.plugin, 0, 20 * delay);
	}
	
	public static void sendDelayedMessageLionTurtle(final Player p, int delay, final String[] msgs1, final String[] msgs2, final String[] msgs3, final String[] msgs4) {
		new BukkitRunnable() {
			int msg1int = 0;
			int msg2int = 0;
			int msg3int = 0;
			int msg4int = 0;
			@Override
			public void run() {
				if (msg1int == msgs1.length) {
					cancel();
				}
				
				p.sendMessage(msgs1[msg1int]);
				msg1int++;
				
				
				if (msg2int == msgs2.length) {
					cancel();
				}
				
				p.sendMessage(msgs2[msg2int]);
				msg2int++;
				
				
				if (msg3int == msgs3.length) {
					cancel();
				}
				
				p.sendMessage(msgs3[msg3int]);
				msg3int++;
				
				
				if (msg4int == msgs4.length) {
					cancel();
				}
				
				p.sendMessage(msgs4[msg4int]);
				msg4int++;
			}
		}.runTaskTimer(Core.plugin, 0, 20 * delay);
	}
	
	public static void clearChat(Player p, int msgs) {
		while (msgs > 0) {
			p.sendMessage("");
			msgs--;
		}
	}
}



