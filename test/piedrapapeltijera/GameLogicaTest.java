package piedrapapeltijera;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de pruebas unitarias para la clase GameLogica.
 * Valida los posibles resultados del juego piedra-papel-tijera.
 */
public class GameLogicaTest {

    /**
     * Comprueba que el resultado es EMPATE cuando ambos jugadores eligen lo mismo.
     */
    @Test
    public void testEmpate() {
        assertEquals(GameLogica.Resultado.EMPATE, GameLogica.determinarGanador("rock", "rock"));
        assertEquals(GameLogica.Resultado.EMPATE, GameLogica.determinarGanador("paper", "paper"));
        assertEquals(GameLogica.Resultado.EMPATE, GameLogica.determinarGanador("scissors", "scissors"));
    }

    /**
     * Comprueba que el jugador 1 gana en las combinaciones correspondientes.
     */
    @Test
    public void testGanaJugador1() {
        assertEquals(GameLogica.Resultado.GANAP1, GameLogica.determinarGanador("rock", "scissors"));
        assertEquals(GameLogica.Resultado.GANAP1, GameLogica.determinarGanador("paper", "rock"));
        assertEquals(GameLogica.Resultado.GANAP1, GameLogica.determinarGanador("scissors", "paper"));
    }

    /**
     * Comprueba que el jugador 2 gana en las combinaciones correspondientes.
     */
    @Test
    public void testGanaJugador2() {
        assertEquals(GameLogica.Resultado.GANAP2, GameLogica.determinarGanador("scissors", "rock"));
        assertEquals(GameLogica.Resultado.GANAP2, GameLogica.determinarGanador("rock", "paper"));
        assertEquals(GameLogica.Resultado.GANAP2, GameLogica.determinarGanador("paper", "scissors"));
    }

    /**
     * Comprueba que al usar entradas no válidas el resultado por defecto es EMPATE.
     */
    @Test
    public void testValoresInvalidos() {
        assertEquals(GameLogica.Resultado.EMPATE, GameLogica.determinarGanador("lizard", "spock"));
    }
}