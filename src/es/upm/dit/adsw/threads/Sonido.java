package es.upm.dit.adsw.threads;

import java.awt.Toolkit;
import java.util.Scanner;

/**
 * Emite un sonido cuando se pulsa la tecla "intro"
 * 
 * @author jpuente
 * @version 2019.03.06
 */
public class Sonido extends Thread {

	@Override
	public void run() {                           /* código concurrente */
		Scanner sc = new Scanner(System.in);
		while(true) {
			sc.nextLine();                       /* espera fin de línea */
			Toolkit.getDefaultToolkit().beep();  /* emite sonido */
		}
	}
}
