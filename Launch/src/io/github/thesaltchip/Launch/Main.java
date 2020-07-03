package io.github.thesaltchip.Launch;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {

	}

	@Override
	public void onDisable() {

	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("launch") || label.equalsIgnoreCase("lch")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("*console goes flying*");
				return true;
			}

			Player player = (Player) sender;

			// /launch /launch <number>
			if (args.length == 0) {
				// /launch
				player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Zoooom!");
				player.setVelocity(player.getLocation().getDirection().setY(2));
				
				//Fun thing that makes you look up
//				for(int i = 0; i < 10; i++) {
//					Vector v = player.getLocation().getDirection().setY(1);
//					Location l = new Location(player.getWorld(), player.getLocation().getX(),player.getLocation().getY(), player.getLocation().getZ());
//					l.setDirection(v);
//					
//					player.teleport(l);
//					
//					try {
//						Thread.sleep(50);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
				
				return true;
			}
			
			// /launch <number>
			player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Zoooom!");
			player.setVelocity(player.getLocation().getDirection().multiply(Integer.parseInt(args[0])).setY(2));

			return true;

		}

		return false;
	}
}
