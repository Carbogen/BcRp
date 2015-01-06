package com.Sobki_.BcRp.Handlers.Mobs;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import com.Sobki_.BcRp.Handlers.Methods;

public class LionTurtle implements Listener {
	
	public static ArrayList<UUID> selectingElement = new ArrayList<UUID>();
	
	/*
	public static void spawnLionTurtle(Location loc) {
		Giant g = (Giant) loc.getWorld().spawn(loc, Giant.class);
		g.setCustomName("§8§l[§eMaster§8§l] §6§lLion Turtle");
		g.setCustomNameVisible(true);
		g.setRemoveWhenFarAway(false);
		g.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 30));
		g.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, -30));
	}
	*/
	
	/*
	@EventHandler
	public void onLionTurtleDamage(EntityDamageEvent event) {
		if (event.getEntity() instanceof Giant) {
			Giant g = (Giant) event.getEntity();
			if (g.getCustomName() == null) return;
			if (g.getCustomName().equals("§8§l[§eMaster§8§l] §6§lLion Turtle")) {
				event.setCancelled(true);
			}
		}
	}
	*/
	
	/*
	@EventHandler
	public void onLionTurtleInteract(PlayerInteractEntityEvent event) {
		if (event.getRightClicked() instanceof Giant) {
			Giant g = (Giant) event.getRightClicked();
			Player p = event.getPlayer();
			if (g.getCustomName() == null) return;
			if (g.getCustomName().equals("§6§lLion Turtle")) {
				if (Methods.getElement(p) == null) {
					p.sendMessage("§8(§e100§8) §8§l[§eMaster§8§l] §6§lLion Turtle§8: §fBlah blah blah, some crap about choosing elements, you can only choose once. Yep, blah blah blah.");
					selectingElement.add(p.getUniqueId());
				} else {
					p.sendMessage("§8(§e100§8) §8§l[§eMaster§8§l] §6§lLion Turtle§8: §fI told already, you can't change elements after selecting.");
				}
			}
		}
	}
	*/
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event) {
		Player p = (Player) event.getPlayer();
		Block downBlock = p.getLocation().getBlock().getRelative(BlockFace.DOWN);
		if (downBlock.getType() == Material.ACACIA_STAIRS) {
			if (Methods.getElement(p) == null) {
				if (selectingElement.contains(p.getUniqueId())) return;
				p.sendMessage("§8(§e100§8) §8§l[§eMaster§8§l] §6§lLion Turtle§8: §fBlah blah blah, some crap about choosing elements, you can only choose once. Yep, blah blah blah.");
				selectingElement.add(p.getUniqueId());
			} else {
				p.sendMessage("§8(§e100§8) §8§l[§eMaster§8§l] §6§lLion Turtle§8: §fI told already, you can't change elements after selecting.");
			}
		}
	}
}
