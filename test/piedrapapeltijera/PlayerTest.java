package piedrapapeltijera;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testAddWin() {
        Player player = new Player();
        int winsAntes = player.getWins();
        player.addWin();
        assertEquals(winsAntes + 1, player.getWins());
    }

    @Test
    public void testGetWinsInicial() {
        Player player = new Player();
        assertEquals(0, player.getWins());
    }

    @Test
    public void testPlayerChoiceValida() {
        Player player = new Player();
        String choice = player.playerChoice();
        assertTrue(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"));
    }
}