import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class PantallaCargandoMain {

  PantallaCargando screen;

  public PantallaCargandoMain() {
    inicioPantalla();
	screen.velocidadDeCarga();
	  }

  private void inicioPantalla() {
    ImageIcon myImage = new ImageIcon(PantallaCargandoMain.class.getResource("/imagen/1.jpg"));
    screen = new PantallaCargando(myImage);
    screen.setSize(720, 400);
    screen.setLocationRelativeTo(null);
    screen.setProgresoMax(1000);
    screen.setVisible(true);
  }

  public static void main(String[] args)
  {
    new PantallaCargandoMain();
  }
}