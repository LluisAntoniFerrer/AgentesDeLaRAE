package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta10 extends JPanel {

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta10(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel lblImaginaQue = new JLabel("9. Imagina que eres el due\u00F1o de una importante empresa de");
		lblImaginaQue.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblImaginaQue.setBounds(99, 99, 586, 26);
		add(lblImaginaQue);
		
		JLabel lblJuguetesYVas = new JLabel(" juguetes y vas a contratar algunos trabajadores.");
		lblJuguetesYVas.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblJuguetesYVas.setBounds(119, 127, 586, 26);
		add(lblJuguetesYVas);
		
		JLabel lblquLePreguntaras = new JLabel("\u00BFQu\u00E9 le preguntar\u00EDas?");
		lblquLePreguntaras.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblquLePreguntaras.setBounds(119, 156, 586, 26);
		add(lblquLePreguntaras);
		
		JButton button = new JButton("Siguiente >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrincipal.CambiaFondo("pregunta11");
			}
		});
		button.setBounds(590, 532, 109, 23);
		add(button);
		
		JButton button_1 = new JButton("<< Atras");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				framePrincipal.CambiaFondo("pregunta9");
			}
		});
		button_1.setBounds(100, 532, 109, 23);
		add(button_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.scrollbar);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(119, 204, 551, 320);
		add(textArea);
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta10.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}

}
