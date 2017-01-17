package com.hawk.paint;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class PaintSniper4 implements Listener {
	
	Main plugin;
	
	public PaintSniper4(Main passedPlugin) {
		this.plugin = passedPlugin;
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {

		if (!(e.getItem().getType() == Material.GOLD_HOE)) return;
		
		e.getPlayer().launchProjectile(Snowball.class);
	}
	@EventHandler
	public void onEntityDamage(EntityDamageByEntityEvent e) {
		if(e.getDamager() instanceof Snowball) {
			Snowball s = (Snowball) e.getDamager();
			if (s.getShooter() instanceof Player) {
				Player shooter = (Player) s.getShooter();
					if (shooter.getInventory().getItemInMainHand().getType() == Material.GOLD_HOE) {
						e.setDamage(16.5);
				}
			}
		}
	}

}
