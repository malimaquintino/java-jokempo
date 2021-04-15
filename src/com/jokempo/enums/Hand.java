package com.jokempo.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum Hand {
    ROCK,
    PAPER,
    SCISSORS;

    private static final Map<Hand, Hand> WIN = new HashMap<>();

    static {
        WIN.put(PAPER, ROCK);
        WIN.put(SCISSORS, PAPER);
        WIN.put(ROCK, SCISSORS);
    }

    public static Hand randomHand(){
        return values()[Math.abs(new Random().ints().findFirst().getAsInt()%3)];
    }

    public boolean win(Hand foe) {
        return WIN.get(this) == foe;
    }
}
