package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

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
		
		JButton btnReiniciarNivel = new JButton("¿Empezar de nuevo?");
		btnReiniciarNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				framePrincipal.CambiaFondo("pregunta1");
			}
		});
		btnReiniciarNivel.setBounds(511, 479, 194, 29);
		add(btnReiniciarNivel);
		
		  /* Creo una instancia de la clase Vector llamada 'columnas' */
        Vector columnas = new Vector();
        /* 
            A ese vector le agrego datos, estos datos vendrán a ser las
            columnas de la tabla.
        */
        columnas.add("Ejercicio");
        columnas.add("Resultado");
        
        /* 
        Creo una instancia de la clase Vector llamada 'filas' , este vector
        tendrá todas las filas de la tabla.
         */
	    Vector filas = new Vector();
	    
	    Vector fila = new Vector();
	    
	    fila.add("Ejercicio 1");
	    fila.add("0"+"%");
        filas.add(fila);
        
        fila = new Vector();
	    
	    fila.add("Ejercicio 2");
	    fila.add("0"+"%");
        filas.add(fila);
        
        fila = new Vector();
	    
	    fila.add("Ejercicio 3");
	    fila.add("0"+"%");
        filas.add(fila);
        
        fila = new Vector();
	    
	    fila.add("Ejercicio 4");
	    fila.add("0"+"%");
        filas.add(fila);
        
        fila = new Vector();
	    
	    fila.add("Ejercicio 5");
	    fila.add("0"+"%");
        filas.add(fila);
        
        fila = new Vector();
	    
	    fila.add("Ejercicio 6");
	    fila.add("0"+"%");
        filas.add(fila);
        
        fila = new Vector();
	    
	    fila.add("Ejercicio 7");
	    fila.add("0"+"%");
        filas.add(fila);
        
        fila = new Vector();
	    
	    fila.add("Ejercicio 8");
	    fila.add("0"+"%");
        filas.add(fila);
        
        fila = new Vector();
	    
	    fila.add("Ejercicio 9");
	    fila.add("0"+"%");
        filas.add(fila);
        
        fila = new Vector();
	    
	    fila.add("TOTAL");
	    fila.add("0"+"%");
        filas.add(fila);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(445, 133, 260, 304);
		add(scrollPane);
		
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
		
		table = new JTable(filas,columnas);
		scrollPane.setViewportView(table);
		table.setEnabled(false);
		table.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 22));
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		updateRowHeights();
	}
	
	private void updateRowHeights()
	{
	    for (int row = 0; row < table.getRowCount(); row++)
	    {
	        int rowHeight = table.getRowHeight();

	        for (int column = 0; column < table.getColumnCount(); column++)
	        {
	            Component comp = table.prepareRenderer(table.getCellRenderer(row, column), row, column);
	            rowHeight = Math.max(rowHeight, comp.getPreferredSize().height);
	        }

	        table.setRowHeight(row, rowHeight);
	    }
	}
}
