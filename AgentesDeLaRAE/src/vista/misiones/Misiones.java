package vista.misiones;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vista.FramePrincipal;
import vista.Inicial;
import java.awt.Font;
import java.awt.Color;

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
		btnacentuacion.setIcon(new ImageIcon(Inicial.class.getResource("/images/misiones/acentuacion.png")));
		btnacentuacion.setBounds(15, 153, 180, 43);
		add(btnacentuacion);
		
		JLabel btnGyJ = new JLabel("");
		btnGyJ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framePrincipal.CambiaFondo("explicacionGyJ");
			}
		});
		btnGyJ.setIcon(new ImageIcon(Inicial.class.getResource("/images/misiones/gyj.png")));
		btnGyJ.setBounds(16, 212, 128, 43);
		add(btnGyJ);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Inicial.class.getResource("/images/misiones/confusion.png")));
		label.setBounds(16, 271, 140, 43);
		add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Inicial.class.getResource("/images/misiones/hache.png")));
		label_1.setBounds(657, 271, 122, 43);
		add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Inicial.class.getResource("/images/misiones/horrores.png")));
		label_2.setBounds(545, 94, 240, 43);
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framePrincipal.CambiaFondo("explicacionHorrores");
			}
		});
		add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Inicial.class.getResource("/images/misiones/imperativo.png")));
		label_3.setBounds(15, 94, 223, 43);
		add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Inicial.class.getResource("/images/misiones/suena.png")));
		label_4.setBounds(633, 153, 146, 43);
		add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Inicial.class.getResource("/images/misiones/puntuacion.png")));
		label_5.setBounds(633, 212, 146, 43);
		add(label_5);
		
		JLabel label_6 = new JLabel("LOS AGENTES");
		label_6.setForeground(Color.DARK_GRAY);
		label_6.setFont(new Font("Forte", Font.BOLD, 40));
		label_6.setBounds(254, 37, 270, 32);
		add(label_6);
		
		JLabel label_7 = new JLabel("DE LA");
		label_7.setForeground(Color.DARK_GRAY);
		label_7.setFont(new Font("Forte", Font.PLAIN, 40));
		label_7.setBounds(320, 101, 117, 32);
		add(label_7);
		
		JLabel label_8 = new JLabel("RAE");
		label_8.setForeground(Color.DARK_GRAY);
		label_8.setFont(new Font("Forte", Font.PLAIN, 70));
		label_8.setBounds(313, 163, 155, 48);
		add(label_8);
		
		
		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Inicial.class.getResource("/images/papiro_agentes.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}
}
