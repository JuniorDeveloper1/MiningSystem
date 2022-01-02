package com.juniordeveloper.MiningSystem.achievements;

import com.juniordeveloper.MiningSystem.data.level.LevelingManager;
import com.juniordeveloper.MiningSystem.data.level.XpAmount;
import org.bukkit.entity.Player;

import static com.juniordeveloper.MiningSystem.achievements.Rewards.*;

public class BlockCounter {
    public static void unNamed(Player player) {

        
        levelCheck();
    }

    static void levelCheck() {
        if(LevelingManager.getCurrent_amount() <= XpAmount.getTotalXPRequirdForLevelUp())
            LevelingManager.setLevel(LevelingManager.getLevel()+1);
    }

}
