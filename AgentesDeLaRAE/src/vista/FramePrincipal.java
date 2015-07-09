package vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FramePrincipal extends JFrame {

	//private Inicial inicial;
	private JPanel contenedor,portada, inicial, pregunta1,pregunta2,pregunta3,pregunta4,pregunta5,pregunta6,pregunta7,pregunta8,pregunta9, pregunta10;

	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 813, 675);
		
		/*inicial = new Inicial();
		setContentPane(inicial);*/
		
		contenedor=new JPanel();
		getContentPane().add(contenedor);
		contenedor.setBounds(0, 23, 800, 640);
		contenedor.setLayout(new CardLayout(0, 0));
		portada= new Portada();
		inicial= new Inicial();
		pregunta1= new Pregunta1();
		pregunta2= new Pregunta2();
		pregunta3= new Pregunta3();
		pregunta4= new Pregunta4();
		pregunta5= new Pregunta5();
		pregunta6= new Pregunta6();
		pregunta7= new Pregunta7();
		pregunta8= new Pregunta8();
		pregunta9= new Pregunta9();
		pregunta10= new Pregunta10();
		contenedor.add(portada, "portada");
		contenedor.add(inicial, "inicial");
		contenedor.add(pregunta1,"pregunta1");
		contenedor.add(pregunta2,"pregunta2");
		contenedor.add(pregunta3,"pregunta3");
		contenedor.add(pregunta4,"pregunta4");
		contenedor.add(pregunta5,"pregunta5");
		contenedor.add(pregunta6,"pregunta6");
		contenedor.add(pregunta7,"pregunta7");
		contenedor.add(pregunta8,"pregunta8");
		contenedor.add(pregunta9,"pregunta9");
		contenedor.add(pregunta10,"pregunta10");
		
	}

}
