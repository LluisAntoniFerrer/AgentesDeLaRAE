package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta5 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta5(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel lblEscribeUn = new JLabel("4. Escribe un sin\u00F3nimo para cada una de las palabras.");
		lblEscribeUn.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblEscribeUn.setBounds(100, 108, 512, 23);
		add(lblEscribeUn);
		
		JLabel lblARapido = new JLabel("a) R\u00E1pido");
		lblARapido.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblARapido.setBounds(127, 170, 73, 14);
		add(lblARapido);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(220, 168, 178, 20);
		add(textField);
		
		JLabel lblBSilencioso = new JLabel("b) Silencioso");
		lblBSilencioso.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblBSilencioso.setBounds(127, 241, 93, 14);
		add(lblBSilencioso);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(220, 239, 178, 20);
		add(textField_1);
		
		JLabel lblCOsado = new JLabel("c) Osado");
		lblCOsado.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblCOsado.setBounds(126, 304, 73, 14);
		add(lblCOsado);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(220, 302, 178, 20);
		add(textField_2);
		
		JLabel lblDAmeno = new JLabel("d) Ameno");
		lblDAmeno.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblDAmeno.setBounds(126, 370, 83, 14);
		add(lblDAmeno);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(220, 368, 178, 20);
		add(textField_3);
		
		JLabel lblEPositivo = new JLabel("e) Positivo");
		lblEPositivo.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblEPositivo.setBounds(127, 440, 73, 14);
		add(lblEPositivo);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(220, 438, 178, 20);
		add(textField_4);
		
		JButton button = new JButton("Siguiente >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrincipal.CambiaFondo("pregunta6");
			}
		});
		button.setBounds(590, 532, 109, 23);
		add(button);
		
		JButton button_1 = new JButton("<< Atras");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				framePrincipal.CambiaFondo("pregunta4");
			}
		});
		button_1.setBounds(100, 532, 109, 23);
		add(button_1);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta5.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}

}
