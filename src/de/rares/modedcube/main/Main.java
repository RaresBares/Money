package de.rares.modedcube.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{


  @Override
  public void onEnable() {
    getCommand("money").setExecutor(new Money());

  }


  @Override
  public void onDisable() {

  }
}
