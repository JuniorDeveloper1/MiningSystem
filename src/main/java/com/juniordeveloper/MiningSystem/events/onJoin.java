package com.juniordeveloper.MiningSystem.events;


import com.juniordeveloper.MiningSystem.data.level.LevelingManager;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if(!player.hasPlayedBefore()) {LevelingManager.firstJoin();}

    }
}
