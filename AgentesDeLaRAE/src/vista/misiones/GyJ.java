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

public class GyJ extends JPanel {
	private JLabel timeLabel;
	JLabel lblPunt;

	//propiedades de las fotos
	
	String[] palabras=new String[]{"recoger","gesto","salvaje","agenda","agente","región","vegetal","patinaje","girar","ligero","ángel","surgir","cirugía","genial","viajen","mensaje","conserje","legislar","lejos","Lejía","recoges","corregir","Tejer","crujir","vigésimo","refugio","religión","elogio","espejo","Agenda"};
	String letra;
	JLabel[] lblLetra=new JLabel[]{new JLabel(""),new JLabel(""),new JLabel(""),new JLabel(""),new JLabel(""),new JLabel(""),new JLabel(""),new JLabel("")};
	
	 // Properties of timer.
    private byte centiseconds = 0;
    private byte seconds = 00;
    private short minutes = 2;
    private DecimalFormat timeFormatter;
    private Timer timer;
    
	public GyJ(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		
		timeLabel = new JLabel();
	    timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
	    timeLabel.setBounds(558, 93, 135, 49);
	    add(timeLabel);
		
		lblPunt = new JLabel("0");
		lblPunt.setForeground(new Color(0, 0, 0));
		lblPunt.setBackground(Color.WHITE);
		lblPunt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPunt.setBounds(96, 93, 96, 38);
		add(lblPunt);
		
		
		lblLetra[0].setBounds(122, 252, 55, 55);
		add(lblLetra[0]);
		
		lblLetra[1].setBounds(192, 252, 55, 55);
		add(lblLetra[1]);
		
		lblLetra[2].setBounds(262, 252, 55, 55);
		add(lblLetra[2]);
		
		lblLetra[3].setBounds(332, 252, 55, 55);
		add(lblLetra[3]);
		
		lblLetra[4].setBounds(402, 252, 55, 55);
		add(lblLetra[4]);
		
		lblLetra[5].setBounds(472, 252, 55, 55);
		add(lblLetra[5]);
		
		lblLetra[6].setBounds(542, 252, 55, 55);
		add(lblLetra[6]);
		
		lblLetra[7].setBounds(612, 252, 55, 55);
		add(lblLetra[7]);
		
		JLabel lblG = new JLabel("");
		lblG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(letra.equals("g")){
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
		lblG.setBounds(262, 421, 100, 100);
		lblG.setIcon(new ImageIcon(Respuesta.class.getResource("/images/letras/g.png")));
		add(lblG);
		
		JLabel lblJ = new JLabel("");
		lblJ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(letra.equals("j")){
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
		lblJ.setBounds(414, 421, 100, 100);
		lblJ.setIcon(new ImageIcon(Respuesta.class.getResource("/images/letras/j.png")));
		add(lblJ);
		
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
		
		String palabra =  palabras[(int) Math.floor(Math.random()*palabras.length)];
		lblLetra[0].setIcon(null);
		lblLetra[1].setIcon(null);
		lblLetra[2].setIcon(null);
		lblLetra[3].setIcon(null);
		lblLetra[4].setIcon(null);
		lblLetra[5].setIcon(null);
		lblLetra[6].setIcon(null);
		lblLetra[7].setIcon(null);
		for(int i=0;i<palabra.length();i++){
			String let=palabra.charAt(i)+"";
			lblLetra[i].setIcon(new ImageIcon(Acentuacion.class.getResource("/images/letras/"+let.toLowerCase()+".png")));

			if(let.toLowerCase().equals("j")){
				letra="j";
				lblLetra[i].setIcon(new ImageIcon(Acentuacion.class.getResource("/images/letras/-.png")));
				
			}else if(let.toLowerCase().equals("g")){
				letra="g";
				lblLetra[i].setIcon(new ImageIcon(Acentuacion.class.getResource("/images/letras/-.png")));
			}
			
		}
	}
	
	 public void comenzar(){
	       
     	timer.start();
     	seleccionaPalabra();
     }
}
