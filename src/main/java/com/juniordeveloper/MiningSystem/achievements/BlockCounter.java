package com.juniordeveloper.MiningSystem.achievements;

import com.juniordeveloper.MiningSystem.data.level.LevelingManager;
import com.juniordeveloper.MiningSystem.data.level.XpAmount;
import org.bukkit.entity.Player;


public class BlockCounter {
    public static void unNamed(Player player) {

        
        levelCheck();
    }

    static void levelCheck() {
        if(LevelingManager.getCurrent_xpamount() <= XpAmount.getTotalXPRequirdForLevelUp())
            LevelingManager.setLevel(LevelingManager.getLevel()+1);

    }

}
