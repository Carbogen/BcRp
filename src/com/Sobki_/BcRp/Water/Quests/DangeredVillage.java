package com.Sobki_.BcRp.Water.Quests;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DangeredVillage implements Listener {
	
	public static String mainNPCName = "§8(§31§8) §8§l[§3Water§8§l] §9Name §8§oQuest NPC";
	
	public static void spawnMainNPC(Location loc) {
		Villager v = (Villager) loc.getWorld().spawn(loc, Villager.class);
		v.setCustomName(mainNPCName);
		v.setCustomNameVisible(true);
		v.setRemoveWhenFarAway(false);
	}
	
	public static void spawnVillager(Location loc) {
		Villager v = (Villager) loc.getWorld().spawn(loc, Villager.class);
		v.setCustomName("§8(§31§8) §8§l[§3Water§8§l] §9Villager");
		v.setCustomNameVisible(true);
		v.setRemoveWhenFarAway(false);
		v.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Integer.MAX_VALUE, 100));
		v.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, Integer.MAX_VALUE, 100));
		v.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 100));
	}
	
	public static void runDangeredVillage(Player p) {
		
	}

}
