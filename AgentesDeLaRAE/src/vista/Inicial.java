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

public class Inicial extends JPanel {
	
	private JLabel fondo;
	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Inicial(FramePrincipal framePrincipal) {
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel label = new JLabel("2");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label.setBounds(650, 560, 16, 14);
		add(label);
		
		JLabel label_2 = new JLabel("15");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_2.setBounds(494, 411, 25, 14);
		add(label_2);
		
		JLabel label_1 = new JLabel("3");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_1.setBounds(598, 484, 16, 14);
		add(label_1);
		
		JLabel label_3 = new JLabel("9");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Segoe Print", Font.BOLD, 16));
		label_3.setBounds(399, 496, 16, 14);
		add(label_3);
		
		JLabel label_4 = new JLabel("10");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Segoe Print", Font.BOLD, 16));
		label_4.setBounds(364, 469, 25, 14);
		add(label_4);
		
		JLabel label_5 = new JLabel("11");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Segoe Print", Font.BOLD, 16));
		label_5.setBounds(427, 469, 25, 14);
		add(label_5);
		
		JLabel label_6 = new JLabel("13");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Segoe Print", Font.BOLD, 16));
		label_6.setBounds(464, 444, 25, 14);
		add(label_6);
		
		JLabel label_8 = new JLabel("5");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Segoe Print", Font.BOLD, 16));
		label_8.setBounds(359, 525, 16, 14);
		add(label_8);
		
		JLabel label_9 = new JLabel("8");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Segoe Print", Font.BOLD, 16));
		label_9.setBounds(311, 503, 16, 14);
		add(label_9);
		
		JLabel label_10 = new JLabel("12");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Segoe Print", Font.BOLD, 16));
		label_10.setBounds(406, 443, 25, 14);
		add(label_10);
		
		JLabel label_11 = new JLabel("14");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Segoe Print", Font.BOLD, 16));
		label_11.setBounds(444, 419, 25, 14);
		add(label_11);
		
		JLabel label_12 = new JLabel("6");
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Segoe Print", Font.BOLD, 16));
		label_12.setBounds(267, 540, 16, 14);
		add(label_12);
		
		JLabel label_13 = new JLabel("4");
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Segoe Print", Font.BOLD, 16));
		label_13.setBounds(494, 509, 16, 14);
		add(label_13);
		
		JLabel label_14 = new JLabel("7");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Segoe Print", Font.BOLD, 16));
		label_14.setBounds(225, 504, 16, 14);
		add(label_14);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framePrincipal.CambiaFondo("pregunta1");
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Inicial.class.getResource("/images/U1.png")));
		lblNewLabel.setBounds(18, 54, 236, 43);
		add(lblNewLabel);
		
		JLabel lblMisiones = new JLabel("");
		lblMisiones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framePrincipal.CambiaFondo("niveles");
			}
		});
		lblMisiones.setIcon(new ImageIcon(Inicial.class.getResource("/images/misiones.png")));
		lblMisiones.setBounds(309, 153, 132, 43);
		add(lblMisiones);
		
		JLabel label7 = new JLabel("");
		label7.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel60.png")));
		label7.setBounds(626, 540, 60, 87);
		add(label7);
		
		JLabel label2 = new JLabel("");
		label2.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel60.png")));
		label2.setBounds(576, 462, 60, 87);
		add(label2);
		
		JLabel label6 = new JLabel("");
		label6.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel60.png")));
		label6.setBounds(473, 489, 60, 87);
		add(label6);
		
		JLabel label3 = new JLabel("");
		label3.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel45.png")));
		label3.setBounds(344, 511, 45, 65);
		add(label3);
		
		JLabel label4 = new JLabel("");
		label4.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel45.png")));
		label4.setBounds(208, 489, 45, 65);
		add(label4);
		
		JLabel label5 = new JLabel("");
		label5.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel45.png")));
		label5.setBounds(251, 527, 45, 65);
		add(label5);
		
		JLabel label8 = new JLabel("");
		label8.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel26.png")));
		label8.setBounds(364, 466, 25, 36);
		add(label8);
		
		JLabel label9 = new JLabel("");
		label9.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel30.png")));
		label9.setBounds(302, 497, 30, 43);
		add(label9);
		
		JLabel label10 = new JLabel("");
		label10.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel26.png")));
		label10.setBounds(394, 489, 30, 43);
		add(label10);
		
		JLabel label11 = new JLabel("");
		label11.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel26.png")));
		label11.setBounds(427, 462, 30, 43);
		add(label11);
		
		JLabel label12 = new JLabel("");
		label12.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel26.png")));
		label12.setBounds(492, 407, 25, 36);
		add(label12);
		
		JLabel label13 = new JLabel("");
		label13.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel26.png")));
		label13.setBounds(464, 440, 25, 36);
		add(label13);
		
		JLabel label14 = new JLabel("");
		label14.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel26.png")));
		label14.setBounds(406, 440, 25, 36);
		add(label14);
		
		JLabel label15 = new JLabel("");
		label15.setIcon(new ImageIcon(Inicial.class.getResource("/images/cartel26.png")));
		label15.setBounds(444, 415, 25, 36);
		add(label15);
		
		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Inicial.class.getResource("/images/papiro_agentes.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}
}
