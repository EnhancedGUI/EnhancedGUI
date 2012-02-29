package com.github.FrederickDouglass.EnhancedGUI;

import org.getspout.spoutapi.keyboard.Keyboard;
import com.gmail.nossr50.config.LoadProperties;

//This class creates the configs for the GUI
//This is an additional comment, so I can see if I finally have figured git out
public class SpoutGUI
{
	public static Keyboard keypress;
	
	//Sets the keyboard key L to the default menu key
	public static void setupSpoutConfigs()
	{
		String temp = LoadProperties.readString("Spout.Menu.Key", "KEY_L");
		
		for (Keyboard x : Keyboard.values())
		{
			if(x.toString().equalsIgnoreCase(temp))
				keypress = x;
		}
		
		if (keypress == null)
		{
			System.out.println("Invalid KEY for Spout.Menu.Key, using KEY_L");
			keypress = Keyboard.KEY_L;
		}
	}
}