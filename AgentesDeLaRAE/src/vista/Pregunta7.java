package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta7 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta7(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel lblIndicaEn = new JLabel("6. Indica en cada espacio si la palabra es aguda, llana o esdr\u00FAjula.");
		lblIndicaEn.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblIndicaEn.setBounds(93, 106, 605, 26);
		add(lblIndicaEn);
		
		JTextArea txtrNacConUn = new JTextArea();
		txtrNacConUn.setEditable(false);
		txtrNacConUn.setFont(new Font("Segoe Print", Font.BOLD, 14));
		txtrNacConUn.setText("Nac\u00ED con un l\u00E1piz(1) entre las manos y en seguida empec\u00E9 a garabatear(2) \r\nl\u00EDneas que se convirtieron en magn\u00EDficas(3) letras. Esto no es cierto, por \r\nsupuesto, pero me gusta contar(4) que fue as\u00ED, y de eso va esto de escribir, \r\ncontar lo que te d\u00E9 la gana, porque te gusta o porque te apetece(5). No \r\nfue tan pronto como imagino, pero desde muy peque\u00F1o disfrut\u00E9 del \r\nc\u00F3digo(6) escrito y el ser escritor(7) y publicar un libro era m\u00E1s que un \r\nsue\u00F1o, una quimera(8) irreal e irrealizable. El mundo cambia y las \r\nperspectivas tambi\u00E9n, y llegu\u00E9 a la conclusi\u00F3n de que si quieres conseguir \r\nalgo, debes empezar por intentarlo.");
		txtrNacConUn.setBounds(108, 155, 571, 238);
		add(txtrNacConUn);
		
		JLabel label = new JLabel("1.");
		label.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label.setBounds(178, 411, 32, 14);
		add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(208, 409, 128, 20);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(208, 437, 128, 20);
		add(textField_1);
		
		JLabel label_1 = new JLabel("2.");
		label_1.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_1.setBounds(178, 439, 32, 14);
		add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(208, 468, 128, 20);
		add(textField_2);
		
		JLabel label_2 = new JLabel("3.");
		label_2.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_2.setBounds(178, 470, 32, 14);
		add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(208, 499, 128, 20);
		add(textField_3);
		
		JLabel label_3 = new JLabel("4.");
		label_3.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_3.setBounds(178, 501, 32, 14);
		add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(452, 409, 128, 20);
		add(textField_4);
		
		JLabel label_4 = new JLabel("5.");
		label_4.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_4.setBounds(422, 411, 32, 14);
		add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(452, 435, 128, 20);
		add(textField_5);
		
		JLabel label_5 = new JLabel("6.");
		label_5.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_5.setBounds(422, 437, 32, 14);
		add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(452, 466, 128, 20);
		add(textField_6);
		
		JLabel label_6 = new JLabel("7.");
		label_6.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_6.setBounds(422, 468, 32, 14);
		add(label_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(452, 497, 128, 20);
		add(textField_7);
		
		JLabel label_7 = new JLabel("8.");
		label_7.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label_7.setBounds(422, 499, 32, 14);
		add(label_7);
		
		JButton button = new JButton("Siguiente >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrincipal.CambiaFondo("pregunta8");
			}
		});
		button.setBounds(590, 532, 109, 23);
		add(button);
		
		JButton button_1 = new JButton("<< Atras");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				framePrincipal.CambiaFondo("pregunta6");
			}
		});
		button_1.setBounds(100, 532, 109, 23);
		add(button_1);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta7.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}
}
