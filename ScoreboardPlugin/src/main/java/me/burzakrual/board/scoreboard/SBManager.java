package me.burzakrual.board.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class SBManager {




    public static void setScoreBoard(Player p) {
        ScoreboardManager sbm = Bukkit.getScoreboardManager();
        Scoreboard sb = sbm.getNewScoreboard();
        Objective obj = sb.registerNewObjective("ScoreBoard", "dummy");

        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard-Display-Name").replace("&", "§").replace("%arrowright%", "»").replace("&", "§").replace("%arrowright%", "»").replace("&", "§").replace("%arrowright%", "»"));
        Score score15 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line15").replace("&", "§").replace("%arrowright%", "»"));
        score15.setScore(15);

        Score score14 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line14").replace("&", "§").replace("%arrowright%", "»").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score14.setScore(14);

        Score score13 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line13").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score13.setScore(13);

        Score score12 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line12").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score12.setScore(12);

        Score score11 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line11").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score11.setScore(11);

        Score score10 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line10").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score10.setScore(10);

        /*/Score score9= obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line9").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score9.setScore(9);

        Score score8 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line8").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score8.setScore(8);

        Score score7 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line7").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score7.setScore(7);

        Score score6 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line6").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score6.setScore(6);

        Score score5 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line5").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score5.setScore(5);

        Score score4 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line4").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score4.setScore(4);

        Score score3 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line3").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score3.setScore(3);

        Score score2 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line2").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score2.setScore(2);

        Score score1 = obj.getScore(Main.getScoreBoardAPI().getConfig().getString("ScoreBoard.line1").replace("&", "§").replace("%arrowright%", "»").replace("%player%", p.getDisplayName()));
        score1.setScore(1);

        /*/
        p.setScoreboard(sb);

    }

}
