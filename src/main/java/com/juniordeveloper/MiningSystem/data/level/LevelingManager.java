package com.juniordeveloper.MiningSystem.data.level;

import com.juniordeveloper.MiningSystem.MineMain;

import java.sql.Connection;
import java.sql.SQLException;

public class LevelingManager {

    /**
     * TODO: For usage => Comment will be deleted
     *  - Level will be saved into Database or Config,
     *  - Multiplier will be setted in the CONFIG
     *  - Amount of xp needed, can be discussed.
     *  - Maximum Level will be with Config
     */
    static int level = 0;
    static int multiplier = 0; // Multiplier has to be changed to config.
    static int maxmimum = 150; // Set this in a config.
    static int current_amount = 0;
    XpAmount xpAmount = new XpAmount();


    public static void init() {
       try(Connection c = MineMain.hikariDataSource.getConnection()) {
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }

    public static void firstJoin() {setLevel(1);}

    public static void setCurrent_amount(int current_amount) {LevelingManager.current_amount = current_amount;}

    public static int getCurrent_amount() {return current_amount;}

    public static int getMultiplier() {
        return multiplier;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level) {LevelingManager.level = level;}

    public static int getMaxmimum() {
        return maxmimum;
    }
}
