package com.Sobki_.BcRp.Dungeons;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.Listener;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Dungeon1 implements Listener {
	
	public static void spawnDungeon1Mob(Location loc, String mob) {
		if (mob.equals("SKELETALGUARDIAN")) {
			Skeleton sg = loc.getWorld().spawn(loc, Skeleton.class);
			sg.setCustomName("§5Skeletal Guardian §8[§7Lvl null§8]");
			sg.setCustomNameVisible(true);
			sg.setCanPickupItems(false);
			sg.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
			EntityEquipment equipment = sg.getEquipment();
			equipment.setItemInHand(new ItemStack(Material.STONE_SWORD));
			equipment.setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
			equipment.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
			equipment.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
			equipment.setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
			equipment.setItemInHandDropChance(0);
			equipment.setHelmetDropChance(0);
			equipment.setChestplateDropChance(0);
			equipment.setLeggingsDropChance(0);
			equipment.setBootsDropChance(0);
		} else if (mob.equals("SKELETALARCHER")) {
			Skeleton sa = loc.getWorld().spawn(loc, Skeleton.class);
			sa.setCustomName("§5Skeletal Archer §8[§7Lvl null§8]");
			sa.setCustomNameVisible(true);
			sa.setCanPickupItems(false);
			sa.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
			EntityEquipment equipment = sa.getEquipment();
			equipment.setItemInHand(new ItemStack(Material.BOW));
			equipment.setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
			equipment.setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
			equipment.setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
			equipment.setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
			equipment.setItemInHandDropChance(0);
			equipment.setHelmetDropChance(0);
			equipment.setChestplateDropChance(0);
			equipment.setLeggingsDropChance(0);
			equipment.setBootsDropChance(0);
		} else if (mob.equals("PROTECTOR")) {
			Zombie p = loc.getWorld().spawn(loc, Zombie.class);
			p.setCustomName("§5Protector §8[§7Lvl null§8]");
			p.setCustomNameVisible(true);
			p.setCanPickupItems(false);
			p.setBaby(false);
			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0));
			EntityEquipment equipment = p.getEquipment();
			equipment.setItemInHand(new ItemStack(Material.DIAMOND_SWORD));
			equipment.setHelmet(new ItemStack(Material.IRON_HELMET));
			equipment.setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
			equipment.setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
			equipment.setBoots(new ItemStack(Material.IRON_BOOTS));
			equipment.setItemInHandDropChance(0);
			equipment.setHelmetDropChance(0);
			equipment.setChestplateDropChance(0);
			equipment.setLeggingsDropChance(0);
			equipment.setBootsDropChance(0);
		} else if (mob.equals("WANDERER")) {
			Zombie w = loc.getWorld().spawn(loc, Zombie.class);
			w.setCustomName("§5Wanderer §8[§7Lvl null§8]");
			w.setCustomNameVisible(true);
			w.setCanPickupItems(false);
			w.setBaby(false);
			EntityEquipment equipment = w.getEquipment();
			equipment.setItemInHand(null);
			equipment.setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
			equipment.setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
			equipment.setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
			equipment.setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
			equipment.setItemInHandDropChance(0);
			equipment.setHelmetDropChance(0);
			equipment.setChestplateDropChance(0);
			equipment.setLeggingsDropChance(0);
			equipment.setBootsDropChance(0);
		} else if (mob.equals("RUNNER")) {
			Zombie r = loc.getWorld().spawn(loc, Zombie.class);
			r.setCustomName("§5Runner §8[§7Lvl null§8]");
			r.setCustomNameVisible(true);
			r.setCanPickupItems(false);
			r.setBaby(true);
			EntityEquipment equipment = r.getEquipment();
			equipment.setItemInHand(null);
			equipment.setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
			equipment.setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
			equipment.setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
			equipment.setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
			equipment.setItemInHandDropChance(0);
			equipment.setHelmetDropChance(0);
			equipment.setChestplateDropChance(0);
			equipment.setLeggingsDropChance(0);
			equipment.setBootsDropChance(0);
		} else if (mob.equals("HELLBAT")) {
			Bat hb = loc.getWorld().spawn(loc, Bat.class);
			hb.setCustomName("§5Hellbat §8[§7Lvl null§8]");
			hb.setCustomNameVisible(true);
			hb.setCanPickupItems(false);
		} else {
			Bukkit.broadcastMessage("Invalid mob");
		}
		
		
		
	}
}
