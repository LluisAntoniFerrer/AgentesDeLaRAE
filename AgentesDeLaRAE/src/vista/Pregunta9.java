package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta9 extends JPanel {

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta9(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel lblRepasoAcumulativo = new JLabel("8. Han desaparecido todas las may\u00FAsculas del texto c\u00F3pialo  ");
		lblRepasoAcumulativo.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblRepasoAcumulativo.setBounds(100, 111, 586, 26);
		add(lblRepasoAcumulativo);
		
		JLabel lblDelTextoCpialo = new JLabel("de nuevo y escribe may\u00FAscula donde corresponda.");
		lblDelTextoCpialo.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblDelTextoCpialo.setBounds(124, 141, 477, 26);
		add(lblDelTextoCpialo);
		
		JTextArea txtrGranadaDe = new JTextArea();
		txtrGranadaDe.setEditable(false);
		txtrGranadaDe.setLineWrap(true);
		txtrGranadaDe.setWrapStyleWord(true);
		txtrGranadaDe.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		txtrGranadaDe.setText("granada, 27 de diciembre de 2.004. \r\n\r\nqueridos padres: \r\nno os pod\u00E9is imaginar lo bonito que es esto. estoy pasando unos d\u00EDas maravillosos. yo nunca hab\u00EDa visto un paisaje nevado como aqu\u00ED en sierra nevada. mis monitores, claudio y laura, nos est\u00E1n ense\u00F1ando a esquiar. es muy divertido, aunque a veces nos caemos. por fortuna, ni mis compa\u00F1eros ni yo nos hemos hecho da\u00F1o. pasado ma\u00F1ana regreso y volver\u00E9 a veros. \r\n\r\nmuchos besos.\r\nvuestro hijo:\r\n\r\njos\u00E9 manuel.");
		txtrGranadaDe.setBounds(100, 178, 270, 347);
		add(txtrGranadaDe);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		textArea_1.setBounds(397, 178, 277, 347);
		add(textArea_1);
		
		JButton button = new JButton("Siguiente >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrincipal.CambiaFondo("pregunta10");
			}
		});
		button.setBounds(590, 532, 109, 23);
		add(button);
		
		JButton button_1 = new JButton("<< Atras");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				framePrincipal.CambiaFondo("pregunta8");
			}
		});
		button_1.setBounds(100, 532, 109, 23);
		add(button_1);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta9.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}

}
