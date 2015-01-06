package com.Sobki_.BcRp.Listeners;

import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.Sobki_.BcRp.Quests.Level1;
import com.Sobki_.BcRp.config.ConfigManager;

public class PlayerJoin implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player p = event.getPlayer();
		ConfigManager.getPlayerF(p);
		ConfigManager.playerConfigs.put(p, ConfigManager.config(p));
		playerDefaults(p);
		FileConfiguration config = ConfigManager.playerConfigs.get(p);
		if (config.getString("Element").equals("null")) {
			Level1.runLevel1Quest(p);
		}
	}


	public void playerDefaults(Player p) {
		try {
			ConfigManager.check(p, "Name", p.getName());
			ConfigManager.check(p, "UUID", p.getUniqueId().toString());
			ConfigManager.check(p, "Element", "null");
			ConfigManager.check(p, "Level", 0);
			ConfigManager.check(p, "Experience", 0);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
