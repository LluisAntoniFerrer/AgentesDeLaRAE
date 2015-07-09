package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JTextField;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta2 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta2(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		textField = new JTextField();
		textField.setBounds(100, 169, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 249, 86, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 326, 86, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100, 398, 86, 20);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(100, 478, 86, 20);
		add(textField_4);
		
		JLabel lblNewLabel = new JLabel("Ha habido un accidente de tr\u00E1fico.");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel.setBounds(100, 200, 280, 14);
		add(lblNewLabel);
		
		JLabel lblHaSuccedido = new JLabel("ha sucedido?");
		lblHaSuccedido.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblHaSuccedido.setBounds(196, 172, 108, 14);
		add(lblHaSuccedido);
		
		JLabel lblElAccidentyeHa = new JLabel("El Accidente ha tenido lugar en la rotonda de la Torre de Alaqu\u00E1s.");
		lblElAccidentyeHa.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblElAccidentyeHa.setBounds(100, 276, 489, 14);
		add(lblElAccidentyeHa);
		
		JLabel lblLaHoraExacta = new JLabel("La hora exacta fue a las 3 am de la madrugada.");
		lblLaHoraExacta.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblLaHoraExacta.setBounds(100, 351, 352, 14);
		add(lblLaHoraExacta);
		
		JLabel lblUnoDeLos = new JLabel("Uno de los coche transitaba en sentido contrario.");
		lblUnoDeLos.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblUnoDeLos.setBounds(100, 429, 379, 14);
		add(lblUnoDeLos);
		
		JLabel lblUnoDeLos_1 = new JLabel("Uno de los conductores afirma que el otro conductor iba ebrio.");
		lblUnoDeLos_1.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblUnoDeLos_1.setBounds(100, 509, 451, 14);
		add(lblUnoDeLos_1);
		
		JLabel lblHaSucedido = new JLabel("ha sucedido?");
		lblHaSucedido.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblHaSucedido.setBounds(196, 252, 108, 14);
		add(lblHaSucedido);
		
		JLabel lblHaSucedido_1 = new JLabel("ha sucedido?");
		lblHaSucedido_1.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblHaSucedido_1.setBounds(196, 329, 108, 14);
		add(lblHaSucedido_1);
		
		JLabel lblHaSucedido_2 = new JLabel("ha sucedido?");
		lblHaSucedido_2.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblHaSucedido_2.setBounds(196, 401, 108, 14);
		add(lblHaSucedido_2);
		
		JLabel lblHaSucedido_3 = new JLabel("ha sucedido?");
		lblHaSucedido_3.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblHaSucedido_3.setBounds(196, 481, 108, 14);
		add(lblHaSucedido_3);
		
		JLabel lblNewLabel_1 = new JLabel("1. \u00BFQu\u00E9 deber\u00EDas preguntar?");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblNewLabel_1.setBounds(100, 108, 308, 26);
		add(lblNewLabel_1);
		
		JButton button = new JButton("Siguiente >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrincipal.CambiaFondo("pregunta3");
			}
		});
		button.setBounds(590, 532, 109, 23);
		add(button);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta2.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
		
	}
}
