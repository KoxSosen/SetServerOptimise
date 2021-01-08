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
		
		
	}
	
	@Override
	public void onDisable() {
		getLogger().info(ChatColor.RED + "Goodbye!");
	}
			
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
	if (cmd.getName().equalsIgnoreCase("optimise")) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission("optimise.use")) {
				getServer().getPluginManager().registerEvents(this, this);
			}
		}
	
	 
	}
	return true;
	
	}
    	@EventHandler
    	public void onServerCommand(ServerCommandEvent event) {
    	  FileConfiguration bukkit = YamlConfiguration.loadConfiguration(new File(Bukkit.getServer().getWorldContainer(), "bukkit.yml"));
    	  if (event.getCommand().equalsIgnoreCase("optimise")) {
    	    // Restarts server if server is set up for it.
    	    if (bukkit.getBoolean("spawn-limits")) {
    	      Bukkit.getLogger().severe(ChatColor.translateAlternateColorCodes('&', "&8-" + getConfig().getString("MessageBeforeStopLoL")));
    	      event.setCommand("restart");
    	    } else {
    	      // Call to server shutdown on disable.
    	      // Won't hurt if server already disables itself, but will prevent plugin unload/reload.
    	      Bukkit.getLogger().severe(ChatColor.translateAlternateColorCodes('&', "&8-" + getConfig().getString("MessageBeforeStopLoL")));
    	      Bukkit.shutdown();
    }
}
}}
		
