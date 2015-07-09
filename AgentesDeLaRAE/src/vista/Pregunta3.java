package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta3 extends JPanel {

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta3(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel lblcmo = new JLabel("2. \u00BFC\u00F3mo deben de ser las preguntas en una entrevista?");
		lblcmo.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblcmo.setBounds(100, 108, 512, 23);
		add(lblcmo);
		
		JRadioButton rdbtnAbierta = new JRadioButton("Abiertas, dando la posibilidad de una respuesta amplia.");
		rdbtnAbierta.setBackground(Color.WHITE);
		rdbtnAbierta.setFont(new Font("Segoe Print", Font.BOLD, 18));
		rdbtnAbierta.setBounds(125, 159, 540, 23);
		add(rdbtnAbierta);
		
		JRadioButton rdbtnCerrada = new JRadioButton("Cerrada, de manera que contesten s\u00ED o no.");
		rdbtnCerrada.setFont(new Font("Segoe Print", Font.BOLD, 18));
		rdbtnCerrada.setBackground(Color.WHITE);
		rdbtnCerrada.setBounds(125, 206, 415, 23);
		add(rdbtnCerrada);
		
		JButton button = new JButton("Siguiente >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrincipal.CambiaFondo("pregunta4");
			}
		});
		button.setBounds(585, 527, 109, 23);
		add(button);
		JLabel fondo = new JLabel("");
		fondo.setFont(new Font("Segoe Print", Font.BOLD, 18));
		fondo.setIcon(new ImageIcon(Pregunta3.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}
}
