package com.juniordeveloper.MiningSystem.data.level;

import com.juniordeveloper.MiningSystem.MineMain;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;

public class LevelingManager {

    /**
     * TODO: For usage => Comment will be deleted
     *  - Level will be saved into Database or Config,
     *  - Multiplier will be setted in the CONFIG
     *  - Amount of xp needed, can be discussed.
     *  - Maximum Level will be with Config
     */
    private  static int level = 0;
     private static int multiplier = 0; // Multiplier has to be changed to config.
    private  static int maxmimum = 150; // Set this in a config.
    private static int current_xpamount = 0;
    XpAmount xpAmount = new XpAmount();

    LevelingManager(int level, int current_xpamount) {
        this.level = level;
        this.current_xpamount = current_xpamount;
    }


    public static void init() {
       try(Connection c = MineMain.hikariDataSource.getConnection()) {
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }

    public static void firstJoin() {LevelingManager.setLevel(1);}

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level) {
        LevelingManager.level = level;
    }

    public static int getMultiplier() {
        return multiplier;
    }

    public static void setMultiplier(int multiplier) {
        LevelingManager.multiplier = multiplier;
    }

    public static int getMaxmimum() {
        return maxmimum;
    }

    public static void setMaxmimum(int maxmimum) {
        LevelingManager.maxmimum = maxmimum;
    }

    public static int getCurrent_xpamount() {
        return current_xpamount;
    }

    public static void setCurrent_xpamount(int current_xpamount) {
        LevelingManager.current_xpamount = current_xpamount;
    }

}
