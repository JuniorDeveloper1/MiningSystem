package com.juniordeveloper.MiningSystem.data.level;


import org.bukkit.entity.Player;

import static com.juniordeveloper.MiningSystem.data.level.LevelingManager.*;


public class XpAmount {
    static Player player;
    /**
     * @Link{ https://www.spigotmc.org/threads/level-system.356440/ }
     *
     * TODO: Fix better LEVELING system
     */

   static  int totalXPRequirdForLevelUp;

    public static int  getTotalXPRequirdForLevelUp() {


        if(level >= maxmimum)
            totalXPRequirdForLevelUp = (int) ( getMultiplier() + Math.pow(level, 1.5) + 10*level);

        return totalXPRequirdForLevelUp;
    }
}
