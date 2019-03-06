package es.upm.dit.adsw.threads;

import java.util.Date;

/**
 * Reloj1 que escribe la hora cada segundo. Construido con un objeto Runnable
 * con un método run interno.
 * 
 * @author jpuente
 * @version 2019.03.06
 */
public class Reloj3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable Hora = new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						Thread.sleep(1000);
						System.out.println(new Date().toString());
					}
				} catch (InterruptedException e) {
					return;
				}
			}
		};
		new Thread(Hora).start();
	}

}