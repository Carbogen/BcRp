package com.Sobki_.BcRp.Handlers.Skills;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.Sobki_.BcRp.Core;
import com.Sobki_.BcRp.Handlers.Methods;

public class Jump implements Listener {
	
	@EventHandler
	public void onPlayerToggleSprint(PlayerMoveEvent event) {
		Player p = (Player) event.getPlayer();
		double fromY = event.getFrom().getY();
		double toY = event.getTo().getY();
		if (fromY < toY) {
			if (Jump.getJumpLevel(p) >= 10 && getJumpLevel(p) < 25) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 * 5, 0));
			} else if (Jump.getJumpLevel(p) >= 25 && getJumpLevel(p) < 50) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 * 5, 1));
			} else if (Jump.getJumpLevel(p) == 50) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 * 5, 2));
			}
		}
	}
	
	public static void addJumpLevel(Player p, int amount) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(Methods.getPlayerFile(p.getUniqueId().toString()));
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Skills.jumpLevel", config.getInt("Skills.jumpLevel") + amount);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static void takeJumpLevel(Player p, int amount) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(Methods.getPlayerFile(p.getUniqueId().toString()));
		File file = new File(Core.plugin.getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		config.set("Skills.jumpLevel", config.getInt("Skills.jumpLevel") - amount);
		try {
			config.save(file);
		} catch (IOException localIOException) {
			localIOException.printStackTrace();
		}
	}
	
	public static int getJumpLevel(Player p) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(Methods.getPlayerFile(p.getUniqueId().toString()));
		return config.getInt("Skills.jumpLevel");
	}

}
