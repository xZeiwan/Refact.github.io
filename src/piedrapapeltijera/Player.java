/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

import java.util.Random;

/**
 * Representa a un jugador en el juego de piedra-papel-tijera.
 * Cada jugador tiene un contador de victorias y puede realizar elecciones aleatorias.
 */
public class Player {

    private int wins;
    private static final Random random = new Random();

    /**
     * Genera una elección aleatoria: "rock", "paper" o "scissors".
     * @return la elección del jugador como String.
     */
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

    /**
     * Incrementa en 1 el número de victorias del jugador.
     */
    public void addWin() {
        wins++; //S1488 solucionado
    }

    /**
     * Devuelve el número actual de victorias del jugador.
     * @return número de victorias acumuladas.
     */
    public int getWins() {
        return wins;
    }
}