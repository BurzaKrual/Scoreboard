package me.burzakrual.board.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        SBManager.setScoreBoard(p);
        for(Player all : Bukkit.getOnlinePlayers()) {
            SBManager.setScoreBoard(all);
        }
    }

}
