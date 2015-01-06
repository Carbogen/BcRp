package com.Sobki_.BcRp.Commands;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Sobki_.BcRp.Handlers.Methods;
import com.Sobki_.BcRp.Handlers.Mobs.Skeletons;
import com.Sobki_.BcRp.Utils.ChatUtilities;

public class SpawnSkeleton implements CommandExecutor {
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("spawnskeleton")) {
				if (args.length < 2) {
					ChatUtilities.ErrorNotEnoughArguments(p);
					p.sendMessage("§5Try §d/spawnskeleton <level> <amount>§5.");
				} else if (args.length > 2) {
					ChatUtilities.ErrorTooManyArguments(p);
					p.sendMessage("§5Try §d/spawnskeleton <level> <amount>§5.");
				} else {
					if (args[0].equalsIgnoreCase("1")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl1(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("7")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl7(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("13")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl13(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("19")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl19(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("25")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl25(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("31")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl31(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("37")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl37(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("43")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl43(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("49")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl49(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("55")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl55(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("61")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl61(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("67")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl67(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("73")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl73(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("79")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl79(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("85")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl85(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("91")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl91(targetLoc, x);
							}
						}
					} else if (args[0].equalsIgnoreCase("97")) {
						if (Methods.isInt(args[1])) {
							int x = Integer.parseInt(args[1]);
							if (x > 10) {
								p.sendMessage("§5You cannot spawn any more than 10 skeletons at a time.");
							} else {
								Block targetBlock = p.getTargetBlock(null, 100);
								Location targetLoc = targetBlock.getRelative(BlockFace.UP).getLocation();
								Skeletons.spawnSkeletonLvl97(targetLoc, x);
							}
						}
					}
				}
			}
			
			
			if (cmd.getName().equalsIgnoreCase("skeletons")) {
				p.sendMessage("§8§m----§8[ §5Skeletons §8]§8§m----");
				p.sendMessage("§5Skeleton §8[§7Lvl 1§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 7§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 13§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 19§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 25§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 31§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 37§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 43§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 49§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 55§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 61§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 67§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 73§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 79§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 85§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 91§8]");
				p.sendMessage("§5Skeleton §8[§7Lvl 97§8]");
			}
		} else {
			sender.sendMessage("Only players can use this command.");
		}
		return true;
	}

}