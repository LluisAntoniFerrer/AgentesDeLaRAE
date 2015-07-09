package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta6 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta6(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel lblAhoraEscribe = new JLabel("5. Ahora escribe un ant\u00F3nimo.");
		lblAhoraEscribe.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblAhoraEscribe.setBounds(103, 107, 512, 23);
		add(lblAhoraEscribe);
		
		JLabel label_1 = new JLabel("a) R\u00E1pido");
		label_1.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_1.setBounds(130, 169, 73, 14);
		add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(223, 167, 178, 20);
		add(textField);
		
		JLabel label_2 = new JLabel("b) Silencioso");
		label_2.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_2.setBounds(130, 240, 93, 14);
		add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(223, 238, 178, 20);
		add(textField_1);
		
		JLabel label_3 = new JLabel("c) Osado");
		label_3.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_3.setBounds(129, 303, 73, 14);
		add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(223, 301, 178, 20);
		add(textField_2);
		
		JLabel label_4 = new JLabel("d) Ameno");
		label_4.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_4.setBounds(129, 369, 83, 14);
		add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(223, 367, 178, 20);
		add(textField_3);
		
		JLabel label_5 = new JLabel("e) Positivo");
		label_5.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_5.setBounds(130, 439, 73, 14);
		add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(223, 437, 178, 20);
		add(textField_4);
		
		JButton button = new JButton("Siguiente >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrincipal.CambiaFondo("pregunta7");
			}
		});
		button.setBounds(591, 526, 109, 23);
		add(button);
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta6.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}

}
