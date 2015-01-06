package com.Sobki_.BcRp.Handlers.Mobs;

import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import com.Sobki_.BcRp.Handlers.Methods;

public class OstrichHorse implements Listener {
	
	@EventHandler
	public void onOstrichHorseDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Horse) {
			Horse h = (Horse) event.getEntity();
			if (h.getCustomName() == null) return;
			if (h.getCustomName() == "§6Ostrich Horse") {
				event.getDrops().clear();
				event.setDroppedExp(0);
				if (h.getKiller() instanceof Player) {
					Player player = (Player) h.getKiller();
					Methods.giveExperience(player, 5);
					Methods.sendExpGainMsg(player, 5);
				}
			}
		}
	}

}
