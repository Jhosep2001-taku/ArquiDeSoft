import java.util.Random;

/**
 * Write a description of class Ruleta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Ruleta extends Juego {
    private int partidasTotales;
    private int partidasGanadas;

    public Ruleta() {
        this.partidasTotales = 0;
        this.partidasGanadas = 0;
    }

    public int girar() {
        return generarNumeroAleatorio();
    }

    public void registrarPartida(boolean ganada) {
        partidasTotales++;
        if (ganada) {
            partidasGanadas++;
        }
    }

    public int getPartidasTotales() {
        return partidasTotales;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }
}