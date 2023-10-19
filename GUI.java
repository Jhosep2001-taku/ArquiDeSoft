import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

  private JButton btnJugar;
  private JLabel lblTitulo, lblNumero;
  private Juego juego;

  public GUI() { 

    setTitle("Juego de números");
    setSize(400,300);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    lblTitulo = new JLabel("Juego de números aleatorios");
    btnJugar = new JButton("Jugar"); 
    lblNumero = new JLabel("?");

    add(lblTitulo);
    add(btnJugar); 
    add(lblNumero);

    lblTitulo.setBounds(100, 50, 200, 30);
    btnJugar.setBounds(150, 150, 100, 30);
    lblNumero.setBounds(150, 200, 100, 30);

    juego = new Juego();

    btnJugar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int numero = juego.generarNumeroAleatorio();
        lblNumero.setText(String.valueOf(numero));  
      }
    });

  }

  public static void main(String[] args) {
    GUI gui = new GUI();
    gui.setVisible(true);
  }

}