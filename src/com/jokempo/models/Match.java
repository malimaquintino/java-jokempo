package com.jokempo.models;

import com.jokempo.enums.HandOptions;

public class Match {
    private final Hand player1;
    private final Hand player2;

    public Match(Hand player1, Hand player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public HandOptions winner(){

        if (this.player1.getOption() == HandOptions.PAPER && this.player2.getOption() == HandOptions.ROCK || this.player2.getOption() == HandOptions.PAPER && this.player1.getOption() == HandOptions.ROCK){
            return HandOptions.PAPER;
        }

        if (this.player1.getOption() == HandOptions.SCISSORS && this.player2.getOption() == HandOptions.PAPER || this.player2.getOption() == HandOptions.SCISSORS && this.player1.getOption() == HandOptions.PAPER){
            return HandOptions.SCISSORS;
        }

        if (this.player1.getOption()==HandOptions.ROCK && this.player2.getOption()==HandOptions.SCISSORS || this.player2.getOption()==HandOptions.ROCK && this.player1.getOption()==HandOptions.SCISSORS){
            return HandOptions.ROCK;
        }

        return this.player1.getOption();
    }
}
