package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Pregunta1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Pregunta1() {
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta1.class.getResource("/images/tablillaPreguntas.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);

	}
}
