package vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class Inicial extends JPanel {
	
	private JLabel fondo;
	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Inicial(FramePrincipal framePrincipal) {
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framePrincipal.CambiaFondo("pregunta1");
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad1.png")));
		lblNewLabel.setBounds(15, 30, 155, 43);
		add(lblNewLabel);
		
		JLabel lblMisiones = new JLabel("");
		lblMisiones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framePrincipal.CambiaFondo("misiones");
			}
		});
		lblMisiones.setIcon(new ImageIcon(Inicial.class.getResource("/images/misiones.png")));
		lblMisiones.setBounds(338, 562, 132, 43);
		add(lblMisiones);
		
		JLabel label7 = new JLabel("");
		label7.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad2.png")));
		label7.setBounds(15, 93, 155, 43);
		add(label7);
		
		JLabel label2 = new JLabel("");
		label2.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad3.png")));
		label2.setBounds(15, 156, 155, 43);
		add(label2);
		
		JLabel label6 = new JLabel("");
		label6.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad4.png")));
		label6.setBounds(15, 219, 155, 43);
		add(label6);
		
		JLabel label3 = new JLabel("");
		label3.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad5.png")));
		label3.setBounds(15, 282, 155, 43);
		add(label3);
		
		JLabel label4 = new JLabel("");
		label4.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad6.png")));
		label4.setBounds(15, 345, 155, 43);
		add(label4);
		
		JLabel label5 = new JLabel("");
		label5.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad7.png")));
		label5.setBounds(15, 408, 155, 43);
		add(label5);
		
		JLabel label8 = new JLabel("");
		label8.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad8.png")));
		label8.setBounds(15, 471, 155, 43);
		add(label8);
		
		JLabel label9 = new JLabel("");
		label9.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad9.png")));
		label9.setBounds(619, 30, 155, 43);
		add(label9);
		
		JLabel label10 = new JLabel("");
		label10.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad10.png")));
		label10.setBounds(608, 93, 166, 43);
		add(label10);
		
		JLabel label11 = new JLabel("");
		label11.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad11.png")));
		label11.setBounds(608, 156, 166, 43);
		add(label11);
		
		JLabel label12 = new JLabel("");
		label12.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad12.png")));
		label12.setBounds(608, 219, 166, 43);
		add(label12);
		
		JLabel label13 = new JLabel("");
		label13.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad13.png")));
		label13.setBounds(608, 282, 166, 43);
		add(label13);
		
		JLabel label14 = new JLabel("");
		label14.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad14.png")));
		label14.setBounds(608, 345, 166, 43);
		add(label14);
		
		JLabel label15 = new JLabel("");
		label15.setIcon(new ImageIcon(Inicial.class.getResource("/images/unidad/unidad15.png")));
		label15.setBounds(608, 408, 166, 43);
		add(label15);
		
		JLabel lblLosAgentes = new JLabel("LOS AGENTES");
		lblLosAgentes.setForeground(Color.DARK_GRAY);
		lblLosAgentes.setFont(new Font("Forte", Font.BOLD, 40));
		lblLosAgentes.setBounds(259, 64, 270, 32);
		add(lblLosAgentes);
		
		JLabel lblDeLa = new JLabel("DE LA");
		lblDeLa.setForeground(Color.DARK_GRAY);
		lblDeLa.setFont(new Font("Forte", Font.PLAIN, 40));
		lblDeLa.setBounds(325, 128, 117, 32);
		add(lblDeLa);
		
		JLabel lblRae = new JLabel("RAE");
		lblRae.setForeground(Color.DARK_GRAY);
		lblRae.setFont(new Font("Forte", Font.PLAIN, 70));
		lblRae.setBounds(318, 190, 155, 48);
		add(lblRae);
		
		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Inicial.class.getResource("/images/papiro_agentes.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}
}
