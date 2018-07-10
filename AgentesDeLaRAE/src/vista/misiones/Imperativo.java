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
import java.awt.SystemColor;

public class Imperativo extends JPanel {
	private JTextField textField;
	private JLabel timeLabel;
	JLabel lblPunt;

	//propiedades de las fotos
	
	String[] carteles=new String[]{"imperativo1","imperativo2","imperativo3","imperativo4","imperativo5","imperativo6","imperativo7"};
	String[] frase=new String[]{"Si me queréis, irse.","¡Ser malos! Buenas noches.","¡Correr insensatos!","Luchar y seréis libres en la vida.","Buena suerte y que la suerte este siempre de vuestra parte.","Busca lo más vital nomás y olvidate de la preocupación.","Y ahora, Harry, adentremonos en la oscuridad y vayamos en busca de la aventura."};
	String[] solucion=new String[]{"Si me queréis, idos.","¡Sed malos! Buenas noches.","¡Corred insensatos!","Luchad y seréis libres en la vida.","Buena suerte y que la suerte esté siempre de vuestra parte.","Busca lo más vital nomás y olvídate de la preocupación.","Y ahora, Harry, adentrémonos en la oscuridad y vayamos en busca de la aventura."};
	int numeroCartel;
	JLabel lblImagen = new JLabel("");
	JLabel lblPregunta = new JLabel("");
	
	 // Properties of timer.
    private byte centiseconds = 0;
    private byte seconds ;
    private short minutes ;
    private DecimalFormat timeFormatter;
    private Timer timer;
    
	public Imperativo(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		
		lblImagen.setBounds(156, 147, 183, 207);
		add(lblImagen);
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		timeLabel.setBounds(547, 106, 135, 49);
		add(timeLabel);
		lblPregunta.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblPregunta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPregunta.setBounds(410, 193, 237, 90);
		add(lblPregunta);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Imperativo.class.getResource("/images/bocadilloGrande350x166.png")));
		label_2.setBounds(349, 147, 322, 207);
		add(label_2);
	    
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBackground(SystemColor.scrollbar);
		textField.setBounds(156, 447, 476, 49);
		add(textField);
		textField.setColumns(10);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Integer.parseInt(lblPunt.getText())>0){
					int punt=Integer.parseInt(lblPunt.getText()) ;
					punt=punt-10;
					lblPunt.setText(String.valueOf(punt));
				}
				textField.setForeground(Color.BLACK);
				textField.setText("");
				cambiaFoto();
			}
		});
		btnSiguiente.setBounds(555, 512, 138, 29);
		add(btnSiguiente);
		
		JButton btnCorregir = new JButton("Corregir");
		btnCorregir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String aa = textField.getText();
				String ba = solucion[numeroCartel];
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
		
		JLabel lblClose = new JLabel("");
		lblClose.setIcon(new ImageIcon(Respuesta.class.getResource("/images/stop.png")));
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timer.stop();
				framePrincipal.CambiaFondo("inicial");
			}
		});
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
                        framePrincipal.finalizarMision(punt, "imperativo");
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
		if(numeroCartel == 6)
		{
			numeroCartel=0;
			
		}else{
			numeroCartel = numeroCartel+1;
		}
		lblPregunta.setText("<html>"+frase[numeroCartel]+"</html>");
		lblImagen.setIcon(new ImageIcon(Acentuacion.class.getResource("/images/imperativo/"+carteles[numeroCartel]+".png")));
	}
	
	 public void comenzar(){
		minutes= 2;
		seconds= 00;
		numeroCartel=-1;
		
		int punt=Integer.parseInt(lblPunt.getText()) ;
		punt=0;
		lblPunt.setText(String.valueOf(punt));
		
     	timer.start();
     	cambiaFoto();
     }
}
