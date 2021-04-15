package com.jokempo;

import com.jokempo.enums.HandOptions;
import com.jokempo.models.Hand;
import com.jokempo.models.Match;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opc = 99;
        while(opc != 0 ){
            System.out.println("");
            System.out.println("Choose one:");
            System.out.println("1 - Rock");
            System.out.println("2 - Paper");
            System.out.println("3 - Scissors");
            System.out.println("0 - Exit");
            opc = sc.nextInt();
            Hand p1 = new Hand();
            switch (opc){
                case 0:
                    System.exit(0);
                case 1:
                    p1.setOption(HandOptions.ROCK);
                    break;
                case 2:
                    p1.setOption(HandOptions.PAPER);
                    break;
                case 3:
                    p1.setOption(HandOptions.SCISSORS);
            }

            Hand p2 = new Hand();
            p2.setRandomOption();

            Match match = new Match(p1, p2);

            System.out.println(p1.getOption()+" x "+p2.getOption());
            System.out.println("Winner: "+match.winner());
        }
    }
}
