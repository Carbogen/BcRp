package com.Sobki_.BcRp.Handlers.Mobs.Bison;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import com.Sobki_.BcRp.Handlers.Methods;

public class BabyBison implements Listener {
	
	@EventHandler
	public void onBabyBisonDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Sheep) {
			Sheep s = (Sheep) event.getEntity();
			if (s.getCustomName() == null) return;
			if (s.getCustomName() == "§6Flying Bison") {
				event.getDrops().clear();
				int hornDropAmount = Methods.randomInteger(0, 1);
				event.getDrops().add(Methods.createItem(Material.QUARTZ, hornDropAmount, (short) 0, "§fBison Horn", "§8§m§l{§7 Common §8§m§l}", null, null, null));
				event.setDroppedExp(0);
				if (s.getKiller() instanceof Player) {
					Player player = (Player) s.getKiller();
					Methods.giveExperience(player, 10);
					Methods.sendExpGainMsg(player, 10);
				}
			}
		}
	}
	
	@EventHandler
	public void onBabyBisonSpawn(CreatureSpawnEvent event) {
		if (event.getEntity() instanceof Sheep) {
			Sheep s = (Sheep) event.getEntity();
			s.setCustomName("§6Flying Bison");
			s.setCustomNameVisible(true);
		}
	}

}
