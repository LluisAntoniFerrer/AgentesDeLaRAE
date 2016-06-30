package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Portada extends JPanel {

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Portada(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel fondo = new JLabel("\u00C1REA DE LENGUA CASTELLANA ");
		fondo.setBackground(new Color(51, 153, 204));
		fondo.setHorizontalAlignment(SwingConstants.CENTER);
		fondo.setFont(new Font("Segoe Print", Font.BOLD, 40));
		fondo.setBounds(0, 56, 800, 76);
		add(fondo);
		
		JLabel lblYLiteratura = new JLabel("Y LITERATURA");
		lblYLiteratura.setHorizontalAlignment(SwingConstants.CENTER);
		lblYLiteratura.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblYLiteratura.setBounds(-10, 125, 800, 76);
		add(lblYLiteratura);
		
		JLabel lblAgentesDeLa = new JLabel("Quinto de primaria");
		lblAgentesDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgentesDeLa.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblAgentesDeLa.setBounds(0, 212, 800, 76);
		add(lblAgentesDeLa);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				framePrincipal.CambiaFondo("inicial");
			}
		});
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setIcon(new ImageIcon(Portada.class.getResource("/images/papiro_agentes.png")));
		label.setBounds(0, 0, 800, 640);
		add(label);

	}
}
