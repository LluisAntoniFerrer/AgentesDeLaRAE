package controladora;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Reproductor {
	Clip clip;
	long clipTime=0;

	public void Play() throws Exception {
			clip.setMicrosecondPosition(clipTime);
			clip.start();
		}
		 
	public void AbrirFichero(String ruta) throws Exception {
			  clip = AudioSystem.getClip();
			 AudioInputStream ais = AudioSystem.getAudioInputStream(getClass().getResource(ruta));
			 clip.open(ais);
		}
		 
	public void Pausa() throws Exception {
			clipTime= clip.getMicrosecondPosition();

			clip.stop();
		}
		 
	public void Continuar() throws Exception {
			clip.setMicrosecondPosition(clipTime);

			clip.start();
		}
		 
	public void Stop() throws Exception {
			clipTime=0;
			clip.stop();
		}
}
