import java.util.Random;

/**
 * Write a description of class Juego here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Juego {
    protected Random random;

    public Juego() {
        this.random = new Random();
    }

    public int generarNumeroAleatorio() {
        return random.nextInt(37); // 0 a 36
    }
}