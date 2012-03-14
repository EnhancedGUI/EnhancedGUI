/**Enhanced GUI will add additional functionality to the Minecraft GUI
 * 
 * @author Douglas Rourke
 * @author Krzysztof Kotarba
 * @version 0.0.1
 */
package com.github.FrederickDouglass.EnhancedGUI;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;



public class EnhancedGUI extends JavaPlugin
{
	public static String maindirectory = "plugins" + File.separator + "EnhancedGUI";	
	public static final Logger log = Logger.getLogger("Minecraft");
	private static EnhancedGUI instance;
	private File file; //Will be used to set up config.yml
	

	/** When the plugin is enabled, it will:
	 *  -create a new instance 
	 *  -pull data from the config.yml file
	 *  -Initialize a listener
	 *  
	 * @see org.bukkit.plugin.java.JavaPlugin#onEnable()
	 */
	public void onEnable() 
	{
		log.info("EnhancedGUI has been enabled.");
		instance = this;
		file = new File(getDataFolder(), "config.yml");
		
		getServer().getPluginManager().registerEvents(new EGListener(this),this);
		
	}
	
	
	/**Allows the player to be sent a message in game
	 * 
	 */
	public void send(Player player, String message, ChatColor color) 
	{
		player.sendMessage(color + message);
	}
	public void send(Player player, String message) 
	{
		send(player, message, ChatColor.AQUA);
	}
	
	
	/** Displays a message when the plugin is disabled
	 * 
	 * @see org.bukkit.plugin.java.JavaPlugin#onDisable()
	 */
	public void onDisable()
	{
		log.info("EnhancedGUI has been disabled");
	}
	
	
	/**Returns the instance of the mod
	 * 
	 * @return instance;
	 */
	public static final EnhancedGUI getInstance()
	{
		return instance;
	}
	

}
