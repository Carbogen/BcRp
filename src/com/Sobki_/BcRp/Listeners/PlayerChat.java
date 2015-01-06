package com.Sobki_.BcRp.Listeners;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.Sobki_.BcRp.Core;
import com.Sobki_.BcRp.Handlers.Methods;
import com.Sobki_.BcRp.Utils.ParticleEffect;

public class PlayerChat implements Listener {
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		Player p = event.getPlayer();
		if (Methods.getElement(p).equals("WATER")) {
			event.setFormat("§8(§3" + Methods.getLevel(p) + "§8) §8§l[§3Water§8§l] §9%s§8: §f%s");
		} else if (Methods.getElement(p).equals("EARTH")) {
			event.setFormat("§8(§a" + Methods.getLevel(p) + "§8) §8§l[§aEarth§8§l] §2%s§8: §f%s");
		} else if (Methods.getElement(p).equals("FIRE")) {
			event.setFormat("§8(§c" + Methods.getLevel(p) + "§8) §8§l[§cFire§8§l] §4%s§8: §f%s");
		} else if (Methods.getElement(p).equals("AIR")) {
			event.setFormat("§8(§f" + Methods.getLevel(p) + "§8) §8§l[§fAir§8§l] §7%s§8: §f%s");
		}
		
		for (String word : event.getMessage().split(" ")) {
			File file = new File(Core.plugin.getDataFolder(), "BlockedWords.yml");
			FileConfiguration blockedWords = YamlConfiguration.loadConfiguration(file);
			if (blockedWords.getStringList("BlockedWords").contains(word)) {
				event.setCancelled(true);
				event.getPlayer().sendMessage("§4Do not swear!");
				ParticleEffect.INSTANT_SPELL.display(p.getLocation(), 1, 1, 1, 0, 1000);
			}
		}
	}
}
