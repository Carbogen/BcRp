package com.Sobki_.BcRp.Handlers.Mobs;

import org.bukkit.Material;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import com.Sobki_.BcRp.Handlers.Methods;

public class Lemur implements Listener {
	
	@EventHandler
	public void onLemurDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Bat) {
			Bat b = (Bat) event.getEntity();
			if (b.getCustomName() == null) return;
			if (b.getCustomName() == "§6Winged Lemur") {
				event.getDrops().clear();
				int tuskDropChance = Methods.randomInteger(0, 1);
				event.getDrops().add(Methods.createItem(Material.FLINT, tuskDropChance, (short) 0, "§fLemur Wing", "§8§m§l{§7 Junk Item §8§m§l}", null, null, null));
				event.setDroppedExp(0);
				if (b.getKiller() instanceof Player) {
					Player player = (Player) b.getKiller();
					Methods.giveExperience(player, 5);
					Methods.sendExpGainMsg(player, 5);
				}
			}
		}
	}

}
