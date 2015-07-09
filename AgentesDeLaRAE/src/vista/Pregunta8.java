package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JTextArea;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Pregunta8 extends JPanel {
	private int control=0;
	AdvancedPlayer reproductor = null;
	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta8(FramePrincipal framePrincipal) {
		
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		File sonido = new File("/AgentesDeLaRAE/src/sonidos/sonido.mp3");
		try {
			reproductor = new AdvancedPlayer(new FileInputStream(sonido));
			System.out.println("aa");
		} catch (FileNotFoundException e1) {
		} catch (JavaLayerException e1) {
		}
		
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(control==0){
				control=1;
				button.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/stop1.png")));
				try {
					reproductor.play();
				} catch (JavaLayerException e1) {
				}
				}else{
					control=0;
					button.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/play1.png")));
					reproductor.stop();
				}
			}
		});
		button.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/play1.png")));
		button.setBounds(572, 155, 75, 75);
		add(button);
		
		JLabel lblDictadoClica = new JLabel("7. Dictado. Clica en el bot\u00F3n \"Play\" y copia el texto en el");
		lblDictadoClica.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblDictadoClica.setBounds(92, 118, 586, 26);
		add(lblDictadoClica);
		
		JLabel lblRecuadroDeAbajo = new JLabel(" recuadro de siguiente.");
		lblRecuadroDeAbajo.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblRecuadroDeAbajo.setBounds(112, 146, 586, 26);
		add(lblRecuadroDeAbajo);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Segoe Print", Font.BOLD, 14));
		textArea.setBackground(SystemColor.menu);
		textArea.setBounds(112, 241, 576, 275);
		add(textArea);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrincipal.CambiaFondo("pregunta9");
			}
		});
		btnSiguiente.setBounds(582, 527, 109, 23);
		add(btnSiguiente);
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}
}
