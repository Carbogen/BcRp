package com.Sobki_.BcRp.Water.Quests;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import com.Sobki_.BcRp.Core;

public class WaterQuestHandler implements Listener {
	
	public WaterQuestHandler(){
		Bukkit.getPluginManager().registerEvents(this, Core.plugin);
	}
	@EventHandler
	public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
		Player p = event.getPlayer();
		if (!(event.getRightClicked() instanceof Villager)) return;

		Villager v = (Villager) event.getRightClicked();
		if (v.getCustomName().equals("§8§l[§3Water§8§l] §9Yu Fu")) {

			TheArtOfFishing.runTheArtOfFishing(p);

		}

	}

}