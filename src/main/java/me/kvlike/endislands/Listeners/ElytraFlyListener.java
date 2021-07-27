package me.kvlike.endislands.Listeners;

import org.bukkit.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class ElytraFlyListener implements Listener {

    @EventHandler
    public void onElytra(PlayerMoveEvent e) {
        if (!e.getPlayer().hasPermission("end")) {
            if (e.getPlayer().isGliding() && e.getPlayer().getInventory().getChestplate().getType() == Material.ELYTRA) {
                e.getPlayer().kickPlayer(ChatColor.RED + "Elytra jest zakazana!");
            } else if (e.getPlayer().getWorld().getEnvironment() == World.Environment.THE_END && (e.getPlayer().getLocation().getX() > 800.0 || e.getPlayer().getLocation().getZ() > 800.0 || e.getPlayer().getLocation().getX() < -800.0 || e.getPlayer().getLocation().getZ() < -800.0)) {
                Location spawn = new Location(Bukkit.getWorld("world").getSpawnLocation());
                e.getPlayer().teleport(spawn);
                e.getPlayer().sendMessage(ChatColor.RED + "Wyspy endu sa zakazane!");
            }
        }
    }

}
