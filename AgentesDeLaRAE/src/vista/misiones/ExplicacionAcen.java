package vista.misiones;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import vista.FramePrincipal;
import vista.Respuesta;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class ExplicacionAcen extends JPanel {

	/**
	 * Create the panel.
	 */
	public ExplicacionAcen(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel lblNewLabel = new JLabel("Hemos encontrado estas im\u00E1genes en tu ciudad.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(147, 134, 366, 20);
		add(lblNewLabel);
		
		JLabel lblImagenespuedesCorregir = new JLabel("\u00BFPuedes encontrar y corregir todos los errores?");
		lblImagenespuedesCorregir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblImagenespuedesCorregir.setBounds(147, 162, 356, 20);
		add(lblImagenespuedesCorregir);
		
		JLabel lblParaElloTendras = new JLabel("Para ello tendr\u00E1s 2 minutos; con cada acierto ");
		lblParaElloTendras.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblParaElloTendras.setBounds(147, 191, 356, 20);
		add(lblParaElloTendras);
		
		JLabel lblPeroCuidadoCada = new JLabel(" obtendr\u00E1s 100 puntos, pero cuidado");
		lblPeroCuidadoCada.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPeroCuidadoCada.setBounds(147, 215, 356, 20);
		add(lblPeroCuidadoCada);
		
		JLabel lblCadaFalloRestara = new JLabel(" cada fallo restar\u00E1 10 puntos!");
		lblCadaFalloRestara.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCadaFalloRestara.setBounds(147, 243, 356, 20);
		add(lblCadaFalloRestara);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Respuesta.class.getResource("/images/bocadilloGrande.png")));
		label_2.setBounds(46, 82, 525, 261);
		add(label_2);
		
		JTextPane txtpncuantosPuntosEres = new JTextPane();
		txtpncuantosPuntosEres.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpncuantosPuntosEres.setText("\u00BFCuantos puntos eres capaz de hacer?");
		txtpncuantosPuntosEres.setBounds(523, 304, 93, 92);
		add(txtpncuantosPuntosEres);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setIcon(new ImageIcon(Respuesta.class.getResource("/images/bocadilloRed200x200.png")));
		lbl3.setBounds(462, 265, 200, 200);
		add(lbl3);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Respuesta.class.getResource("/images/agentes.png")));
		label_1.setBounds(91, 304, 356, 249);
		add(label_1);
		
		JButton btnvamos = new JButton("\u00A1Vamos!");
		btnvamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				framePrincipal.CambiaFondo("acentuacion");
				framePrincipal.temporizadorAcentuacion();
			}
		});
		btnvamos.setBounds(537, 495, 115, 29);
		add(btnvamos);
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Respuesta.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}
}
