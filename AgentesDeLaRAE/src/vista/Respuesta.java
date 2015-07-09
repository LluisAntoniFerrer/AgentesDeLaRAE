package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Respuesta extends JPanel {

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Respuesta(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JButton btnCompruebaTusResultados = new JButton("Comprueba tus resultados");
		btnCompruebaTusResultados.setBounds(521, 530, 184, 23);
		add(btnCompruebaTusResultados);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Respuesta.class.getResource("/images/barra.png")));
		label.setBounds(250, 107, 264, 30);
		add(label);
		
		JLabel lblAhoraCompruebaTus = new JLabel("Ahora comprueba");
		lblAhoraCompruebaTus.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblAhoraCompruebaTus.setBounds(437, 211, 161, 14);
		add(lblAhoraCompruebaTus);
		
		JLabel lblBienHecho = new JLabel("\u00A1 Bien hecho!");
		lblBienHecho.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblBienHecho.setBounds(451, 177, 147, 23);
		add(lblBienHecho);
		
		JLabel lblTusResultados = new JLabel("tus resultados...");
		lblTusResultados.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblTusResultados.setBounds(437, 231, 161, 14);
		add(lblTusResultados);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Respuesta.class.getResource("/images/bocadillo_.png")));
		label_2.setBounds(415, 162, 238, 164);
		add(label_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Respuesta.class.getResource("/images/RAE2.jpg")));
		label_1.setBounds(136, 304, 356, 249);
		add(label_1);
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Respuesta.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}

}
