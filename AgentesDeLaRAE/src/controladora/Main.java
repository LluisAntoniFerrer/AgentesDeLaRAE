package controladora;

import java.awt.EventQueue;

import vista.FramePrincipal;

public class Main {
	
	int nivel=1;
	int fallos=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
