package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pregunta6 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Pregunta6() {
		setLayout(null);
		setBounds(0,0,800,640);
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta1.class.getResource("/images/tablillaPreguntas.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}

}
