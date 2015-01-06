package com.Sobki_.BcRp.Handlers.Mobs;

import org.bukkit.Material;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import com.Sobki_.BcRp.Handlers.Methods;

public class BoarQPine implements Listener {
	
	@EventHandler
	public void onBoarQPineDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Pig) {
			Pig p = (Pig) event.getEntity();
			if (p.getCustomName() == null) return;
			if (p.getCustomName() == "§6Boar-q-pine") {
				event.getDrops().clear();
				int tuskDropChance = Methods.randomInteger(0, 2);
				event.getDrops().add(Methods.createItem(Material.QUARTZ, tuskDropChance, (short) 0, "§fBoar-q-pine Tusk", "§8§m§l{§7 Common §8§m§l}", null, null, null));
				event.setDroppedExp(0);
				if (p.getKiller() instanceof Player) {
					Player player = (Player) p.getKiller();
					Methods.giveExperience(player, 5);
					Methods.sendExpGainMsg(player, 5);
				}
			}
		}
	}

}
