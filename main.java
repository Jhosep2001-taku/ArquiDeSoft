public class main {

  public static void main(String[] args) {
    
    // Crear un objeto de la clase Juego
    Juego juego = new Juego();

    // Llamar al método generarNumeroAleatorio
    int numero = juego.generarNumeroAleatorio(); 

    // Mostrar el número generado
    System.out.println("Número aleatorio: " + numero);

  }

}