package com.Sobki_.BcRp.Handlers.Mobs.Bison;

import org.bukkit.Material;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import com.Sobki_.BcRp.Handlers.Methods;

public class AdultBison implements Listener {
	
	@EventHandler
	public void onAdultBisonDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Ghast) {
			Ghast g = (Ghast) event.getEntity();
			if (g.getCustomName() == null) return;
			if (g.getCustomName() == "§6Flying Bison") {
				event.getDrops().clear();
				int hornDropAmount = Methods.randomInteger(0, 1);
				event.getDrops().add(Methods.createItem(Material.QUARTZ, hornDropAmount, (short) 0, "§fBison Horn", "§8§m§l{§7 Common §8§m§l}", null, null, null));
				event.setDroppedExp(0);
				if (g.getKiller() instanceof Player) {
					Player player = (Player) g.getKiller();
					Methods.giveExperience(player, 30);
					Methods.sendExpGainMsg(player, 30);
				}
			}
		}
	}
	
	@EventHandler
	public void onAdultBisonSpawn(CreatureSpawnEvent event) {
		if (event.getEntity() instanceof Ghast) {
			Ghast g = (Ghast) event.getEntity();
			g.setCustomName("§6Flying Bison");
			g.setCustomNameVisible(true);
		}
	}
	
	@EventHandler
	public void onAdultBisonPlayerInteract(PlayerInteractEntityEvent event) {
		if (event.getRightClicked() instanceof Ghast) {
			Ghast g = (Ghast) event.getRightClicked();
			if (g.getCustomName() == null) return;
			if (g.getCustomName() == "§aFlying Bison") {
				if (Methods.getElement(event.getPlayer()) == "AIR") {
					g.setPassenger(event.getPlayer());
				} else {
					event.getPlayer().sendMessage("§cOnly air benders can ride Flying Bison's.");
				}
			}
		}
	}

}
