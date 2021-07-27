package me.kvlike.endislands;

import me.kvlike.endislands.Listeners.EatListener;
import me.kvlike.endislands.Listeners.ElytraFlyListener;
import me.kvlike.endislands.Listeners.ShulkerBoxListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Endislands extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new EatListener(), this);
        getServer().getPluginManager().registerEvents(new ElytraFlyListener(), this);
        getServer().getPluginManager().registerEvents(new ShulkerBoxListener(), this);

    }

}
