
/**
 * Write a description of class Jugador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Jugador extends Juego {
    private int saldo;
    private int partidasJugadas;
    private int partidasGanadas;

    public Jugador(int saldoInicial) {
        this.saldo = saldoInicial;
        this.partidasJugadas = 0;
        this.partidasGanadas = 0;
    }

    public int getSaldo() {
        return saldo;
    }

    public void restarSaldo(int cantidad) {
        saldo -= cantidad;
    }

    public void sumarSaldo(int cantidad) {
        saldo += cantidad;
    }

    public void incrementarPartidasJugadas() {
        partidasJugadas++;
    }

    public void incrementarPartidasGanadas() {
        partidasGanadas++;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }
}