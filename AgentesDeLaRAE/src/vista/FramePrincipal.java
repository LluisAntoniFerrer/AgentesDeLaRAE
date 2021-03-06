package vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.misiones.Acentuacion;
import vista.misiones.ExplicacionAcen;
import vista.misiones.ExplicacionGyJ;
import vista.misiones.ExplicacionH;
import vista.misiones.Misiones;
import vista.misiones.Puntuacion;
import vista.misiones.GyJ;
import vista.misiones.Horrores;
import vista.misiones.Imperativo;
import vista.misiones.MisionH;
import vista.misiones.ExplicacionHorrores;
import vista.misiones.ExplicacionImpe;
import vista.misiones.ExplicacionPuntuacion;
import vista.misiones.Final;

public class FramePrincipal extends JFrame {

	//private Inicial inicial;

	private JPanel contenedor,portada, inicial, pregunta1,pregunta2,pregunta3,pregunta4,pregunta5,pregunta6,pregunta7,pregunta8,pregunta9, pregunta10, pregunta11,respuesta;
	private JPanel finale,acentuacion,misiones,explicacionAcen,explicacionGyJ,GyJ,horrores,explicacionHorrores, explicacionImperativo, imperativo, explicacionH, misionH, explicacionPuntuacion, puntuacion;

	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 813, 675);
		 setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/images/agentesLog.png")));
		 this.setTitle("Los agentes de la RAE");
		 
		 /*inicial = new Inicial();
		setContentPane(inicial);*/
		
		contenedor=new JPanel();
		getContentPane().add(contenedor);
		contenedor.setBounds(0, 23, 800, 640);
		contenedor.setLayout(new CardLayout(0, 0));

		portada= new Portada(this);
		inicial= new Inicial(this);
		pregunta1= new Pregunta1(this);
		pregunta2= new Pregunta2(this);
		pregunta3= new Pregunta3(this);
		pregunta4= new Pregunta4(this);
		pregunta5= new Pregunta5(this);
		pregunta6= new Pregunta6(this);
		pregunta7= new Pregunta7(this);
		pregunta8= new Pregunta8(this);
		pregunta9= new Pregunta9(this);
		pregunta10= new Pregunta10(this);
		pregunta11= new Pregunta11(this);
		respuesta= new Respuesta(this);
		acentuacion= new Acentuacion(this);
		misiones = new Misiones(this);
		explicacionAcen= new ExplicacionAcen(this);
		explicacionGyJ= new ExplicacionGyJ(this);
		GyJ= new GyJ(this);
		horrores= new Horrores(this);
		explicacionHorrores= new ExplicacionHorrores(this);
		explicacionImperativo= new ExplicacionImpe(this);
		imperativo= new Imperativo(this);
		misionH= new MisionH(this);
		explicacionH= new ExplicacionH(this);
		puntuacion= new Puntuacion(this);
		explicacionPuntuacion= new ExplicacionPuntuacion(this);
		finale= new Final(this);
		
		

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
		contenedor.add(pregunta11,"pregunta11");
		contenedor.add(respuesta,"respuesta");
		contenedor.add(acentuacion,"acentuacion");
		contenedor.add(misiones,"misiones");
		contenedor.add(explicacionAcen,"explicacionAcen");
		contenedor.add(explicacionGyJ,"explicacionGyJ");
		contenedor.add(GyJ,"GyJ");
		contenedor.add(explicacionHorrores,"explicacionHorrores");
		contenedor.add(horrores,"horrores");
		contenedor.add(explicacionImperativo,"explicacionImperativo");
		contenedor.add(imperativo,"imperativo");
		contenedor.add(explicacionH,"explicacionH");
		contenedor.add(misionH,"misionH");
		contenedor.add(explicacionPuntuacion,"explicacionPuntuacion");
		contenedor.add(puntuacion,"puntuacion");
		contenedor.add(finale,"final");

	}
	public void CambiaFondo(String panel){
		CardLayout c=(CardLayout) contenedor.getLayout();
		c.show(contenedor, panel);
	}
	public void temporizadorAcentuacion(){
		((Acentuacion) acentuacion).comenzar();
	}
	public void temporizadorGyJ(){
		((GyJ) GyJ).comenzar();
	}
	public void temporizadorHorrores(){
		((Horrores) horrores).comenzar();
	}
	public void temporizadorImperativo(){
		((Imperativo) imperativo).comenzar();
	}
	public void temporizadorH(){
		((MisionH) misionH).comenzar();
	}
	public void temporizadorPuntuacion(){
		((Puntuacion) puntuacion).comenzar();
	}
	public void finalizarMision(int puntuacion,String tipoMision){
		
		((Final) finale).finalizar(puntuacion,tipoMision);
		
		if(tipoMision.equals("GyJ")){
			GyJ.revalidate();
			GyJ.repaint();
		}else if(tipoMision.equals("acentuacion")){
			acentuacion=new Acentuacion(this);
		}
	}


}
