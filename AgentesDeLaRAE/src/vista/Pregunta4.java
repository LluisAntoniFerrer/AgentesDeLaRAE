package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta4 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta4(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JButton button = new JButton("Siguiente >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrincipal.CambiaFondo("pregunta5");
			}
		});
		button.setBounds(591, 522, 109, 23);
		add(button);
		
		JLabel lblindicaLos = new JLabel("3. Indica los elementos de la comunicaci\u00F3n que intervienen en este comic:");
		lblindicaLos.setFont(new Font("Segoe Print", Font.BOLD, 16));
		lblindicaLos.setBounds(100, 102, 614, 30);
		add(lblindicaLos);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Pregunta4.class.getResource("/images/a.jpg")));
		lblNewLabel.setBounds(401, 78, 313, 480);
		add(lblNewLabel);
		
		JLabel lblAEmisor_1 = new JLabel("a) Emisor");
		lblAEmisor_1.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblAEmisor_1.setBounds(100, 201, 73, 14);
		add(lblAEmisor_1);
		
		textField = new JTextField();
		textField.setBounds(193, 199, 178, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblBReceptor = new JLabel("b) Receptor");
		lblBReceptor.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblBReceptor.setBounds(100, 272, 83, 14);
		add(lblBReceptor);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(193, 270, 178, 20);
		add(textField_1);
		
		JLabel lblCCanal = new JLabel("c) Canal");
		lblCCanal.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblCCanal.setBounds(99, 335, 73, 14);
		add(lblCCanal);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(193, 333, 178, 20);
		add(textField_2);
		
		JLabel lblDMensaje = new JLabel("d) Mensaje");
		lblDMensaje.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblDMensaje.setBounds(99, 401, 83, 14);
		add(lblDMensaje);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(193, 399, 178, 20);
		add(textField_3);
		
		JLabel lblECodig = new JLabel("e) C\u00F3digo");
		lblECodig.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblECodig.setBounds(100, 471, 73, 14);
		add(lblECodig);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(193, 469, 178, 20);
		add(textField_4);
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta4.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}

}
