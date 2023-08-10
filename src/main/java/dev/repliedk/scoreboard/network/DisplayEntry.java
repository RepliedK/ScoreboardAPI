package dev.repliedk.scoreboard.network;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DisplayEntry {

    /**
     * The api is from the server software GoMint
     */

    private final Scoreboard scoreboard;
    @Getter
    private final long scoreId;

    public void setScore( int score ) {
        this.scoreboard.updateScore( this.scoreId, score );
    }

    public int getScore() {
        return this.scoreboard.getScore( this.scoreId );
    }

}