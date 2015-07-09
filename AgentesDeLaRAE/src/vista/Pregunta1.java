package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta1 extends JPanel {

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Pregunta1(FramePrincipal framePrincipal) {
		setLayout(null);
		setBounds(0,0,800,640);
		
		JLabel lblUnidadDidactica = new JLabel("Unidad didactica");
		lblUnidadDidactica.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnidadDidactica.setFont(new Font("Segoe Print", Font.BOLD, 26));
		lblUnidadDidactica.setBounds(185, 228, 427, 34);
		add(lblUnidadDidactica);
		
		JLabel lblLosAgentesDe_1 = new JLabel("LOS AGENTES DE LA RAE");
		lblLosAgentesDe_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLosAgentesDe_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblLosAgentesDe_1.setBounds(185, 420, 427, 34);
		add(lblLosAgentesDe_1);
		
		JLabel label = new JLabel("1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe Print", Font.BOLD, 50));
		label.setBounds(185, 319, 427, 41);
		add(label);
		
		JButton button = new JButton("Siguiente >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				framePrincipal.CambiaFondo("pregunta2");
			}
		});
		button.setBounds(580, 606, 109, 23);
		add(button);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Pregunta1.class.getResource("/images/tablillaPreguntas.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);

	}
}
