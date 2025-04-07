/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

import java.util.Random;

public class Player {

    private int wins;
    private static final Random random = new Random();

    public String playerChoice() {
        String choice;
        int c = random.nextInt(3); //S2140 solucionado
        switch(c) {
            case 0:
                choice = "rock";
                break;
            case 1:
                choice = "paper";
                break;
            case 2:
                choice = "scissors";
                break;
            default:
                choice = "rock"; //S131 solucionado
                break;
        }
        return choice;
    }

    public void addWin() {
        wins++; //S1488 solucionado
    }

    public int getWins() {
        return wins;
    }
}
