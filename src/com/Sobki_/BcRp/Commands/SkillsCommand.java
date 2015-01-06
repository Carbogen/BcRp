package com.Sobki_.BcRp.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.Sobki_.BcRp.Handlers.Methods;

public class SkillsCommand implements CommandExecutor {
	
	public static Inventory skillsInv = Bukkit.getServer().createInventory(null, 9, "Skills"); {
		skillsInv.setItem(0, Methods.createItem(Material.SUGAR, 1, (short) 0, "§8§l> §fSpeed §8§l<", "§d§lL.Click §8- §5+1 Speed Level", "§d§lR.Click §8- §5Speed Information", "§6Price: §e1 Skill Token", "§6Max. Speed Level: §e50"));
		skillsInv.setItem(2, Methods.createItem(Material.LEATHER_BOOTS, 1, (short) 0, "§8§l> §eJump §8§l<", "§d§lL.Click §8- §5+1 Jump Level", "§d§lR.Click §8- §5Jump Information", "§6Price: §e1 Skill Token", "§6Max. Jump Level: §e50"));
		skillsInv.setItem(4, Methods.createItem(Material.DEAD_BUSH, 1, (short) 2, "§8§l> §aHerbalism §8§l<", "§d§lL.Click §8- §5+1 Herbalism Level", "§d§lR.Click §8- §5Herbalism Information", "§6Price: §e1 Skill Token", "§6Max. Herbalism Level: §e50"));
		skillsInv.setItem(6, Methods.createItem(Material.BLAZE_POWDER, 1, (short) 0, "§8§l> §cStrength §8§l<", "§d§lL.Click §8- §5+1 Strength Level", "§d§lR.Click §8- §5Strength Information", "§6Price: §e1 Skill Token", "§6Max. Strength Level: §e50"));
		skillsInv.setItem(8, Methods.createItem(Material.ANVIL, 1, (short) 0, "§8§l> §7Forging §8§l<", "§d§lL.Click §8- §5+1 Forging Level", "§d§lR.Click §8- §5Forging Information", "§6Price: §e1 Skill Token", "§6Max. Forging Level: §e50"));
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("skills")) {
				p.openInventory(skillsInv);
			}
		} else {
			sender.sendMessage("Only players can use this command.");
		}
		return true;
	}

}
