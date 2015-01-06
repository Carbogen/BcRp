package com.Sobki_.BcRp.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ForgingCommands implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("repair")) {
				Inventory repairInv; {
					repairInv = Bukkit.getServer().createInventory(p, 9, "§0Repair Items");
				}
				p.openInventory(repairInv);
			}
		} else {
			sender.sendMessage("Only players can use this command.");
		}
		return true;
	}

}
