package piedrapapeltijera;

public class GameLogica {

    public enum Resultado {
        GANAP1,
        GANAP2,
        EMPATE
    }
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