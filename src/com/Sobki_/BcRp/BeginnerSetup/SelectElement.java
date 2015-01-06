package com.Sobki_.BcRp.BeginnerSetup;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Villager.Profession;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SelectElement implements Listener {
	
	public static Location waterNPCLocation = new Location(Bukkit.getServer().getWorld("world"), 331.5, 96, -293.5);
	public static Location earthNPCLocation = new Location(Bukkit.getServer().getWorld("world"), 331.5, 96, -273.5);
	public static Location fireNPCLocation = new Location(Bukkit.getServer().getWorld("world"), 311.5, 96, -273.5);
	public static Location airNPCLocation = new Location(Bukkit.getServer().getWorld("world"), 311.5, 96, -293.5);
	
	public static String waterNPCName = "§9§lWater";
	public static String earthNPCName = "§2§lEarth";
	public static String fireNPCName = "§c§lFire";
	public static String airNPCName = "§7§lAir";
	
	public static void spawnWaterNPC(Location loc) {
		Villager waterNPC = Bukkit.getServer().getWorld(loc.getWorld().getName()).spawn(loc, Villager.class);
		waterNPC.setCustomName("§9§lWater");
		waterNPC.setCustomNameVisible(true);
		waterNPC.setRemoveWhenFarAway(false);
		waterNPC.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 30));
		waterNPC.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000000, -30));
		waterNPC.setProfession(Profession.LIBRARIAN);
	}
	
	public static void spawnEarthNPC(Location loc) {
		Villager earthNPC = Bukkit.getServer().getWorld(loc.getWorld().getName()).spawn(loc, Villager.class);
		earthNPC.setCustomName("§2§lEarth");
		earthNPC.setCustomNameVisible(true);
		earthNPC.setRemoveWhenFarAway(false);
		earthNPC.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 30));
		earthNPC.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000000, -30));
		earthNPC.setProfession(Profession.LIBRARIAN);
	}
	
	public static void spawnFireNPC(Location loc) {
		Villager fireNPC = Bukkit.getServer().getWorld(loc.getWorld().getName()).spawn(loc, Villager.class);
		fireNPC.setCustomName("§c§lFire");
		fireNPC.setCustomNameVisible(true);
		fireNPC.setRemoveWhenFarAway(false);
		fireNPC.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 30));
		fireNPC.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000000, -30));
		fireNPC.setProfession(Profession.LIBRARIAN);
	}
	
	public static void spawnAirNPC(Location loc) {
		Villager airNPC = Bukkit.getServer().getWorld(loc.getWorld().getName()).spawn(loc, Villager.class);
		airNPC.setCustomName("§7§lAir");
		airNPC.setCustomNameVisible(true);
		airNPC.setRemoveWhenFarAway(false);
		airNPC.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 30));
		airNPC.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000000, -30));
		airNPC.setProfession(Profession.LIBRARIAN);
	}
	
	/*EntityVillager nmsVillager = ((CraftVillager) waterNPC).getHandle();
	
	//Get the field
	Field goal = nmsVillager.getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredField("goalSelector");
	goal.setAccessible(true); //remove the protected modifier
	 
	 
	//Evilly Remove the final modifier
	FieldmodifiersField = Field.class.getDeclaredField("modifiers");
	modifiersField.setAccessible(true);
	modifiersField.setInt(goal, goal.getModifiers() & ~Modifier.FINAL);//Evilness shall ensue
	
	PathfinderGoalSelector goalSelector = new PathfinderGoalSelector(nmsVillager.world != null && nmsVillager.world.methodProfiler != null ? nmsVillager.world.methodProfiler : null);
	
	goal.set(nmsVillager, goalSelector);*/
	
}