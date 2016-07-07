package vista.misiones;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vista.FramePrincipal;
import vista.Inicial;

public class Niveles extends JPanel {

	private JLabel fondo;

	/**
	 * Create the frame.
	 */
	public Niveles(FramePrincipal framePrincipal) {
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel btnacentuacion = new JLabel("");
		btnacentuacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framePrincipal.CambiaFondo("explicacion");
			}
		});
		btnacentuacion.setIcon(new ImageIcon(Inicial.class.getResource("/images/acentuacion.png")));
		btnacentuacion.setBounds(15, 86, 236, 43);
		add(btnacentuacion);
		
		
		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Inicial.class.getResource("/images/papiro_agentes.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}

}
