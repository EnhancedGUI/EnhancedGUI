package com.github.FrederickDouglass.EnhancedGUI;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class SampleListener implements Listener
{
	@EventHandler
	public void StopDiamondBlockBreak(BlockBreakEvent event)
	{
		if(event.getBlock().getType() == Material.DIAMOND_BLOCK)
		{
			event.setCancelled(true);
			event.getPlayer().sendMessage(ChatColor.RED+"You can't destroy that block.");
		}
	}
}
