package dev.repliedk.scoreboard.api;

import cn.nukkit.Player;
import dev.repliedk.scoreboard.network.Scoreboard;

public class ScoreboardAPI {

    public static Scoreboard createScoreboard() {
        return new Scoreboard();
    }

    public static void setScoreboard( Player player, Scoreboard scoreboard ) {
        scoreboard.showFor( player );
    }

    public static void removeScorebaord( Player player, Scoreboard scoreboard ){
        scoreboard.hideFor( player );
    }

}
