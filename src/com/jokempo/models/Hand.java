package com.jokempo.models;

import com.jokempo.enums.HandOptions;

import java.util.Random;


public class Hand {

    private HandOptions option;

    public Hand() {
    }

    public HandOptions getOption() {
        return option;
    }

    public void setOption(HandOptions option) {
        this.option = option;
    }

    public void setRandomOption(){
        Random rand = new Random();
        int x = rand.nextInt(HandOptions.class.getEnumConstants().length);
        this.setOption(HandOptions.class.getEnumConstants()[x]);
    }
}
