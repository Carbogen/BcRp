package com.Sobki_.BcRp.Listeners;

import org.bukkit.Effect;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import com.Sobki_.BcRp.BeginnerSetup.SelectElement;
import com.Sobki_.BcRp.Commands.godandfly;

public class EntityDamageByEntity implements Listener {
	
	@EventHandler
	public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
		if (event.getDamager() instanceof Player) {
			Player p = (Player) event.getDamager();
			if (event.getEntity() instanceof LivingEntity) {
				if (p.hasPermission("BcRp.blood")) {
					event.getEntity().getWorld().playEffect(event.getEntity().getLocation(), Effect.STEP_SOUND, 152);
				}
			}
		}
		
		else if (event.getEntity() instanceof Villager) {
			Villager v = (Villager) event.getEntity();
				if (v.getCustomName() == null) return;
				if(v.getCustomName().equals(SelectElement.airNPCName)){
						event.setCancelled(true);
					}else if(v.getCustomName().equals(SelectElement.waterNPCName)){
						event.setCancelled(true);
					}else if(v.getCustomName().equals(SelectElement.fireNPCName)){
						event.setCancelled(true);
					}else if(v.getCustomName().equals(SelectElement.earthNPCName)){
						event.setCancelled(true);
			}
		}
		
		else if (event.getEntity() instanceof Player) {
			Player p = (Player) event.getEntity();
			if (godandfly.godEnabled.contains(p.getUniqueId())) {
				event.setCancelled(true);
				if (event.getDamager() instanceof Player) {
					Player damager = (Player) event.getDamager();
					damager.sendMessage("§d" + p.getName() + " §5is in God mode and cannot be damaged.");
				}
			}
		}
	}
}

