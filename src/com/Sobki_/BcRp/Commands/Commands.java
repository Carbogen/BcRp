package com.Sobki_.BcRp.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Sobki_.BcRp.BeginnerSetup.SelectElement;
import com.Sobki_.BcRp.Handlers.Methods;
import com.Sobki_.BcRp.Handlers.NPCs.Blacksmith;
import com.Sobki_.BcRp.Handlers.Skills.Forging;
import com.Sobki_.BcRp.Handlers.Skills.Herbalism;
import com.Sobki_.BcRp.Handlers.Skills.Jump;
import com.Sobki_.BcRp.Handlers.Skills.Speed;
import com.Sobki_.BcRp.Handlers.Skills.Strength;
import com.Sobki_.BcRp.Utils.ChatUtilities;
import com.Sobki_.BcRp.Water.Quests.TheArtOfFishing;

public class Commands implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("element")) {
				if (Methods.getElement(p).equals("null")) p.sendMessage("Element: " + "'" + "null" + "'");
				p.sendMessage("Element: " + "'" + Methods.getElement(p) + "'");
			}
			
			if (cmd.getName().equalsIgnoreCase("spawnwater")) {
				SelectElement.spawnWaterNPC(p.getLocation());
			}

			if (cmd.getName().equalsIgnoreCase("spawnearth")) {
				SelectElement.spawnEarthNPC(p.getLocation());
			}

			if (cmd.getName().equalsIgnoreCase("spawnfire")) {
				SelectElement.spawnFireNPC(p.getLocation());
			}

			if (cmd.getName().equalsIgnoreCase("spawnair")) {
				SelectElement.spawnAirNPC(p.getLocation());
			}
			
			if (cmd.getName().equalsIgnoreCase("spawnblacksmith")) {
				Blacksmith.spawnWNBlacksmith(p.getLocation());
			}
			
			if (cmd.getName().equalsIgnoreCase("isop")) {
				if (args.length == 0) {
					ChatUtilities.ErrorNotEnoughArguments(p);
				} else {
					Player target = Bukkit.getServer().getPlayer(args[0]);
					if (target.isOp()) {
						p.sendMessage(target.getName() + " IS an Operator.");
					} else {
						p.sendMessage(target.getName() + " IS NOT an Operator.");
					}
				}
			}
			
			if (cmd.getName().equalsIgnoreCase("summonyufu")) {
				
				TheArtOfFishing.spawnYuFu(p.getLocation());
			}
			
			if (cmd.getName().equalsIgnoreCase("resetelement")) {
				Methods.resetElement(p);
				p.sendMessage("Element reset.");
			}
			
			if (cmd.getName().equalsIgnoreCase("resetstats")) {
				Speed.takeSpeedLevel(p, Speed.getSpeedLevel(p));
				Jump.takeJumpLevel(p, Jump.getJumpLevel(p));
				Herbalism.takeHerbalismLevel(p, Herbalism.getHerbalismLevel(p));
				Strength.takeStrengthLevel(p, Strength.getStrengthLevel(p));
				Forging.takeForgingLevel(p, Forging.getForgingLevel(p));
				p.sendMessage("Stats reset.");
			}
			
			if (cmd.getName().equalsIgnoreCase("resetlevel")) {
				Methods.takeExperience(p, Methods.getExperience(p));
				Methods.takeLevel(p, Methods.getLevel(p));
			}
			
			if (cmd.getName().equalsIgnoreCase("stats")) {
				p.sendMessage("§8§m-----§8[ §eStats §8]§8§m-----");
				if (Methods.getElement(p).equals("WATER")) {
					p.sendMessage("§6Element §8| §3Water");
				} else if (Methods.getElement(p).equals("EARTH")) {
					p.sendMessage("§6Element §8| §aEarth");
				} else if (Methods.getElement(p).equals("FIRE")) {
					p.sendMessage("§6Element §8| §cFire");
				} else if (Methods.getElement(p).equals("AIR")) {
					p.sendMessage("§6Element §8| §fAir");
				} else {
					p.sendMessage("§6Element §8| §enull");
				}
				p.sendMessage("§6Level §8| §e" + Methods.getLevel(p) + " §8/ §e" + Methods.maxLevel);
				p.sendMessage("§6Experience §8| §e" + Methods.getExperience(p) + " §8/ §e" + Methods.calculateExperience(p));
				p.sendMessage("§6Skills:");
				p.sendMessage("    §6Speed §8| §e" + Speed.getSpeedLevel(p) + " §8/ §e50");
				p.sendMessage("    §6Jump §8| §e" + Jump.getJumpLevel(p) + " §8/ §e50");
				p.sendMessage("    §6Herbalism §8| §e" + Herbalism.getHerbalismLevel(p) + " §8/ §e50");
				p.sendMessage("    §6Strength §8| §e" + Strength.getStrengthLevel(p) + " §8/ §e50");
				p.sendMessage("    §6Forging §8| §e" + Forging.getForgingLevel(p) + " §8/ §e50");
			}
			
			/*if (cmd.getName().equalsIgnoreCase("updatePlayerFile")) {
				if (p.hasPermission("bcrp.command.updateplayerfile")) {
					Methods.updatePlayerFile();
					for (Player players : Bukkit.getServer().getOnlinePlayers()) {
						if (players.isOp()) {
							players.sendMessage("§2" + p.getName() + " §ais updating Player Files for all online players.");
						}
					}
				}
			}*/
		} else {
			sender.sendMessage("Only players can use this command!");
		}
		return true;
	}

}
