package com.Sobki_.BcRp.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Sobki_.BcRp.Utils.ChatUtilities;

public class FriendCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			

			if (cmd.getName().equalsIgnoreCase("friend")) {
				if (p.hasPermission("bcrp.command.friend.*")) {
					if (args.length == 0) {
						ChatUtilities.ErrorNotEnoughArguments(p);
						p.sendMessage("§5Try §d/friend <add/remove/list> <arguments>");
					} else if (args.length == 1) {
						if (args[0].equalsIgnoreCase("list")) {
							if (p.hasPermission("bcrp.command.friend.list")) {
								// TODO LIST FRIENDS
							} else {
								ChatUtilities.ErrorInsufficientPermission(p);
							}
						} else {
							ChatUtilities.ErrorInvalidArgument(p);
							p.sendMessage("§5Try §d/friend <add/remove/list> <arguments>");
						}
					} else if (args.length == 2) {
						if (args[0].equalsIgnoreCase("add")) {
							if (p.hasPermission("bcrp.command.friend.add")) {
								// TODO ADD FRIEND
							} else {
								ChatUtilities.ErrorInsufficientPermission(p);
							}
						} else if (args[0].equalsIgnoreCase("remove")) {
							if (p.hasPermission("bcrp.command.friend.remove")) {
								// TODO REMOVE FRIEND
							} else {
								ChatUtilities.ErrorInsufficientPermission(p);
							}
						} else {
							ChatUtilities.ErrorInvalidArgument(p);
							p.sendMessage("§5Try §d/friend <add/remove/list> <arguments>");
						}
					} else {
						ChatUtilities.ErrorTooManyArguments(p);
						p.sendMessage("§5Try §d/friend <add/remove/list> <arguments>");
					}
				} else {
					ChatUtilities.ErrorInsufficientPermission(p);
				}
			}
		} else {
			sender.sendMessage("Only players can use this command.");
		}
		return true;
	}
	

}
