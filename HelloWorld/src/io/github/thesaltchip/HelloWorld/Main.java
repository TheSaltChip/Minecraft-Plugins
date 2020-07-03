package io.github.thesaltchip.HelloWorld;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		 
	}
	
	// /hello command
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equalsIgnoreCase("hello")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if(player.hasPermission("hello.use")){
					player.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Hey :)");
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&1H&2a&3v&4e &5f&6u&6n&7!"));
					return true;
				} 
				player.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "You do not have permission");
				
				
			}
			else {
				sender.sendMessage("Hey console");
				return true;
			}
		}
		
		return false;
	}
}
