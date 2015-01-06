package com.Sobki_.BcRp.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Sobki_.BcRp.config.ConfigManager;

public class PlayerQuit implements Listener {
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Player p = event.getPlayer();
		ConfigManager.playerConfigs.remove(p);
	}
}
