package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarcoCentral marco1 = new miMarcoCentral();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setVisible(true);
	}

}

class miMarcoCentral extends JFrame {

	public miMarcoCentral() {

		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		setSize(anchoPantalla / 2, alturaPantalla / 2);
		setLocation(anchoPantalla / 4, alturaPantalla / 4);
		setTitle("Marco Central");
		/*Image miIcono = miPantalla.getImage("icono.gif");
		setIconImage(miIcono);*/
	}
}
