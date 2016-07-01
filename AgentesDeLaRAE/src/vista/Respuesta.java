package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Respuesta extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 * @param framePrincipal 
	 */
	public Respuesta(FramePrincipal framePrincipal) {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0,0,800,640);
		
		JButton btnMenu = new JButton("Menu Principal");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrincipal.CambiaFondo("inicial");
			}
		});
		btnMenu.setBounds(511, 524, 194, 29);
		add(btnMenu);
		
		JButton btnReiniciarNivel = new JButton("Reiniciar nivel");
		btnReiniciarNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				framePrincipal.CambiaFondo("pregunta1");
			}
		});
		btnReiniciarNivel.setBounds(511, 479, 194, 29);
		add(btnReiniciarNivel);
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "0%"},
				{"2", "0%"},
				{"3", "0%"},
				{"4", "0%"},
				{"5", "0%"},
				{"6", "0%"},
				{"7", "0%"},
				{"8", "0%"},
				{"9", "0%"},
				{"10", "0%"},
			},
			new String[] {
				"Nivel", "Aciertos"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(483, 127, 222, 267);
		add(table);
		
		JLabel lblAhoraCompruebaTus = new JLabel("\u00BFVolvemos a");
		lblAhoraCompruebaTus.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblAhoraCompruebaTus.setBounds(188, 192, 161, 23);
		add(lblAhoraCompruebaTus);
		
		JLabel lblBienHecho = new JLabel("\u00A1 Necesitas mejorar!");
		lblBienHecho.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblBienHecho.setBounds(178, 153, 170, 23);
		add(lblBienHecho);
		
		JLabel lblTusResultados = new JLabel("intentarlo?");
		lblTusResultados.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblTusResultados.setBounds(188, 226, 135, 14);
		add(lblTusResultados);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Respuesta.class.getResource("/images/bocadillo.png")));
		label_2.setBounds(111, 127, 288, 176);
		add(label_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Respuesta.class.getResource("/images/agentes.png")));
		label_1.setBounds(91, 304, 356, 249);
		add(label_1);
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Respuesta.class.getResource("/images/PAPIRO 8.png")));
		fondo.setBounds(0, 0, 800, 640);
		add(fondo);
	}
}
