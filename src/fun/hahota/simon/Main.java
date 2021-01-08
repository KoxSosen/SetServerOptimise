package fun.hahota.simon;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		getLogger().info(ChatColor.GREEN + "SetServerOptimise is enabled!");
		getLogger().info(ChatColor.GREEN + "Make sure to give the plugin a positive review if you enjoy it's features.");
		getServer().getPluginManager().registerEvents(this, this);
		
		
	}
	
	@Override
	public void onDisable() {
		getLogger().info(ChatColor.RED + "Goodbye!");
	}
			

    	@EventHandler
    	public void onServerCommand(ServerCommandEvent event) {
    	  FileConfiguration bukkit = YamlConfiguration.loadConfiguration(new File(Bukkit.getServer().getWorldContainer(), "bukkit.yml"));
    	  if (event.getCommand().equalsIgnoreCase("optimise")) {
    		  // get spawn limits
    	    if (bukkit.getBoolean("spawn-limits")) {
    	      // Set optimised values (soon)
    	      Bukkit.getLogger().severe(ChatColor.RED + "Nou");
    }
}
}}
		
