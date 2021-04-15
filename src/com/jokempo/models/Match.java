package com.jokempo.models;

import com.jokempo.enums.MatchResult;

public class Match {
    private final Player player1;
    private final Player player2;

    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public MatchResult winner(){
        if (player1.getHand().win(player2.getHand())){
            return MatchResult.WINNER;
        }

        if (player2.getHand().win(player1.getHand())){
            return MatchResult.LOSER;
        }

        return MatchResult.DRAW;
    }
}
