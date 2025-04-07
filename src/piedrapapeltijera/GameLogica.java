package piedrapapeltijera;

/**
 * Contiene la lógica del juego piedra-papel-tijera.
 * Permite determinar el resultado de una ronda entre dos jugadores.
 */
public class GameLogica {

    /**
     * Enumeración que representa los posibles resultados de una ronda.
     */
    public enum Resultado {
        GANAP1,
        GANAP2,
        EMPATE
    }

    /**
     * Determina el resultado de una ronda de juego, comparando las elecciones de los jugadores.
     * @param p1 Elección del jugador 1 ("rock", "paper" o "scissors").
     * @param p2 Elección del jugador 2 ("rock", "paper" o "scissors").
     * @return el resultado de la ronda (GANAP1, GANAP2 o EMPATE).
     */
    public static Resultado determinarGanador(String p1, String p2) {
        if (p1.equals(p2)) {
            return Resultado.EMPATE;
        }

        switch (p1) {
            case "rock":
                return p2.equals("scissors") ? Resultado.GANAP1 : Resultado.GANAP2;
            case "paper":
                return p2.equals("rock") ? Resultado.GANAP1 : Resultado.GANAP2;
            case "scissors":
                return p2.equals("paper") ? Resultado.GANAP1 : Resultado.GANAP2;
            default:
                return Resultado.EMPATE;
        }
    }
}