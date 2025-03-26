/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

/**
 *
 * @author jmsa
 */
/**
 *
 */
class Player
{
    int wins;      // # of wins
    int winTotal;
    /**
     * Randomly choose rock, paper, or scissors
     */
    public String playerChoice()
    {
        String choice = "";
        int c = (int)(Math.random()*3);
        switch(c) {
            case 0:
                choice = ("rock");
                break;
            case 1:
                choice = ("paper");
                break;
            case 2:
                choice = ("scissors");
                break;
        }
        return choice;
    }
    public int setWins() 
    {
        int winTotal = wins++;
        return winTotal;
    }
    public int getWins() 
    {
        return(wins);
    }
}
