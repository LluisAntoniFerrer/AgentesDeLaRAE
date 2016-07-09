package vista.misiones;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vista.FramePrincipal;
import vista.Inicial;

public class Misiones extends JPanel {

	private JLabel fondo;

	/**
	 * Create the frame.
	 */
	public Misiones(FramePrincipal framePrincipal) {
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel btnacentuacion = new JLabel("");
		btnacentuacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framePrincipal.CambiaFondo("explicacionAcen");
			}
		});
		btnacentuacion.setIcon(new ImageIcon(Inicial.class.getResource("/images/acentuacion.png")));
		btnacentuacion.setBounds(489, 86, 180, 43);
		add(btnacentuacion);
		
		JLabel btnGyJ = new JLabel("");
		btnGyJ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framePrincipal.CambiaFondo("explicacionGyJ");
			}
		});
		btnGyJ.setIcon(new ImageIcon(Inicial.class.getResource("/images/GyJ.png")));
		btnGyJ.setBounds(15, 86, 236, 43);
		add(btnGyJ);
		
		
		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Inicial.class.getResource("/images/papiro_agentes.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}

}
