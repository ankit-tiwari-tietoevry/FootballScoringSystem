package com.company.sports.football;

import java.util.Scanner;

/**
 * This is the main method that used the sports interface and simulates a game using a commandline menu
 * @author Ankit
 *
 */
public class Main {
    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        String[] scoring = null;
        /** Object of type SportInterface */
        SportInterface game = null;
        /** user selection */
        int sel;
        /** user choice */
        int choice;

        String home,away;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Home Team: ");
        home = input.next();
        System.out.println("Enter Away Team: ");
        away = input.next();

        game = new Football(home,away);
        String scorer[] = {"Touchdown","Field Goal", "Extra-Point","Two-Point Conversion","Safety"};
        scoring=scorer;

        while(game.GameStatus()){

            System.out.printf("\n %s - %d   %s - %d", game.getHomeTeam(), game.getHomeScore(),game.getAwayTeam(),game.getAwayScore() );
            System.out.printf("\n Current %s - %d\n", game.getPeriodName(), game.getperiod());

            for(sel=0; sel<scoring.length; sel++){
                System.out.printf("\n %2d. %s %s", sel+1, game.getHomeTeam(), scoring[sel]);
            }

            for(sel=0; sel<scoring.length; sel++){
                System.out.printf("\n %2d. %s %s", sel + ((scoring.length)+1), game.getAwayTeam(), scoring[sel]);
            }
            System.out.printf("\n %2d. End %s \n\n",2*(scoring.length)+1,game.getPeriodName());
            System.out.println("Enter Selection: ");
            choice = input.nextInt();

            if(choice>0 && choice<scoring.length+1){
                game.setHomeScore(choice);
            }
            if(choice>scoring.length && choice<(2*scoring.length)+1){
                game.setAwayScore(choice);
            }

            if(choice == (2*scoring.length)+1){
                game.setperiod();
            }


        }//end while that ends the game

        System.out.println("\n Game is Over");
        System.out.printf("\n %s - %d   %s - %d", game.getHomeTeam(), game.getHomeScore(),game.getAwayTeam(),game.getAwayScore() );
        System.out.printf("\n The Winner is........\n\n\n %s ", game.getWinner());




    }//end main

}
