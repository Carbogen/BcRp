package com.Sobki_.BcRp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.Sobki_.BcRp.BeginnerSetup.SelectElement;
import com.Sobki_.BcRp.Commands.Commands;
import com.Sobki_.BcRp.Commands.MoneyCommands;
import com.Sobki_.BcRp.Commands.SkillsCommand;
import com.Sobki_.BcRp.Commands.SpawnSkeleton;
import com.Sobki_.BcRp.Commands.SpawnZombie;
import com.Sobki_.BcRp.Commands.gamemode;
import com.Sobki_.BcRp.Commands.godandfly;
import com.Sobki_.BcRp.Commands.tp;
import com.Sobki_.BcRp.Handlers.Mobs.BoarQPine;
import com.Sobki_.BcRp.Handlers.Mobs.BuffaloYak;
import com.Sobki_.BcRp.Handlers.Mobs.DragonMoose;
import com.Sobki_.BcRp.Handlers.Mobs.GemsbokBull;
import com.Sobki_.BcRp.Handlers.Mobs.Lemur;
import com.Sobki_.BcRp.Handlers.Mobs.LionTurtle;
import com.Sobki_.BcRp.Handlers.Mobs.OstrichHorse;
import com.Sobki_.BcRp.Handlers.Mobs.PolarDog;
import com.Sobki_.BcRp.Handlers.Mobs.Zombies;
import com.Sobki_.BcRp.Handlers.Mobs.Bison.AdultBison;
import com.Sobki_.BcRp.Handlers.Mobs.Bison.BabyBison;
import com.Sobki_.BcRp.Handlers.NPCs.Blacksmith;
import com.Sobki_.BcRp.Handlers.Skills.Herbalism;
import com.Sobki_.BcRp.Handlers.Skills.Jump;
import com.Sobki_.BcRp.Handlers.Skills.Speed;
import com.Sobki_.BcRp.Handlers.Skills.Strength;
import com.Sobki_.BcRp.Listeners.CreatureSpawn;
import com.Sobki_.BcRp.Listeners.EntityDamage;
import com.Sobki_.BcRp.Listeners.EntityDamageByEntity;
import com.Sobki_.BcRp.Listeners.InventoryClick;
import com.Sobki_.BcRp.Listeners.PlayerChat;
import com.Sobki_.BcRp.Listeners.PlayerInteractEntity;
import com.Sobki_.BcRp.Listeners.PlayerJoin;
import com.Sobki_.BcRp.Listeners.PlayerQuit;
import com.Sobki_.BcRp.Quests.Level1;
import com.Sobki_.BcRp.Quests.QuestHandler;
import com.Sobki_.BcRp.Water.WaterScrolls;
import com.Sobki_.BcRp.Water.Quests.TheArtOfFishing;
import com.Sobki_.BcRp.config.ConfigManager;

public class Core extends JavaPlugin implements Listener {

	public static Core plugin;

	int num = 1;
	public static HashMap<String, Villager> villagers2 = new HashMap<String, Villager>();
	ArrayList<String> villagers = new ArrayList<String>();
	
	@Override
	public void onEnable() {
		Bukkit.getServer().getLogger().info(this.getDescription().getName() + " v" + this.getDescription().getVersion() + " by " + this.getDescription().getAuthors() + " has been enabled!");
	
		
		Bukkit.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");

		plugin = this;
		Commands cmds = new Commands();
		getCommand("element").setExecutor(cmds);
		getCommand("spawnwater").setExecutor(cmds);
		getCommand("spawnearth").setExecutor(cmds);
		getCommand("spawnfire").setExecutor(cmds);
		getCommand("spawnair").setExecutor(cmds);
		getCommand("spawnblacksmith").setExecutor(cmds);
		getCommand("resetelement").setExecutor(cmds);
		getCommand("resetstats").setExecutor(cmds);
		getCommand("stats").setExecutor(cmds);
		getCommand("friend").setExecutor(cmds);
		getCommand("isop").setExecutor(cmds);
		getCommand("summonyufu").setExecutor(cmds);
		tp tp = new tp();
		getCommand("tp").setExecutor(tp);
		getCommand("tphere").setExecutor(tp);
		
		gamemode gamemode = new gamemode();
		getCommand("gamemode").setExecutor(gamemode);
		getCommand("gm").setExecutor(gamemode);
		getCommand("gms").setExecutor(gamemode);
		getCommand("gmc").setExecutor(gamemode);
		getCommand("gma").setExecutor(gamemode);
		getCommand("god").setExecutor(new godandfly());
		getCommand("fly").setExecutor(new godandfly());
		getCommand("spawnzombie").setExecutor(new SpawnZombie());
		getCommand("zombies").setExecutor(new SpawnZombie());
		getCommand("spawnskeleton").setExecutor(new SpawnSkeleton());
		getCommand("skeletons").setExecutor(new SpawnSkeleton());

		getCommand("givemoney").setExecutor(new MoneyCommands());
		getCommand("skills").setExecutor(new SkillsCommand());
		
		getCommand("herbcraft").setExecutor(new Herbalism());
		registerEvents();

		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
			public void run() {
				//villagers.clear();
				villagers2.clear();
				for (LivingEntity le : Bukkit.getServer().getWorld("world").getLivingEntities()) {
					if (le instanceof Villager) {
						Villager v = (Villager) le;
						if (v.getCustomName() == null) return;
						villagers2.put(v.getCustomName(), v);

						//Bukkit.broadcastMessage("Villager Added");

					}

				}
				if(villagers2.size() == 0){
					SelectElement.spawnWaterNPC(SelectElement.waterNPCLocation);
					SelectElement.spawnEarthNPC(SelectElement.earthNPCLocation);
					SelectElement.spawnFireNPC(SelectElement.fireNPCLocation);
					SelectElement.spawnAirNPC(SelectElement.airNPCLocation);
					return;
				}

				for (@SuppressWarnings("unused") String g : villagers2.keySet()) {
					if(!villagers2.containsKey("§9§lWater")){
						SelectElement.spawnWaterNPC(SelectElement.waterNPCLocation);
						//villagers.add("§9§lWater");


					}else if (!villagers2.containsKey("§2§lEarth")){


						SelectElement.spawnEarthNPC(SelectElement.earthNPCLocation);
						//villagers.add("§2§lEarth");


					}else if (!villagers2.containsKey("§c§lFire")) {

						SelectElement.spawnFireNPC(SelectElement.fireNPCLocation);
						//villagers.add("§c§lFire");

					}else if (!villagers2.containsKey("§7§lAir")) {

						SelectElement.spawnAirNPC(SelectElement.airNPCLocation);
						//villagers.add("§7§lAir");
					}else{
						if(villagers2.get("§9§lWater").getLocation() != SelectElement.waterNPCLocation){
							villagers2.get("§9§lWater").remove();
							villagers2.remove("§9§lWater");
							SelectElement.spawnWaterNPC(SelectElement.waterNPCLocation);

						}
						if(villagers2.get("§2§lEarth").getLocation() != SelectElement.earthNPCLocation){
							villagers2.get("§2§lEarth").remove();
							villagers2.remove("§2§lEarth");
							SelectElement.spawnEarthNPC(SelectElement.earthNPCLocation);

						}
						if(villagers2.get("§c§lFire").getLocation() != SelectElement.fireNPCLocation){
							villagers2.get("§c§lFire").remove();
							villagers2.remove("§c§lFire");
							SelectElement.spawnFireNPC(SelectElement.fireNPCLocation);

						}
						if(villagers2.get("§7§lAir").getLocation() != SelectElement.airNPCLocation){
							villagers2.get("§7§lAir").remove();
							villagers2.remove("§7§lAir");
							SelectElement.spawnAirNPC(SelectElement.airNPCLocation);

						}
					}
				}
			}


		}, 20 * 5, 20 * 5);
	}
	
/*
	public void load() {
		Core.plugin.reloadConfig();
	}
	*/


	@Override
	public void onDisable() {
		Bukkit.getServer().getLogger().info(this.getDescription().getName() + " v" + this.getDescription().getVersion() + " by " + this.getDescription().getAuthors() + " has been disabled!");
	}

	public static void saveFile(){
		plugin.saveConfig();
	}

	public void registerEvents() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new PlayerInteractEntity(), this);
		pm.registerEvents(new InventoryClick(this), this);
		pm.registerEvents(new EntityDamageByEntity(), this);
		pm.registerEvents(new PlayerJoin(), this);
		pm.registerEvents(new PlayerQuit(), this);
		pm.registerEvents(new PlayerChat(), this);
		pm.registerEvents(new CreatureSpawn(), this);
		pm.registerEvents(new EntityDamage(), this);
		pm.registerEvents(new Zombies(), this);
		
		pm.registerEvents(new Speed(), this);
		pm.registerEvents(new Jump(), this);
		pm.registerEvents(new Herbalism(), this);
		pm.registerEvents(new Strength(), this);

		pm.registerEvents(new BoarQPine(), this);
		pm.registerEvents(new BuffaloYak(), this);
		pm.registerEvents(new DragonMoose(), this);
		pm.registerEvents(new GemsbokBull(), this);
		pm.registerEvents(new Lemur(), this);
		pm.registerEvents(new OstrichHorse(), this);
		pm.registerEvents(new PolarDog(), this);
		pm.registerEvents(new BabyBison(), this);
		pm.registerEvents(new AdultBison(), this);
		pm.registerEvents(new LionTurtle(), this);

		pm.registerEvents(new Blacksmith(), this);
		
		pm.registerEvents(new WaterScrolls(), this);
		pm.registerEvents(new QuestHandler(), this);
		
		pm.registerEvents(new TheArtOfFishing(), this);
		
		pm.registerEvents(new Level1(), this);

	}
	
	
	public File getPlayerF(Player player)
	{
		createPlayerFile(player);
		File file = new File(getDataFolder() + "/Players/", player.getUniqueId().toString() + ".yml");
		return file;
	}


	public void createPlayerFile(Player p) {
		File file = new File(getDataFolder() + "/Players/", p.getUniqueId().toString() + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		//if (config.getString("Name") == null) {
		config.addDefault("Name", p.getName());
		config.addDefault("UUID", p.getUniqueId().toString());
		/*
		check(p, "Element", null);
		check(p, "Level", 0);
		check(p, "Experience", 0);
		check(p, "Skills.speedLevel", 0);
		check(p, "Skills.jumpLevel", 0);
		check(p, "Skills.herbalismLevel", 0);
		check(p, "Skills.strengthLevel", 0);
		check(p, "Skills.forgingLevel", 0);
*/

		try {
			ConfigManager.save(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//} else {}
	}
}
