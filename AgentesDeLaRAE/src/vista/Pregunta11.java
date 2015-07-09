package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta11 extends JPanel {

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta11(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel lblImaginaQue = new JLabel("10.  Autoeval\u00FAate. Indica si has entendido los contenidos de ");
		lblImaginaQue.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblImaginaQue.setBounds(99, 99, 586, 26);
		add(lblImaginaQue);
		
		JLabel lblJuguetesYVas = new JLabel("esta unidad marcando mal, regular, bien o muy bien.");
		lblJuguetesYVas.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblJuguetesYVas.setBounds(119, 127, 586, 26);
		add(lblJuguetesYVas);
		
		JButton button = new JButton("Siguiente >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrincipal.CambiaFondo("respuesta");
			}
		});
		button.setBounds(596, 530, 109, 23);
		add(button);
		
		JLabel lblElaborarUnaEntrevista = new JLabel("Elaborar una entrevista.");
		lblElaborarUnaEntrevista.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblElaborarUnaEntrevista.setBounds(119, 242, 207, 14);
		add(lblElaborarUnaEntrevista);
		
		JLabel lblRegular = new JLabel("Regular");
		lblRegular.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblRegular.setBounds(404, 196, 68, 26);
		add(lblRegular);
		
		JLabel lblBien = new JLabel("Bien");
		lblBien.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblBien.setBounds(482, 202, 52, 14);
		add(lblBien);
		
		JLabel lblMuyBien = new JLabel("Muy bien");
		lblMuyBien.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblMuyBien.setBounds(544, 202, 68, 14);
		add(lblMuyBien);
		
		JLabel lblMal = new JLabel("Mal");
		lblMal.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblMal.setBounds(353, 202, 41, 14);
		add(lblMal);
		
		JTextArea txtrUtilizarPalabrasSinnimas = new JTextArea();
		txtrUtilizarPalabrasSinnimas.setFont(new Font("Segoe Print", Font.BOLD, 14));
		txtrUtilizarPalabrasSinnimas.setWrapStyleWord(true);
		txtrUtilizarPalabrasSinnimas.setLineWrap(true);
		txtrUtilizarPalabrasSinnimas.setText("Utilizar palabras sin\u00F3nimas y ant\u00F3nimas");
		txtrUtilizarPalabrasSinnimas.setBounds(119, 280, 194, 56);
		add(txtrUtilizarPalabrasSinnimas);
		
		JTextArea txtrReconocerPalabrasAgudas = new JTextArea();
		txtrReconocerPalabrasAgudas.setWrapStyleWord(true);
		txtrReconocerPalabrasAgudas.setText("Reconocer palabras agudas, llanas y esdr\u00FAjulas");
		txtrReconocerPalabrasAgudas.setLineWrap(true);
		txtrReconocerPalabrasAgudas.setFont(new Font("Segoe Print", Font.BOLD, 14));
		txtrReconocerPalabrasAgudas.setBounds(119, 356, 194, 56);
		add(txtrReconocerPalabrasAgudas);
		
		JTextArea txtrDistinguirLosDiferentes = new JTextArea();
		txtrDistinguirLosDiferentes.setWrapStyleWord(true);
		txtrDistinguirLosDiferentes.setText("Distinguir los diferentes elementos que intervienen en el acto comunicativo");
		txtrDistinguirLosDiferentes.setLineWrap(true);
		txtrDistinguirLosDiferentes.setFont(new Font("Segoe Print", Font.BOLD, 14));
		txtrDistinguirLosDiferentes.setBounds(119, 435, 194, 75);
		add(txtrDistinguirLosDiferentes);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBackground(Color.WHITE);
		radioButton.setBounds(353, 239, 21, 23);
		add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setBounds(420, 239, 21, 23);
		add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBackground(Color.WHITE);
		radioButton_2.setBounds(482, 239, 21, 23);
		add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setBackground(Color.WHITE);
		radioButton_3.setBounds(566, 239, 21, 23);
		add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("");
		radioButton_4.setBackground(Color.WHITE);
		radioButton_4.setBounds(353, 285, 21, 23);
		add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("");
		radioButton_5.setBackground(Color.WHITE);
		radioButton_5.setBounds(420, 285, 21, 23);
		add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("");
		radioButton_6.setBackground(Color.WHITE);
		radioButton_6.setBounds(482, 285, 21, 23);
		add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("");
		radioButton_7.setBackground(Color.WHITE);
		radioButton_7.setBounds(566, 285, 21, 23);
		add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("");
		radioButton_8.setBackground(Color.WHITE);
		radioButton_8.setBounds(353, 361, 21, 23);
		add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("");
		radioButton_9.setBackground(Color.WHITE);
		radioButton_9.setBounds(420, 361, 21, 23);
		add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("");
		radioButton_10.setBackground(Color.WHITE);
		radioButton_10.setBounds(482, 361, 21, 23);
		add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("");
		radioButton_11.setBackground(Color.WHITE);
		radioButton_11.setBounds(566, 361, 21, 23);
		add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("");
		radioButton_12.setBackground(Color.WHITE);
		radioButton_12.setBounds(353, 466, 21, 23);
		add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("");
		radioButton_13.setBackground(Color.WHITE);
		radioButton_13.setBounds(420, 466, 21, 23);
		add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("");
		radioButton_14.setBackground(Color.WHITE);
		radioButton_14.setBounds(482, 466, 21, 23);
		add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("");
		radioButton_15.setBackground(Color.WHITE);
		radioButton_15.setBounds(566, 466, 21, 23);
		add(radioButton_15);
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta11.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}

}
