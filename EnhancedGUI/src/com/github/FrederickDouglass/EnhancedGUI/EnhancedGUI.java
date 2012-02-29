package com.github.FrederickDouglass.EnhancedGUI;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

//import com.gmail.nossr50.config.LoadProperties;

public class EnhancedGUI extends JavaPlugin
{
	
	public static String maindirectory = "plugins" + File.separator + "EnhancedGUI";
	static File versionFile = new File (maindirectory + File.separator + "VERSION");
		
	public static final Logger log = Logger.getLogger("Minecraft");
	
	//For the Jar File
	public static File EnhancedGUI;

	
	//Sets the parameters for what is initialized at the start
	public void onEnable() 
	{
		log.info("EnhancedGUI has been enabled.");
		PluginManager pm = getServer().getPluginManager();
		
		if (pm.getPlugin("Spout") != null)
			System.out.println("Spout found! Initializing EnhancedGUI");
		else
			System.out.println("You must have Spout in order to use this plugin!");
	}
	
	
	
	
	public void onDisable()
	{
		log.info("EnhancedGUI has been disabled");
	}
	

}
