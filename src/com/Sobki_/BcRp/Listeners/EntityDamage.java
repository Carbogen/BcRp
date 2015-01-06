package com.Sobki_.BcRp.Listeners;

import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import com.Sobki_.BcRp.BeginnerSetup.SelectElement;

public class EntityDamage implements Listener {
	
	@EventHandler
	public void onEntityDamage(EntityDamageEvent event) {
		if (event.getEntity() instanceof Villager) {
			Villager v = (Villager) event.getEntity();
			if (v.getCustomName().equals(SelectElement.waterNPCName)) {
				event.setCancelled(true);
			} else if (v.getCustomName().equals(SelectElement.earthNPCName)) {
				event.setCancelled(true);
			} else if (v.getCustomName().equals(SelectElement.fireNPCName)) {
				event.setCancelled(true);
			} else if (v.getCustomName().equals(SelectElement.airNPCName)) {
				event.setCancelled(true);
			}
		}
	}
	
	@EventHandler
	public void onFall(EntityDamageEvent e){
		if(e.getEntity() instanceof Villager) {
			Villager v = (Villager) e.getEntity();
			if(v.getCustomName().equals(SelectElement.airNPCName)){
				e.setCancelled(true);
			}else if(v.getCustomName().equals(SelectElement.waterNPCName)){
				e.setCancelled(true);
			}else if(v.getCustomName().equals(SelectElement.fireNPCName)){
				e.setCancelled(true);
			}else if(v.getCustomName().equals(SelectElement.earthNPCName)){
				e.setCancelled(true);
			}
			if(e.getCause() == DamageCause.FALL){
				e.setCancelled(true);
			}
			
		}
	}

}
