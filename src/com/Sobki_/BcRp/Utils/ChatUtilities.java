package com.Sobki_.BcRp.Utils;

import org.bukkit.entity.Player;

public class ChatUtilities {
	
	public static String junkItemString = "§8§m§l{§7 Junk Item §8§m§l}";
	public static String commonString = "§2§m§l{§a Common §2§m§l}";
	public static String uncommonString = "§1§m§l{§9 Uncommon §1§m§l}";
	public static String uniqueString = "§6§m§l{§e Unique §6§m§l}";
	public static String rareString = "§5§m§l{§d Rare §5§m§l}";
	public static String spiritualString = "§3§m§l{§b Spiritual §3§m§l}";
	public static String omnipotenceString = "§4§m§l{§0§l Omnipotence §4§m§l}";
	
	public static String starter() {
		return null;
	}
	
	public static void ErrorInsufficientPermission(Player p) {
		p.sendMessage("§5Insufficient permission.");
	}
	
	public static void ErrorInvalidArgument(Player p) {
		p.sendMessage("§5Invalid argument(s).");
	}
	
	public static void ErrorNotEnoughArguments(Player p) {
		p.sendMessage("§5Not enough arguments.");
	}
	
	public static void ErrorTooManyArguments(Player p) {
		p.sendMessage("§5Too many arguments.");
	}

}
