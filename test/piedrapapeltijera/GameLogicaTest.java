package piedrapapeltijera;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameLogicaTest {

    @Test
    public void testEmpate() {
        assertEquals(GameLogica.Resultado.EMPATE, GameLogica.determinarGanador("rock", "rock"));
        assertEquals(GameLogica.Resultado.EMPATE, GameLogica.determinarGanador("paper", "paper"));
        assertEquals(GameLogica.Resultado.EMPATE, GameLogica.determinarGanador("scissors", "scissors"));
    }

    @Test
    public void testGanaJugador1() {
        assertEquals(GameLogica.Resultado.GANAP1, GameLogica.determinarGanador("rock", "scissors"));
        assertEquals(GameLogica.Resultado.GANAP1, GameLogica.determinarGanador("paper", "rock"));
        assertEquals(GameLogica.Resultado.GANAP1, GameLogica.determinarGanador("scissors", "paper"));
    }

    @Test
    public void testGanaJugador2() {
        assertEquals(GameLogica.Resultado.GANAP2, GameLogica.determinarGanador("scissors", "rock"));
        assertEquals(GameLogica.Resultado.GANAP2, GameLogica.determinarGanador("rock", "paper"));
        assertEquals(GameLogica.Resultado.GANAP2, GameLogica.determinarGanador("paper", "scissors"));
    }

    @Test
    public void testValoresInvalidos() {
        assertEquals(GameLogica.Resultado.EMPATE, GameLogica.determinarGanador("lizard", "spock"));
    }
}