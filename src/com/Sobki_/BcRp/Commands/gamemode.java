package com.Sobki_.BcRp.Commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Sobki_.BcRp.Utils.ChatUtilities;

public class gamemode implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("gamemode")) {
				if (p.hasPermission("MODERATOR")) {
					if (args.length == 0) {
						ChatUtilities.ErrorNotEnoughArguments(p);
						p.sendMessage("§5Try §d/gamemode <gamemode>");
					} else if (args.length == 1) {
						if (args[0].equalsIgnoreCase("survival") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("0")) {
							p.setGameMode(GameMode.SURVIVAL);
							p.sendMessage("§eSet gamemode §6survival §efor §6" + p.getName() + "§e.");
						} else if (args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("1")) {
							p.setGameMode(GameMode.CREATIVE);
							p.sendMessage("§eSet gamemode §6creative §efor §6" + p.getName() + "§e.");
						} else if (args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("2")) {
							p.setGameMode(GameMode.ADVENTURE);
							p.sendMessage("§eSet gamemode §6adventure §efor §6" + p.getName() + "§e.");
						}
					} else if (args.length == 2) {
						Player target = Bukkit.getServer().getPlayer(args[1]);
						if (target == null) {
							p.sendMessage("§5Player §d" + args[1] + "§5not found.");
						} else {
							if (args[0].equalsIgnoreCase("survival") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("0")) {
								target.setGameMode(GameMode.SURVIVAL);
								p.sendMessage("§eSet gamemode §6survival §efor §6" + target.getName() + "§e.");
								target.sendMessage("§eYour gamemode was set to §6survival §eby §6" + p.getName() + "§e.");
							} else if (args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("1")) {
								target.setGameMode(GameMode.CREATIVE);
								p.sendMessage("§eSet gamemode §6creative §efor §6" + target.getName() + "§e.");
								target.sendMessage("§eYour gamemode was set to §6creative §eby §6" + p.getName() + "§e.");
							} else if (args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("2")) {
								target.setGameMode(GameMode.ADVENTURE);
								p.sendMessage("§eSet gamemode §6adventure §efor §6" + target.getName() + "§e.");
								target.sendMessage("§eYour gamemode was set to §6adventure §eby §6" + p.getName() + "§e.");
							}
						}
					}
				} else {
					ChatUtilities.ErrorInsufficientPermission(p);
				}
				
			}
			
			if (cmd.getName().equalsIgnoreCase("gm")) {
				if (p.hasPermission("MODERATOR")) {
					if (args.length == 0) {
						ChatUtilities.ErrorNotEnoughArguments(p);
						p.sendMessage("§5Try §d/gm <gamemode>");
					} else if (args.length == 1) {
						if (args[0].equalsIgnoreCase("survival") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("0")) {
							p.setGameMode(GameMode.SURVIVAL);
							p.sendMessage("§eSet gamemode §6survival §efor §6" + p.getName() + "§e.");
						} else if (args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("1")) {
							p.setGameMode(GameMode.CREATIVE);
							p.sendMessage("§eSet gamemode §6creative §efor §6" + p.getName() + "§e.");
						} else if (args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("2")) {
							p.setGameMode(GameMode.ADVENTURE);
							p.sendMessage("§eSet gamemode §6adventure §efor §6" + p.getName() + "§e.");
						}
					} else if (args.length == 2) {
						Player target = Bukkit.getServer().getPlayer(args[1]);
						if (target == null) {
							p.sendMessage("§5Player §d" + args[1] + "§5not found.");
						} else {
							if (args[0].equalsIgnoreCase("survival") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("0")) {
								target.setGameMode(GameMode.SURVIVAL);
								p.sendMessage("§eSet gamemode §6survival §efor §6" + target.getName() + "§e.");
								target.sendMessage("§eYour gamemode was set to §6survival §eby §6" + p.getName() + "§e.");
							} else if (args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("1")) {
								target.setGameMode(GameMode.CREATIVE);
								p.sendMessage("§eSet gamemode §6creative §efor §6" + target.getName() + "§e.");
								target.sendMessage("§eYour gamemode was set to §6creative §eby §6" + p.getName() + "§e.");
							} else if (args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("2")) {
								target.setGameMode(GameMode.ADVENTURE);
								p.sendMessage("§eSet gamemode §6adventure §efor §6" + target.getName() + "§e.");
								target.sendMessage("§eYour gamemode was set to §6adventure §eby §6" + p.getName() + "§e.");
							}
						}
					}
				} else {
					ChatUtilities.ErrorInsufficientPermission(p);
				}
				
			}
			
			if (cmd.getName().equalsIgnoreCase("gms")) {
				if (p.hasPermission("MODERATOR")) {
					if (args.length == 0) {
						p.setGameMode(GameMode.SURVIVAL);
						p.sendMessage("§eSet gamemode §6survival §efor §6" + p.getName() + "§e.");
					} else if (args.length == 1) {
						Player target = Bukkit.getServer().getPlayer(args[0]);
						if (target == null) {
							p.sendMessage("§5Player §d" + args[0] + "§5not found.");
						} else {
							target.setGameMode(GameMode.SURVIVAL);
							p.sendMessage("§eSet gamemode §6survival §efor §6" + target.getName() + "§e.");
							target.sendMessage("§eYour gamemode was set to §6survival §eby §6" + p.getName() + "§e.");
						}
					}
				} else {
					ChatUtilities.ErrorInsufficientPermission(p);
				}
			}
			
			if (cmd.getName().equalsIgnoreCase("gmc")) {
				if (p.hasPermission("MODERATOR")) {
					if (args.length == 0) {
						p.setGameMode(GameMode.CREATIVE);
						p.sendMessage("§eSet gamemode §6creative §efor §6" + p.getName() + "§e.");
					} else if (args.length == 1) {
						Player target = Bukkit.getServer().getPlayer(args[0]);
						if (target == null) {
							p.sendMessage("§5Player §d" + args[0] + "§5not found.");
						} else {
							target.setGameMode(GameMode.CREATIVE);
							p.sendMessage("§eSet gamemode §6creative §efor §6" + target.getName() + "§e.");
							target.sendMessage("§eYour gamemode was set to §6creative §eby §6" + p.getName() + "§e.");
						}
					}
				} else {
					ChatUtilities.ErrorInsufficientPermission(p);
				}
			}
			
			if (cmd.getName().equalsIgnoreCase("gma")) {
				if (p.hasPermission("MODERATOR")) {
					if (args.length == 0) {
						p.setGameMode(GameMode.ADVENTURE);
						p.sendMessage("§eSet gamemode §6adventure §efor §6" + p.getName() + "§e.");
					} else if (args.length == 1) {
						Player target = Bukkit.getServer().getPlayer(args[0]);
						if (target == null) {
							p.sendMessage("§5Player §d" + args[0] + "§5not found.");
						} else {
							target.setGameMode(GameMode.SURVIVAL);
							p.sendMessage("§eSet gamemode §6adventure §efor §6" + target.getName() + "§e.");
							target.sendMessage("§eYour gamemode was set to §6adventure §eby §6" + p.getName() + "§e.");
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
