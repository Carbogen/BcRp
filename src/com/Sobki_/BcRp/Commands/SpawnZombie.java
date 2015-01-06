package com.Sobki_.BcRp.Commands;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Sobki_.BcRp.Handlers.Methods;
import com.Sobki_.BcRp.Handlers.Mobs.Zombies;
import com.Sobki_.BcRp.Utils.ChatUtilities;

public class SpawnZombie implements CommandExecutor {
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("spawnzombie")) {
				if (args.length < 2) {
					ChatUtilities.ErrorNotEnoughArguments(p);
					p.sendMessage("§5Try §d/spawnzombie <level> <amount>§5.");
				} else if (args.length > 2) {
					ChatUtilities.ErrorTooManyArguments(p);
					p.sendMessage("§5Try §d/spawnzombie <level> <amount>§5.");
				} else {
					if (args[0].equalsIgnoreCase("1")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl1(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("7")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl7(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("13")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl13(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("19")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl19(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("25")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl25(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("31")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl31(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("37")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl37(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("43")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl43(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("49")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl49(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("55")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl55(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("61")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl61(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("67")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl67(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("73")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl73(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("79")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl79(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("85")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl85(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("91")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl91(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("97")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 zombies at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Zombies.spawnZombieLvl97(targetLoc, x);
							}
						}
					}
				}
			}
			
			
			if (cmd.getName().equalsIgnoreCase("zombies")) {
				p.sendMessage("§8§m----§8[ §5Zombies §8]§8§m----");
				p.sendMessage("§5Bandit §8[§7Lvl 1§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 7§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 13§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 19§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 25§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 31§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 37§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 43§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 49§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 55§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 61§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 67§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 73§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 79§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 85§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 91§8]");
				p.sendMessage("§5Bandit §8[§7Lvl 97§8]");
			}
		} else {
			sender.sendMessage("Only players can use this command.");
		}
		return true;
	}

}
