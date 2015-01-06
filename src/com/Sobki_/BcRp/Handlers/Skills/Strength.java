package com.Sobki_.BcRp.Handlers.Skills;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import com.Sobki_.BcRp.Core;
import com.Sobki_.BcRp.Handlers.Methods;

public class Strength implements Listener {
	
	double rate = 0.08;
	
	@EventHandler
	public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
		if (event.getDamager() instanceof Player) {
			Player p = (Player) event.getDamager();
			event.setDamage(event.getDamage() + rate * Strength.getStrengthLevel(p)); //Pro math skills
		}
	}
	
	public static void addStrengthLevel(Player p, int amount) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(Methods.getPlayerFile(p.getUniqueId().toString()));
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Skills.strengthLevel", config.getInt("Skills.strengthLevel") + amount);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static void takeStrengthLevel(Player p, int amount) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(Methods.getPlayerFile(p.getUniqueId().toString()));
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Skills.strengthLevel", config.getInt("Skills.strengthLevel") - amount);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static int getStrengthLevel(Player p) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(Methods.getPlayerFile(p.getUniqueId().toString()));
		return config.getInt("Skills.strengthLevel");
	}

}
