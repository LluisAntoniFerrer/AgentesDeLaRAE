package vista.misiones;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;

import vista.FramePrincipal;

import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class Final extends JPanel {

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public JLabel lblPunt;
	public String mision;
	public Final(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JButton btnMenu = new JButton("Menu Principal");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrincipal.CambiaFondo("inicial");
			}
		});
		btnMenu.setBounds(511, 524, 194, 29);
		add(btnMenu);
		
		JButton btnReiniciarNivel = new JButton("¿Empezar de nuevo?");
		btnReiniciarNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				framePrincipal.CambiaFondo(mision);
				
				if(mision.equals("GyJ")){
					framePrincipal.temporizadorGyJ();
				}else if(mision.equals("acentuacion")){
					framePrincipal.temporizadorAcentuacion();
				}
				
			}
		});
		btnReiniciarNivel.setBounds(511, 479, 194, 29);
		add(btnReiniciarNivel);
		
		JLabel lblBienHecho = new JLabel("\u00A1Muy bien!");
		lblBienHecho.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblBienHecho.setBounds(180, 135, 92, 23);
		add(lblBienHecho);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Final.class.getResource("/images/bocadillo160x150.png")));
		label.setBounds(329, 153, 200, 200);
		add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Final.class.getResource("/images/agentes.png")));
		label_1.setBounds(91, 304, 356, 249);
		add(label_1);
		
		JLabel lblPuntos = new JLabel("puntos");
		lblPuntos.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblPuntos.setBounds(196, 205, 65, 23);
		add(lblPuntos);
		
		 lblPunt = new JLabel("");
		 lblPunt.setHorizontalAlignment(SwingConstants.CENTER);
		lblPunt.setFont(new Font("Segoe Print", Font.BOLD, 32));
		lblPunt.setBounds(151, 174, 142, 29);
		add(lblPunt);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Final.class.getResource("/images/bocadillo.png")));
		label_2.setBounds(73, 110, 290, 175);
		add(label_2);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Final.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}

	public void finalizar(int puntuacion, String tipoMision) {
		lblPunt.setText(String.valueOf(puntuacion));
		mision=tipoMision;
		
	}
}
