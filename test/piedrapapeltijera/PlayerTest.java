package piedrapapeltijera;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de pruebas unitarias para la clase Player.
 * Verifica el comportamiento del contador de victorias y las elecciones aleatorias.
 */
public class PlayerTest {

    /**
     * Comprueba que al añadir una victoria, el contador incrementa correctamente.
     */
    @Test
    public void testAddWin() {
        Player player = new Player();
        int winsAntes = player.getWins();
        player.addWin();
        assertEquals(winsAntes + 1, player.getWins());
    }

    /**
     * Verifica que un jugador recién creado tiene 0 victorias.
     */
    @Test
    public void testGetWinsInicial() {
        Player player = new Player();
        assertEquals(0, player.getWins());
    }

    /**
     * Comprueba que playerChoice() devuelve una de las tres opciones válidas.
     */
    @Test
    public void testPlayerChoiceValida() {
        Player player = new Player();
        String choice = player.playerChoice();
        assertTrue(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"));
    }
}