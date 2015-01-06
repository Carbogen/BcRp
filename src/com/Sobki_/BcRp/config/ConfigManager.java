package com.Sobki_.BcRp.config;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.Sobki_.BcRp.Core;

public class ConfigManager {


	public static File getPlayerF(Player p) {
		File file = new File(Core.plugin.getDataFolder() + "/Players/" + p.getUniqueId().toString() + ".yml");

		return file;
	}

	public static FileConfiguration config(Player p) {
		
		return YamlConfiguration.loadConfiguration(getPlayerF(p));
	}

	public static void save(Player p) throws IOException {

			playerConfigs.get(p).save(getPlayerF(p));

	}
	
	public static HashMap<Player, FileConfiguration> playerConfigs = new HashMap<Player, FileConfiguration>();
	
	public static void check(Player p, String key, Object value) throws IOException {
		
		if(!playerConfigs.get(p).isSet(key)){

			playerConfigs.get(p).set(key, value);
			save(p);
			return;
		}

	}

	public static boolean getBoolean(Player p, String key) {


		return playerConfigs.get(p).getBoolean(key);
	}

	public static int getInt(Player p, String key) {

		return playerConfigs.get(p).getInt(key);
	}

	public static Object get(Player p, String str) {

		return playerConfigs.get(p).get(str);
	}

	public static String getString(Player p, String key) {

		return playerConfigs.get(p).getString(key);
	}

	public static List<?> getList(Player p, String key) {

		return playerConfigs.get(p).getList(key);
	}

	public static List<String> getStringList(Player p, String key) {

		return  playerConfigs.get(p).getStringList(key);
	}

	public static ConfigurationSection getSection(Player p, String key) {

		return  playerConfigs.get(p).getConfigurationSection(key);
	}

	public static void set(Player p, String key, Object value) {

		playerConfigs.get(p).set(key, value);

	}
}