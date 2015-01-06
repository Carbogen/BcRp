package com.Sobki_.BcRp.Handlers.Skills;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.Sobki_.BcRp.Core;
import com.Sobki_.BcRp.Handlers.Methods;

public class Forging {
	
	public static void addForgingLevel(Player p, int amount) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(Methods.getPlayerFile(p.getUniqueId().toString()));
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Skills.forgingLevel", config.getInt("Skills.forgingLevel") + amount);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static void takeForgingLevel(Player p, int amount) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(Methods.getPlayerFile(p.getUniqueId().toString()));
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Skills.forgingLevel", config.getInt("Skills.forgingLevel") - amount);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static int getForgingLevel(Player p) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(Methods.getPlayerFile(p.getUniqueId().toString()));
		return config.getInt("Skills.forgingLevel");
	}

}
