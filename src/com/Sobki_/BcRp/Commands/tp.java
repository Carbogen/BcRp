package com.Sobki_.BcRp.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Sobki_.BcRp.Utils.ChatUtilities;

public class tp implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("tp")) {
				if (p.hasPermission("MODERATOR")) {
					if (args.length == 0) {
						ChatUtilities.ErrorNotEnoughArguments(p);
						p.sendMessage("§5Try §d/tp <player> §5or §d/tp <player> <player>");
					} else if (args.length == 1) {
						Player target = Bukkit.getServer().getPlayer(args[0]);
						if (target == null) {
							p.sendMessage("§5Player §d" + args[0] + " §5not found.");
						} else {
							p.teleport(target);
							p.sendMessage("§eTeleporting to §6" + target.getName() + "§e.");
						}
					} else if (args.length == 2) {
						Player target1 = Bukkit.getServer().getPlayer(args[0]);
						Player target2 = Bukkit.getServer().getPlayer(args[1]);
						if (target1 == null) {
							p.sendMessage("§5Player §d" + args[0] + " §5not found.");
						} else if (target2 == null) {
							p.sendMessage("§5Player §d" + args[1] + " §5not found.");
						} else {
							target1.teleport(target2);
							p.sendMessage("§eTeleporting §6" + target1.getName() + " §eto §6" + target2.getName() + "§e.");
						}
					} else {
						ChatUtilities.ErrorTooManyArguments(p);
					}
				} else {
					ChatUtilities.ErrorInsufficientPermission(p);
				}
			}
			
			if (cmd.getName().equalsIgnoreCase("tphere")) {
				if (p.hasPermission("MODERATOR")) {
					if (args.length == 0) {
						ChatUtilities.ErrorNotEnoughArguments(p);
						p.sendMessage("§5Try §d/tphere <player>");
					} else if (args.length == 1) {
						Player target = Bukkit.getServer().getPlayer(args[0]);
						if (target == null) {
							p.sendMessage("§5Player §d" + args[0] + "§5not found.");
						} else {
							target.teleport(p);
							p.sendMessage("§eTeleporting §6" + target.getName() + " §eto your current location.");
						}
					}
				}
			}
		} else {
			sender.sendMessage("Only players can use this command.");
		}
		return true;
	}

}
