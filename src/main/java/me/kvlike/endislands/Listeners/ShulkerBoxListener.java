package me.kvlike.endislands.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Locale;

public class ShulkerBoxListener implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent e){
        if(e.hasBlock()) {
            if (e.getClickedBlock().getType().toString().toLowerCase(Locale.ROOT).contains("shulker_box") && (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR)) {
                e.setCancelled(true);
            }
        }
    }

}
