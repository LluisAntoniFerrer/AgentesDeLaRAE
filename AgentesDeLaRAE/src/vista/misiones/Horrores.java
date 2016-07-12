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

public class Horrores extends JPanel {
	private JTextField textField;
	private JLabel timeLabel;
	JLabel lblPunt;

	//propiedades de las fotos
	
	String[] carteles=new String[]{"horror","horror1","horror2","horror3","horror4","horror5","horror6","horror7","horror8","horror9","horror10","horror11","horror12","horror13","horror14","horror15","horror16","horror17"};
	String[] solucion=new String[]{"Cebolla","Dios me sigue ayudando","No se permite alcohol pasando este punto","Solicito empleada","Venta de hielo","Abierto vendo barato","Objetivo","Prohibido asomarse mucho","Abierto empuje","Bienvenidos a su coctelería","bienvenidos","Vacaciones","Prohibido estacionar","Se solicita personal","Conservación","Habla","Ya esta abierto","Por favor no abrir los libros"};
	int numeroCartel;
	JLabel lblImagen = new JLabel("");
	
	 // Properties of timer.
    private byte centiseconds = 0;
    private byte seconds ;
    private short minutes ;
    private DecimalFormat timeFormatter;
    private Timer timer;
    
	public Horrores(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		
		lblImagen.setBounds(156, 147, 476, 284);
		add(lblImagen);
		
		
		timeLabel = new JLabel();
	    timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
	    timeLabel.setBounds(547, 106, 135, 49);
	    add(timeLabel);
	    
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(156, 447, 476, 49);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblClose = new JLabel("");
		lblClose.setIcon(new ImageIcon(Respuesta.class.getResource("/images/stop.png")));
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framePrincipal.CambiaFondo("inicial");
			}
		});
		lblClose.setBounds(686, 79, 30, 30);
		add(lblClose);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Integer.parseInt(lblPunt.getText())>0){
					int punt=Integer.parseInt(lblPunt.getText()) ;
					punt=punt-10;
					lblPunt.setText(String.valueOf(punt));
				}
				cambiaFoto();
			}
		});
		btnSiguiente.setBounds(555, 512, 138, 29);
		add(btnSiguiente);
		
		JButton btnCorregir = new JButton("Corregir");
		btnCorregir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals(solucion[numeroCartel])){
					
					int punt=Integer.parseInt(lblPunt.getText()) ;
					punt=punt+100;
					lblPunt.setText(String.valueOf(punt));
					Font fuente= new Font("Tahoma", 0, 20);
					textField.setFont(fuente); 
					textField.setForeground(Color.BLACK);
					textField.setText("");
					cambiaFoto();
				}else{
					if(Integer.parseInt(lblPunt.getText())>0){
						int punt=Integer.parseInt(lblPunt.getText()) ;
						punt=punt-10;
						lblPunt.setText(String.valueOf(punt));
					}
					
					Font fuente= new Font("Tahoma", 0, 20);
					textField.setFont(fuente); 
					textField.setForeground(Color.RED);
				}
			}
		});
		btnCorregir.setBounds(425, 512, 115, 29);
		add(btnCorregir);
		
		lblPunt = new JLabel("0");
		lblPunt.setForeground(new Color(0, 0, 0));
		lblPunt.setBackground(Color.WHITE);
		lblPunt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPunt.setBounds(96, 117, 96, 38);
		add(lblPunt);
		
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
                        framePrincipal.finalizarMision(punt, "acentuacion");
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
	
	public void cambiaFoto(){
		numeroCartel = (int) Math.floor(Math.random()*carteles.length);
		lblImagen.setIcon(new ImageIcon(Horrores.class.getResource("/images/horrores/"+carteles[numeroCartel]+".png")));
	}
	
	 public void comenzar(){
		minutes= 3;
		seconds= 00;
		
		int punt=Integer.parseInt(lblPunt.getText()) ;
		punt=0;
		lblPunt.setText(String.valueOf(punt));
		
     	timer.start();
     	cambiaFoto();
     }
        
}
