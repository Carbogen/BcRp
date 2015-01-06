package com.Sobki_.BcRp.Water;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

import com.Sobki_.BcRp.Utils.ChatUtilities;

public class WaterScrolls implements Listener {
	
	/*
	 * Junk Item - 90%
	 * Common - 50%
	 * Uncommon - 40%
	 * Unique - 25%
	 * Rare - 15%
	 * Spiritual - 5%
	 * Omnipotence - 1%
	 */
	
	public static ItemStack waterManipulationBook = new ItemStack(Material.WRITTEN_BOOK); {
		BookMeta waterManipulationBookMeta = (BookMeta) waterManipulationBook.getItemMeta();
		waterManipulationBookMeta.setDisplayName("§3Water Scroll");
		ArrayList<String> waterManipulationBookList = new ArrayList<String>();
		waterManipulationBookList.add("§9An ancient scroll which teaches the ways of Water Manipulation.");
		waterManipulationBookList.add(ChatUtilities.uniqueString);
		waterManipulationBookMeta.setLore(waterManipulationBookList);
		waterManipulationBookMeta.addPage("1", "2");
		waterManipulationBookMeta.setPage(1, "§bThis is a test");
		waterManipulationBookMeta.setPage(2, "§cThis" + "\n" + "is" + "\n" + "another" + "\n" + "test");
		waterManipulationBook.setItemMeta(waterManipulationBookMeta);
	}
	
	public static ItemStack healingWatersBook = new ItemStack(Material.WRITTEN_BOOK); {
		ItemMeta healingWatersBookMeta = healingWatersBook.getItemMeta();
		healingWatersBookMeta.setDisplayName("§3Water Scroll");
		ArrayList<String> healingWatersBookList = new ArrayList<String>();
		healingWatersBookList.add("§9An ancient scroll which teaches the ways of Healing Waters.");
		healingWatersBookList.add(ChatUtilities.uniqueString);
		healingWatersBookMeta.setLore(healingWatersBookList);
		healingWatersBook.setItemMeta(healingWatersBookMeta);
	}
	
	public static ItemStack surgeBook = new ItemStack(Material.WRITTEN_BOOK); {
		ItemMeta surgeBookMeta = surgeBook.getItemMeta();
		surgeBookMeta.setDisplayName("§3Water Scroll");
		ArrayList<String> surgeBookList = new ArrayList<String>();
		surgeBookList.add("§9An ancient scroll which teaches the ways of Surge.");
		surgeBookList.add(ChatUtilities.uniqueString);
		surgeBookMeta.setLore(surgeBookList);
		surgeBook.setItemMeta(surgeBookMeta);
	}
	
	public static ItemStack waterBubbleBook = new ItemStack(Material.WRITTEN_BOOK); {
		ItemMeta waterBubbleBookMeta = waterBubbleBook.getItemMeta();
		waterBubbleBookMeta.setDisplayName("§3Water Scroll");
		ArrayList<String> waterBubbleBookList = new ArrayList<String>();
		waterBubbleBookList.add("§9An ancient scroll which teaches the ways of Healing Waters.");
		waterBubbleBookList.add(ChatUtilities.uniqueString);
		waterBubbleBookMeta.setLore(waterBubbleBookList);
		waterBubbleBook.setItemMeta(waterBubbleBookMeta);
	}
	
	@EventHandler
	public void onWaterBookClick(PlayerInteractEvent event) {
		Player p = event.getPlayer();
		p.getInventory().addItem(waterManipulationBook);
	}

}
