package com.hawk.paint;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		
		//MachinePainter 
		
		this.getServer().getPluginManager().registerEvents(new MachinePainter1(this), this);
		this.getServer().getPluginManager().registerEvents(new MachinePainter2(this), this);
		this.getServer().getPluginManager().registerEvents(new MachinePainter3(this), this);
		this.getServer().getPluginManager().registerEvents(new MachinePainter4(this), this);
		this.getServer().getPluginManager().registerEvents(new MachinePainter5(this), this);
		
		//PaintSnipers 
		
		this.getServer().getPluginManager().registerEvents(new PaintSniper1(this), this);
		this.getServer().getPluginManager().registerEvents(new PaintSniper2(this), this);
		this.getServer().getPluginManager().registerEvents(new PaintSniper3(this), this);
		this.getServer().getPluginManager().registerEvents(new PaintSniper4(this), this);
		this.getServer().getPluginManager().registerEvents(new PaintSniper5(this), this);
		
		//ShotPainters
		
	}
}

	

	





	
