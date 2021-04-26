package me.burzakrual.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.ScoreboardManager;

public final class Scoreboard extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(this,this);

        if (!Bukkit.getOnlinePlayers().isEmpty()){
            for (Player online : Bukkit.getOnlinePlayers())
                Board(online);
        }
    }

    @Override
    public void onDisable() {


        }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Board(event.getPlayer());
    }
    public void Board(Player player){
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        org.bukkit.scoreboard.Scoreboard board = manager.getNewScoreboard();
        Objective obj = board.registerNewObjective("Test", "dummy", ChatColor.translateAlternateColorCodes('&',"&c&1Test Thingy"));
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score score1 = obj.getScore("-------------------");
        score1.setScore(3);
        Score score2 = obj.getScore("Online Players:"+Bukkit.getOnlinePlayers().size());
        score2.setScore(2);
        player.setScoreboard(board);
    }
}
