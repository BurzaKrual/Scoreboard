package me.burzakrual.board.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main m;

    public void onEnable() {
        m = this;
        Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
        Bukkit.getPluginManager().registerEvents(new QuitListener(), this);
        getConfig().options().copyDefaults(true);
        saveConfig();

    }


    public static Main getScoreBoardAPI() {

        return m;
    }
}

