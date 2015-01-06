package com.Sobki_.BcRp.Handlers.Mobs;

import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import com.Sobki_.BcRp.Handlers.Methods;

public class PolarDog implements Listener {
	
	@EventHandler
	public void onPolarDogDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Wolf) {
			Wolf w = (Wolf) event.getEntity();
			if (w.getCustomName() == null) return;
			if (w.getCustomName() == "§6Polar Dog") {
				event.getDrops().clear();
				event.setDroppedExp(0);
				if (w.getKiller() instanceof Player) {
					Player player = (Player) w.getKiller();
					Methods.giveExperience(player, 5);
					Methods.sendExpGainMsg(player, 5);
				}
			}
		}
	}

}
