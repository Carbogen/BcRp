package com.Sobki_.BcRp.Quests;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.Sobki_.BcRp.Core;
import com.Sobki_.BcRp.Handlers.Methods;

public class Level1 implements Listener {

	public static String[] startingMessages = {
		"§f§oIn a world where chaos and darkness thrive, you are to bring back peace.",
		"§f§oFive waterbending masters from the Northern Water Tribe managed to corrupt Tui and La into their service.",
		"§f§oThey use the two spirits to gain access to the spirit world and then proceed to take control of a majority of the spirits who inhabit it.",
		"§f§oThey then force the spirits to hunt down the echoes of the past avatars in an attempt to control their power.",
		"§f§oThey are able to do this through the spiritbending sub-element, a very rare ability only waterbending masters can achieve.",
		"",
		"§f§oYou stand before four great and powerful creatures, whom you do not know.",
		"§f§oThey begin to speak in unison, as their voices echo through your head.",
		""
	};

	public static String[] waterTurtleMessages = {
		"§8(§3100§8) §8§l[§3Water§8§l] §9Lion Turtle§8: §fWe are the great Lion Turtles, and you, are a non-bender. However, this is no more.",
		"",
		"§8(§3100§8) §8§l[§3Water§8§l] §9Lion Turtle§8: §fYou are going to be gifted with the ability to control one of the four elements of this world, but choose wisely mortal, as we will not give you another chance to choose.",
		""
	};

	public static String[] earthTurtleMessages = {
		"§8(§a100§8) §8§l[§aEarth§8§l] §2Lion Turtle§8: §fWe are the great Lion Turtles, and you, are a non-bender. However, this is no more.",
		"§f§oThe Lion Turtles all take a deep breath and continue to speak.",
		"§8(§a100§8) §8§l[§aEarth§8§l] §2Lion Turtle§8: §fYou are going to be gifted with the ability to control one of the four elements of this world, but choose wisely mortal, as we will not give you another chance to choose.",
		"§e§oWalk towards the Lion Turtle that represents the element you wish to bend."
	};

	public static String[] fireTurtleMessages = {
		"§8(§c100§8) §8§l[§cFire§8§l] §4Lion Turtle§8: §fWe are the great Lion Turtles, and you, are a non-bender. However, this is no more.",
		"",
		"§8(§c100§8) §8§l[§cFire§8§l] §4Lion Turtle§8: §fYou are going to be gifted with the ability to control one of the four elements of this world, but choose wisely mortal, as we will not give you another chance to choose.",
		""
	};

	public static String[] airTurtleMessages = {
		"§8(§f100§8) §8§l[§fAir§8§l] §7Lion Turtle§8: §fWe are the great Lion Turtles, and you, are a non-bender. However, this is no more.",
		"",
		"§8(§f100§8) §8§l[§fAir§8§l] §7Lion Turtle§8: §fYou are going to be gifted with the ability to control one of the four elements of this world, but choose wisely mortal, as we will not give you another chance to choose.",
		""
	};

	public static void runLevel1Quest(final Player p) {
		p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 50, 1));
		p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 42, 1));
		Methods.sendDelayedMessage(p, 8, startingMessages);
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Core.plugin, new Runnable() {
			@Override
			public void run() {
				Methods.sendDelayedMessageLionTurtle(p, 8, waterTurtleMessages, earthTurtleMessages, fireTurtleMessages, airTurtleMessages);
			}
		}, 20 * 72);

		// Lion Turtles

		/*


		// After selection

		p.sendMessage("§fWise choice, young bender. I shall grant you the ability to control <element>.");
		p.sendMessage("§fTo bind your first ability, find the name of the move by typing §7/bending display <element>§f.");
		p.sendMessage("§fNow knowing the name of a move, type §7/bending bind <move name> [slot#].");
		p.sendMessage("§fTo learn how to use an ability, review §7/bending help <move name>§f.");
		p.sendMessage("§fNow, go practice your bending on those dark spirits over there.");

		// After defeating spirits

		p.sendMessage("§f§oThe Lion Turtle looks pleased, he begins to speak once more.");
		p.sendMessage("§fI see potential in you, young mortal. However, I can no longer assist you in your journey to become a great bender.");
		p.sendMessage("§fFind bending scrolls to learn how to use new moves.");
		p.sendMessage("Travel down the path infront of you, and find a man by the name of Da Shi, the traveler whom contains all the knowledge of bending in his books.");
		p.sendMessage("Now go forth, and begin your journey of mastering your element!");

		 */
	}



	@EventHandler
	public void onWaterSignChange(SignChangeEvent event) {
		Player p = event.getPlayer();
		for(SignTextEnum signTextEnum : SignTextEnum.values()){
			if (event.getLine(0).equalsIgnoreCase("[element]") && event.getLine(1).equalsIgnoreCase(signTextEnum.name())){
				int i = 0;
				for(String str : signTextEnum.getSignText()) {

					event.setLine(i, str);
					i = i + 1;


				}
			}
		}
	}

	@SuppressWarnings("static-access")
	@EventHandler
	public void onWaterSignClick(PlayerInteractEvent e) {

		if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			Block clickedBlock = e.getClickedBlock();
			if (clickedBlock.getType() == Material.WALL_SIGN || clickedBlock.getType() == Material.SIGN || clickedBlock.getType() == Material.SIGN_POST) {
				Sign sign = (Sign) clickedBlock.getState();
				for(SignTextEnum s : SignTextEnum.values()){

					Bukkit.broadcastMessage("" + sign.getLines());
					Bukkit.broadcastMessage("" + s.getSignText());
					if(sign.getLines().equals(s.getSignText())){
						Bukkit.broadcastMessage("Water");
						return;	
					}
				}
			}
		}
	}

}
