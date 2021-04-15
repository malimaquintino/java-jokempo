package com.jokempo;

import com.jokempo.enums.Hand;
import com.jokempo.models.Player;
import com.jokempo.models.Match;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        int opc = 99;
        while(opc != 0 ){
            System.out.println("");
            System.out.println("Choose one:");
            System.out.println("1 - Rock");
            System.out.println("2 - Paper");
            System.out.println("3 - Scissors");
            System.out.println("0 - Exit");
            opc = sc.nextInt();
            Player p1 = new Player();
            p1.setName(name);
            switch (opc){
                case 0:
                    System.exit(0);
                case 1:
                    p1.setHand(Hand.ROCK);
                    break;
                case 2:
                    p1.setHand(Hand.PAPER);
                    break;
                case 3:
                    p1.setHand(Hand.SCISSORS);
            }

            Player p2 = new Player("BOT", Hand.randomHand());
            Match match = new Match(p1, p2);

            System.out.println(p1.getHand()+" x "+p2.getHand());
            System.out.println("You "+match.winner());
        }
    }
}
