package com.Sobki_.BcRp.Handlers.Skills;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.Sobki_.BcRp.Core;
import com.Sobki_.BcRp.Handlers.Methods;

public class Speed implements Listener {
	
	@EventHandler
	public void onPlayerToggleSprint(PlayerToggleSprintEvent event) {
		Player p = (Player) event.getPlayer();
		if (!p.isSprinting()) {
			if (getSpeedLevel(p) >= 10 && getSpeedLevel(p) < 25) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
			}else if (getSpeedLevel(p) >= 25 && getSpeedLevel(p) < 50) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
			}else if (getSpeedLevel(p) == 50) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
			}
		} else {
			p.removePotionEffect(PotionEffectType.SPEED);
		}
	}
	
	public static void addSpeedLevel(Player p, int amount) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(Methods.getPlayerFile(p.getUniqueId().toString()));
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Skills.speedLevel", config.getInt("Skills.speedLevel") + amount);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static void takeSpeedLevel(Player p, int amount) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(Methods.getPlayerFile(p.getUniqueId().toString()));
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Skills.speedLevel", config.getInt("Skills.speedLevel") - amount);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static int getSpeedLevel(Player p) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(Methods.getPlayerFile(p.getUniqueId().toString()));
		return config.getInt("Skills.speedLevel");
	}

}
