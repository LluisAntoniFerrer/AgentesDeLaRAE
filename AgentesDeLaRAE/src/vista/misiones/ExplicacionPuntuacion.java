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

public class ExplicacionPuntuacion extends JPanel {

	/**
	 * Create the panel.
	 */
	public ExplicacionPuntuacion(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel lblNewLabel = new JLabel("Una coma lo cambia todo. Lee bien el enunciado ");
		lblNewLabel.setBounds(276, 134, 366, 20);
		add(lblNewLabel);
		
		JLabel lblImagenespuedesCorregir = new JLabel("y escoge la opci\u00F3n correcta. \u00A1Vamos all\u00E1!");
		lblImagenespuedesCorregir.setBounds(276, 162, 356, 20);
		add(lblImagenespuedesCorregir);
		
		JLabel lblParaElloTendras = new JLabel("Para ello tendr\u00E1s 1 minutos; con cada acierto ");
		lblParaElloTendras.setBounds(276, 191, 356, 20);
		add(lblParaElloTendras);
		
		JLabel lblPeroCuidadoCada = new JLabel(" obtendr\u00E1s 100 puntos, pero cuidado");
		lblPeroCuidadoCada.setBounds(276, 215, 356, 20);
		add(lblPeroCuidadoCada);
		
		JLabel lblCadaFalloRestara = new JLabel(" cada fallo restar\u00E1 50 puntos!");
		lblCadaFalloRestara.setBounds(276, 243, 356, 20);
		add(lblCadaFalloRestara);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Respuesta.class.getResource("/images/bocadilloGrande.png")));
		label_2.setBounds(178, 81, 550, 261);
		add(label_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Respuesta.class.getResource("/images/agentes.png")));
		label_1.setBounds(91, 304, 356, 249);
		add(label_1);
		
		JButton btnvamos = new JButton("\u00A1Vamos!");
		btnvamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				framePrincipal.CambiaFondo("puntuacion");
				framePrincipal.temporizadorPuntuacion();
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
