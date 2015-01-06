package com.Sobki_.BcRp.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class CreatureSpawn implements Listener {
	
	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent event) {
		/*if (event.getEntity().getCustomName() == null) {
			event.setCancelled(true);
		}*/
		
		/*if (event.getEntity() instanceof Horse) {
			int horseSpawnValue = Methods.randomInteger(1, 3);
			Horse h = (Horse) event.getEntity();
			if (horseSpawnValue == 1) {
				h.setCustomName("§6Buffalo Yak");
				h.setCustomNameVisible(true);
				h.setAdult();
				h.setColor(Color.CHESTNUT);
			} else if (horseSpawnValue == 2) {
				h.setCustomName("§6Dragon Moose");
				h.setCustomNameVisible(true);
				h.setAdult();
				h.setColor(Color.CHESTNUT);
			} else if (horseSpawnValue == 3) {
				h.setCustomName("§6Ostrich Horse");
				h.setCustomNameVisible(true);
				h.setAdult();
				h.setColor(Color.BROWN);
			} else {}
		}
		
		if (event.getEntity() instanceof Pig) {
			Pig p = (Pig) event.getEntity();
			p.setCustomName("§6Boar-q-pine");
			p.setCustomNameVisible(true);
			p.setAdult();
		}
		
		if (event.getEntity() instanceof Cow) {
			Cow c = (Cow) event.getEntity();
			c.setCustomName("§6Gemsbok Bull");
			c.setCustomNameVisible(true);
			c.setAdult();
		}
		
		if (event.getEntity() instanceof Bat) {
			Bat b = (Bat) event.getEntity();
			b.setCustomName("§6Winged Lemur");
			b.setCustomNameVisible(true);
		}
		
		if (event.getEntity() instanceof Wolf) {
			Wolf w = (Wolf) event.getEntity();
			w.setCustomName("§6Polar Dog");
			w.setCustomNameVisible(true);
			w.setAdult();
		}
		
		/*if (event.getEntity() instanceof Zombie) {
			Zombie z = (Zombie) event.getEntity();
			z.setCustomName("§5Bandit §8[§7Lvl 1§8]");
			z.setCustomNameVisible(true);
			EntityEquipment zombieEquipment = z.getEquipment();
			zombieEquipment.setItemInHand(new ItemStack(Material.STICK));
			zombieEquipment.setItemInHandDropChance(0);
		}*/
	}

}
