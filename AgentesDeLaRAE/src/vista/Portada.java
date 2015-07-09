package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Portada extends JPanel {

	/**
	 * Create the panel.
	 */
	public Portada() {
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel fondo = new JLabel("\u00C1REA DE LENGUA CASTELLANA ");
		fondo.setHorizontalAlignment(SwingConstants.CENTER);
		fondo.setFont(new Font("AR HERMANN", Font.PLAIN, 40));
		fondo.setBounds(0, 79, 800, 76);
		add(fondo);
		
		JLabel lblYLiteratura = new JLabel("Y LITERATURA");
		lblYLiteratura.setHorizontalAlignment(SwingConstants.CENTER);
		lblYLiteratura.setFont(new Font("AR HERMANN", Font.PLAIN, 40));
		lblYLiteratura.setBounds(0, 151, 800, 76);
		add(lblYLiteratura);
		
		JLabel lblAgentesDeLa = new JLabel("AGENTES DE");
		lblAgentesDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgentesDeLa.setFont(new Font("AR HERMANN", Font.PLAIN, 90));
		lblAgentesDeLa.setBounds(0, 306, 800, 76);
		add(lblAgentesDeLa);
		
		JLabel lblLaRae = new JLabel("LA RAE");
		lblLaRae.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaRae.setFont(new Font("AR HERMANN", Font.PLAIN, 90));
		lblLaRae.setBounds(0, 393, 800, 76);
		add(lblLaRae);

	}
}
