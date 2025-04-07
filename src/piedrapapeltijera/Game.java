/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

public class Game {

    private static final String WIN_P1 = "Player 1 Wins";
    private static final String WIN_P2 = "Player 2 Wins";
    private static final String DRAW_MSG = "\n\t\t\t Draw \n";

    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();
        boolean gameWon = false;
        int roundsPlayed = 0;
        int draw = 0;
        String p1Choice;
        String p2Choice;

        do {
            System.out.println("***** Round: " + roundsPlayed + " *****\n");
            System.out.println("Number of Draws: " + draw + "\n");

            p1Choice = p1.playerChoice();
            System.out.println("Player 1: " + p1Choice + "\t Total Wins: " + p1.getWins());

            p2Choice = p2.playerChoice();
            System.out.println("Player 2: " + p2Choice + "\t Total Wins: " + p2.getWins());

            if (p1Choice.equals("rock") && p2Choice.equals("paper")) {
                p2.addWin();
                System.out.println(WIN_P2);
            } else if (p1Choice.equals("paper") && p2Choice.equals("rock")) {
                p1.addWin();
                System.out.println(WIN_P1);
            } else if (p1Choice.equals("rock") && p2Choice.equals("scissors")) {
                p1.addWin();
                System.out.println(WIN_P1);
            } else if (p1Choice.equals("scissors") && p2Choice.equals("rock")) {
                p2.addWin();
                System.out.println(WIN_P2);
            } else if (p1Choice.equals("scissors") && p2Choice.equals("paper")) {
                p1.addWin();
                System.out.println(WIN_P1);
            } else if (p1Choice.equals("paper") && p2Choice.equals("scissors")) {
                p2.addWin();
                System.out.println(WIN_P2);
            } else if (p1Choice.equals(p2Choice)) {
                draw++;
                System.out.println(DRAW_MSG);
            }

            roundsPlayed++;

            if (p1.getWins() >= 3 || p2.getWins() >= 3) {
                gameWon = true;
                System.out.println("GAME WON");
            }

            System.out.println();

        } while (!gameWon);
    }
}