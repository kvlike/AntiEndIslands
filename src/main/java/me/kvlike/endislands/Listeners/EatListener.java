package me.kvlike.endislands.Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class EatListener implements Listener {

    @EventHandler
    public void onEat(PlayerItemConsumeEvent e){
        if(e.getItem().getType() == Material.CHORUS_FRUIT){
            e.setCancelled(true);
        }
    }

}
