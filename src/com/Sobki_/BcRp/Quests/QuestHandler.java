package com.Sobki_.BcRp.Quests;

import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import com.Sobki_.BcRp.Water.Quests.TheArtOfFishing;

public class QuestHandler implements Listener {
	
	@EventHandler
	public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
		Player p = event.getPlayer();
		if (!(event.getRightClicked() instanceof Villager)) return;

		Villager v = (Villager) event.getRightClicked();
		if (v.getCustomName().equals("§8§l[§3Water§8§l] §9Yu Fu")) {

			TheArtOfFishing.runTheArtOfFishing(p);

		}

	}
	
	/*
	@EventHandler
	public void on
	*/

}