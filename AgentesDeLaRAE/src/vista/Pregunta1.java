package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Pregunta1 extends JPanel {

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta1(FramePrincipal framePrincipal) {
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel lblUnidadDidactica = new JLabel("Unidad didáctica");
		lblUnidadDidactica.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnidadDidactica.setFont(new Font("Segoe Print", Font.BOLD, 34));
		lblUnidadDidactica.setBounds(185, 171, 427, 34);
		add(lblUnidadDidactica);
		
		JLabel lblLosAgentesDe_1 = new JLabel("LOS AGENTES");
		lblLosAgentesDe_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLosAgentesDe_1.setFont(new Font("Segoe Print", Font.BOLD, 44));
		lblLosAgentesDe_1.setBounds(185, 374, 427, 45);
		add(lblLosAgentesDe_1);
		
		JLabel label = new JLabel("1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe Print", Font.BOLD, 72));
		label.setBounds(185, 260, 427, 67);
		add(label);
		
		JLabel fondo = new JLabel("");
		fondo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				framePrincipal.CambiaFondo("pregunta2");
			}
		});
		
		JLabel lblDeLaRae = new JLabel("DE LA RAE");
		lblDeLaRae.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeLaRae.setFont(new Font("Segoe Print", Font.BOLD, 44));
		lblDeLaRae.setBounds(185, 435, 427, 45);
		add(lblDeLaRae);
		fondo.setIcon(new ImageIcon(Pregunta1.class.getResource("/images/papiroInter.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);

	}
}
