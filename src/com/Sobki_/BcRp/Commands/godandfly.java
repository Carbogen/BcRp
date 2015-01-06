package com.Sobki_.BcRp.Commands;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Sobki_.BcRp.Utils.ChatUtilities;

public class godandfly implements CommandExecutor {
	
	public static ArrayList<UUID> godEnabled = new ArrayList<UUID>();
	public static ArrayList<UUID> flyEnabled = new ArrayList<UUID>();
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("god")) {
				if (p.hasPermission("MODERATOR")) {
					if (args.length == 0) {
						if (godEnabled.contains(p.getUniqueId())) {
							godEnabled.remove(p.getUniqueId());
							p.sendMessage("§eGod mode §6disabled §eby §6" + p.getName() + "§e.");
						} else {
							godEnabled.add(p.getUniqueId());
							p.sendMessage("§eGod mode §6enabled §eby §6" + p.getName() + "§e.");
						}
					} else if (args.length == 1) {
						Player target = Bukkit.getServer().getPlayer(args[0]);
						if (target == null) {
							p.sendMessage("§5Player §d" + args[0] + " §5not found.");
						} else {
							if (godEnabled.contains(target.getUniqueId())) {
								godEnabled.remove(target.getUniqueId());
								target.sendMessage("§eGod mode §6disabled §eby §6" + p.getName() + "§e.");
								p.sendMessage("§eGod mode §6disabled §efor §6" + target.getName() + "§e.");
							} else {
								godEnabled.add(target.getUniqueId());
								target.sendMessage("§eGod mode §6enabled §eby §6" + p.getName() + "§e.");
								p.sendMessage("§eGod mode §6enabled §efor §6" + target.getName() + "§e.");
							}
						}
					}
				} else {
					ChatUtilities.ErrorInsufficientPermission(p);
				}
			}
			
			if (cmd.getName().equalsIgnoreCase("fly")) {
				if (p.hasPermission("MODERATOR")) {
					if (args.length == 0) {
						if (flyEnabled.contains(p.getUniqueId())) {
							flyEnabled.remove(p.getUniqueId());
							p.sendMessage("§eFly mode §6disabled §eby §6" + p.getName() + "§e.");
						} else {
							flyEnabled.add(p.getUniqueId());
							p.setFlying(true);
							p.sendMessage("§eFly mode §6enabled §eby §6" + p.getName() + "§e.");
						}
					} else if (args.length == 1) {
						Player target = Bukkit.getServer().getPlayer(args[0]);
						if (target == null) {
							p.sendMessage("§5Player §d" + args[0] + " §5not found.");
						} else {
							if (flyEnabled.contains(target.getUniqueId())) {
								flyEnabled.remove(target.getUniqueId());
								target.sendMessage("§eFly mode §6disabled §eby §6" + p.getName() + "§e.");
								p.sendMessage("§eFly mode §6disabled §efor §6" + target.getName() + "§e.");
							} else {
								flyEnabled.add(target.getUniqueId());
								target.setFlying(true);
								target.sendMessage("§eFly mode §6enabled §eby §6" + p.getName() + "§e.");
								p.sendMessage("§eFly mode §6enabled §efor §6" + target.getName() + "§e.");
							}
						}
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
