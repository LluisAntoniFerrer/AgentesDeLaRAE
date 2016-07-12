package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JTextArea;

import controladora.Reproductor;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Pregunta8 extends JPanel {
	private int control=0;
	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta8(FramePrincipal framePrincipal) {
		
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		Reproductor mi_reproductor = new Reproductor();
		  try {
			mi_reproductor.AbrirFichero("src/sonidos/sonido.wav");

		  } catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(control==0){
				control=1;
				button.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/pause.png")));
				try {
					mi_reproductor.Play();
				} catch (Exception ex) {
				  System.out.println("Error: " + ex.getMessage());
				}
				}else if(control==1){
					control=2;
					button.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/play1.png")));
					try {
						mi_reproductor.Pausa();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else if(control==2){
					control=1;
					button.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/pause.png")));
					try {
						mi_reproductor.Continuar();
					} catch (Exception ex) {
					  System.out.println("Error: " + ex.getMessage());
					}
				}
			}
		});
		button.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/play1.png")));
		button.setBounds(489, 155, 75, 75);
		add(button);
		
		JButton buttonStop = new JButton("");
		
		buttonStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				control=0;
				button.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/play1.png")));
				try {
					mi_reproductor.Stop();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonStop.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/stop1.png")));
		buttonStop.setBounds(572, 155, 75, 75);
		add(buttonStop);
		
		JLabel lblDictadoClica = new JLabel("7. Dictado. Clica en el bot\u00F3n \"Play\" y copia el texto en el");
		lblDictadoClica.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblDictadoClica.setBounds(92, 118, 586, 26);
		add(lblDictadoClica);
		
		JLabel lblRecuadroDeAbajo = new JLabel(" recuadro de siguiente.");
		lblRecuadroDeAbajo.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblRecuadroDeAbajo.setBounds(112, 146, 586, 26);
		add(lblRecuadroDeAbajo);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Segoe Print", Font.BOLD, 14));
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(112, 241, 576, 275);
		add(textArea);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control=0;
				button.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/play1.png")));
				try {
					mi_reproductor.Stop();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				framePrincipal.CambiaFondo("pregunta9");
				
			}
		});
		btnSiguiente.setBounds(590, 532, 109, 23);
		add(btnSiguiente);
		
		JButton button_1 = new JButton("<< Atras");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control=0;
				button.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/play1.png")));
				try {
					mi_reproductor.Stop();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				framePrincipal.CambiaFondo("pregunta7");
			}
		});
		button_1.setBounds(100, 532, 109, 23);
		add(button_1);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta8.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}
}
