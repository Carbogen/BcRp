package com.Sobki_.BcRp.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Sobki_.BcRp.Earth.EarthMoney;
import com.Sobki_.BcRp.Fire.FireMoney;
import com.Sobki_.BcRp.Handlers.Methods;
import com.Sobki_.BcRp.Utils.ChatUtilities;
import com.Sobki_.BcRp.Water.WaterMoney;

public class MoneyCommands implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("givemoney")) {
				if (p.hasPermission("bcrp.command.givemoney")) {
					if (args.length < 4) {
						ChatUtilities.ErrorNotEnoughArguments(p);
						p.sendMessage("§f/givemoney <nation> <type> <player> <amount>");
					} else if (args.length > 4) {
						ChatUtilities.ErrorTooManyArguments(p);
					} else {
						if (args[0].equalsIgnoreCase("earth")) {
							if (args[1].equalsIgnoreCase("copper")) {
								Player target = Bukkit.getServer().getPlayer(args[2]);
								if (target == null) {
									p.sendMessage("§5Player §d" + args[2] + " §5not found!");
								} else {
									if (Methods.isInt(args[3])) {
										int amount = Integer.parseInt(args[3]);
										EarthMoney.giveEarthCopperPiece(target, amount);
									} else {
										p.sendMessage("§d" + args[3] + " §5is not a valid integer.");
									}
								}
								
							} else if (args[1].equalsIgnoreCase("silver")) {
								Player target = Bukkit.getServer().getPlayer(args[2]);
								if (target == null) {
									p.sendMessage("§5Player §d" + args[2] + " §5not found!");
								} else {
									if (Methods.isInt(args[3])) {
										int amount = Integer.parseInt(args[3]);
										EarthMoney.giveEarthSilverPiece(target, amount);
									} else {
										p.sendMessage("§d" + args[3] + " §5is not a valid integer.");
									}
								}
							} else if (args[1].equalsIgnoreCase("gold")) {
								Player target = Bukkit.getServer().getPlayer(args[2]);
								if (target == null) {
									p.sendMessage("§5Player §d" + args[2] + " §5not found!");
								} else {
									if (Methods.isInt(args[3])) {
										int amount = Integer.parseInt(args[3]);
										EarthMoney.giveEarthGoldPiece(target, amount);
									} else {
										p.sendMessage("§d" + args[3] + " §5is not a valid integer.");
									}
								}
							} else if (args[1].equalsIgnoreCase("goldingot")) {
								Player target = Bukkit.getServer().getPlayer(args[2]);
								if (target == null) {
									p.sendMessage("§5Player §d" + args[2] + " §5not found!");
								} else {
									if (Methods.isInt(args[3])) {
										int amount = Integer.parseInt(args[3]);
										EarthMoney.giveEarthGoldIngot(target, amount);
									} else {
										p.sendMessage("§d" + args[3] + " §5is not a valid integer.");
									}
								}
							} else {
								p.sendMessage("§5Invalid currency type.");
							}
						} else if (args[0].equalsIgnoreCase("water")) {
							if (args[1].equalsIgnoreCase("money")) {
								Player target = Bukkit.getServer().getPlayer(args[2]);
								if (target == null) {
									p.sendMessage("§5Player §d" + args[2] + " §5not found!");
								} else {
									if (Methods.isInt(args[3])) {
										int amount = Integer.parseInt(args[3]);
										WaterMoney.giveWaterTribeMoney(target, amount);
									} else {
										p.sendMessage("§d" + args[3] + " §5is not a valid integer.");
									}
								}
								
							} else {
								p.sendMessage("§5Invalid currency type.");
							}
						} else  if (args[0].equalsIgnoreCase("fire")) {
							if (args[1].equalsIgnoreCase("copper")) {
								Player target = Bukkit.getServer().getPlayer(args[2]);
								if (target == null) {
									p.sendMessage("§5Player §d" + args[2] + " §5not found!");
								} else {
									if (Methods.isInt(args[3])) {
										int amount = Integer.parseInt(args[3]);
										FireMoney.giveFireCopperPiece(target, amount);
									} else {
										p.sendMessage("§d" + args[3] + " §5is not a valid integer.");
									}
								}
								
							} else if (args[1].equalsIgnoreCase("silver")) {
								Player target = Bukkit.getServer().getPlayer(args[2]);
								if (target == null) {
									p.sendMessage("§5Player §d" + args[2] + " §5not found!");
								} else {
									if (Methods.isInt(args[3])) {
										int amount = Integer.parseInt(args[3]);
										FireMoney.giveFireSilverPiece(target, amount);
									} else {
										p.sendMessage("§d" + args[3] + " §5is not a valid integer.");
									}
								}
							} else if (args[1].equalsIgnoreCase("gold")) {
								Player target = Bukkit.getServer().getPlayer(args[2]);
								if (target == null) {
									p.sendMessage("§5Player §d" + args[2] + " §5not found!");
								} else {
									if (Methods.isInt(args[3])) {
										int amount = Integer.parseInt(args[3]);
										FireMoney.giveFireGoldPiece(target, amount);
									} else {
										p.sendMessage("§d" + args[3] + " §5is not a valid integer.");
									}
								}
							} else {
								p.sendMessage("§5Invalid currency type.");
							}
						} else {
							p.sendMessage("§5Invalid nation.");
						}
					}
				} else {
					ChatUtilities.ErrorInsufficientPermission(p);
				}
			}
		} else {
			sender.sendMessage("Only players can use this command!");
		}
		return true;
	}

}
