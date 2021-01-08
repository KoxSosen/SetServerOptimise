package fun.hahota.simon;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info(ChatColor.GREEN + "You are now safe from reloading!");
		getLogger().info(ChatColor.GREEN + "Make sure to give the plugin a positive review if you enjoy it's features.");
		
	}
	
	@Override
	public void onDisable() {
		getLogger().info(ChatColor.RED + "Goodbye!");
		

}}
