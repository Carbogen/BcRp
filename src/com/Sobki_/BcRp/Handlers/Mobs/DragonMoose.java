package com.Sobki_.BcRp.Handlers.Mobs;

import org.bukkit.Material;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import com.Sobki_.BcRp.Handlers.Methods;

public class DragonMoose implements Listener {
	
	@EventHandler
	public void onGemsbokBullDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Horse) {
			Horse h = (Horse) event.getEntity();
			if (h.getCustomName() == null) return;
			if (h.getCustomName() == "§6Dragon Moose") {
				event.getDrops().clear();
				int earDropChance = Methods.randomInteger(1, 3);
				int earDropAmount = Methods.randomInteger(0, 1);
				if (earDropChance == 1) {
					event.getDrops().add(Methods.createItem(Material.FLINT, earDropAmount, (short) 0, "§fDragon Moose Ear", "§8§m§l{§7 Common §8§m§l}", null, null, null));
				}
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
