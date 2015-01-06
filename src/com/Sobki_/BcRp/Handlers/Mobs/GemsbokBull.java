package com.Sobki_.BcRp.Handlers.Mobs;

import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import com.Sobki_.BcRp.Handlers.Methods;

public class GemsbokBull implements Listener {
	
	@EventHandler
	public void onGemsbokBullDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Cow) {
			Cow c = (Cow) event.getEntity();
			if (c.getCustomName() == null) return;
			if (c.getCustomName() == "§6Gemsbok Bull") {
				event.getDrops().clear();
				int hornDropChance = Methods.randomInteger(1, 3);
				int hornDropAmount = Methods.randomInteger(0, 1);
				int meatDropChance = Methods.randomInteger(0, 2);
				if (hornDropChance == 1) {
					event.getDrops().add(Methods.createItem(Material.QUARTZ, hornDropAmount, (short) 0, "§fGemsbok Bull Horn", "§8§m§l{§7 Common §8§m§l}", null, null, null));
				}
				event.getDrops().add(Methods.createItem(Material.RAW_BEEF, meatDropChance, (short) 0, "§fGemsbok Bull Meat", "§8§m§l{§7 Common §8§m§l}", null, null, null));
				event.setDroppedExp(0);
				if (c.getKiller() instanceof Player) {
					Player player = (Player) c.getKiller();
					Methods.giveExperience(player, 5);
					Methods.sendExpGainMsg(player, 5);
				}
			}
		}
	}

}
