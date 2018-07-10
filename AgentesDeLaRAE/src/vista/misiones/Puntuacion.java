package vista.misiones;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import vista.FramePrincipal;
import vista.Respuesta;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import javax.swing.SwingConstants;

public class Puntuacion extends JPanel {
	private JLabel timeLabel;
	JLabel lblPunt;

	//propiedades de las fotos
	
	String[] frase=new String[]{"Solicitamos ayuda a Pedro","Se lamenta de  que la fiesta haya terminado.","Sandra no viene","Una coma salva vidas","Juan se entera de que Pérez está de vacaciones","Que sea pausa","Cuando tengo más dinero","Solo lo socuciona él","Sandra se entera de que Luis no viene"};
	String[] solucio1=new String[]{"¿Nos ayudas con estos ejercicios, Pedro?","El festejo terminó desdichadamente.","Luis no viene hoy, Sandra.","Vamos a comer, niños.","Juan, Pérez está de vacaciones.","No, espere.","2,34","Eso solo, él lo recuelve.","Luis no viene hoy,  Sandra."};
	String[] solucio2=new String[]{"Pedro, nos ayudas, con estos ejercicios.","El festejo terminó, desdichadamente.","Luis, hoy no viene Sandra.","Vamos a comer niños.","Juan está de vacaciones, Pérez.","No espere.","23,4","Eso, solo él lo resuelve.","Luis, no viene hoy,  Sandra."};
	int[] correcta =new int[]{1,2,2,1,1,1,2,2,1};
	int contador;
	 // Properties of timer.
    private byte centiseconds = 0;
    private byte seconds;
    private short minutes ;
    private DecimalFormat timeFormatter;
    private Timer timer;
    JLabel lbl2,lbl1,lblFrase;
	public Puntuacion(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		
		timeLabel = new JLabel();
	    timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
	    timeLabel.setBounds(547, 106, 135, 49);
	    add(timeLabel);
		
		lblPunt = new JLabel("0");
		lblPunt.setForeground(new Color(0, 0, 0));
		lblPunt.setBackground(Color.WHITE);
		lblPunt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPunt.setBounds(96, 117, 96, 38);
		add(lblPunt);
		
		
		
		lbl1 = new JLabel("");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBackground(new Color(255, 204, 102));
		lbl1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(correcta[contador] == 1){
					int punt=Integer.parseInt(lblPunt.getText()) ;
					punt=punt+100;
					lblPunt.setText(String.valueOf(punt));
					seleccionaPalabra();
					
				}else{
					if(Integer.parseInt(lblPunt.getText())>0){
						int punt=Integer.parseInt(lblPunt.getText()) ;
						punt=punt-50;
						lblPunt.setText(String.valueOf(punt));
					}
					seleccionaPalabra();
				}
			}
		});
		lbl1.setBounds(96, 421, 268, 124);
		lbl1.setOpaque(true);
		add(lbl1);
		
		lbl2 = new JLabel("");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBackground(new Color(255, 204, 102));
		lbl2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(correcta[contador] == 2){
					int punt=Integer.parseInt(lblPunt.getText()) ;
					punt=punt+100;
					lblPunt.setText(String.valueOf(punt));
					seleccionaPalabra();
					
				}else{
					
					int punt=Integer.parseInt(lblPunt.getText()) ;
					punt=punt-50;
					lblPunt.setText(String.valueOf(punt));
					seleccionaPalabra();
				}
			}
		});
		lbl2.setBounds(414, 421, 268, 124);
		lbl2.setOpaque(true);
		add(lbl2);
		
		JLabel lblClose = new JLabel("");
		lblClose.setIcon(new ImageIcon(Respuesta.class.getResource("/images/stop.png")));
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timer.stop();
				framePrincipal.CambiaFondo("inicial");
			}
		});
		
		lblFrase = new JLabel("");
		lblFrase.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrase.setBackground(new Color(204, 153, 51));
		lblFrase.setBounds(96, 215, 586, 124);
		lblFrase.setOpaque(true);
		add(lblFrase);
		lblClose.setBounds(686, 79, 30, 30);
		add(lblClose);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Respuesta.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
		
		
		timeFormatter = new DecimalFormat("00");

        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (centiseconds > 0) {
                    centiseconds--;
                } else {
                    if (seconds == 0 && minutes == 0) {
                        timer.stop();
                        
                        int punt=Integer.parseInt(lblPunt.getText()) ;
                        framePrincipal.CambiaFondo("final");
                        framePrincipal.finalizarMision(punt, "puntuacion");
                    } else if (seconds > 0) {
                        seconds--;
                        centiseconds = 99;
                    } else if (minutes > 0) {
                        minutes--;
                        seconds = 59;
                        centiseconds = 99;
                    }
                }
                timeLabel.setText(timeFormatter.format(minutes) + ":"
                        + timeFormatter.format(seconds) + "."
                        + timeFormatter.format(centiseconds));
            }
        });
        
       
	}
	
	public void seleccionaPalabra(){
		if(contador == 8){
			contador=0;
		}else{

			contador ++;
		}
		lbl1.setText("<html>"+solucio1[contador]+"</html>");
		lbl2.setText("<html>"+solucio2[contador]+"</html>");
		lblFrase.setText(frase[contador]);
	}
	
	 public void comenzar(){
		minutes= 1;
		seconds= 00;
		contador = -1;
		int punt=Integer.parseInt(lblPunt.getText()) ;
		punt=0;
		lblPunt.setText(String.valueOf(punt));
		
     	timer.start();
     	seleccionaPalabra();
     }
}
