package es.upm.dit.adsw.threads;

/**
 * Reloj1 que escribe la hora cada segundo
 * y produce un sonido cuando se pulsa INTRO
 * 
 * @author jpuente
 * @version 2019.03.06
 */
public class Reloj {

	/**
	 * @param args -- no hay argumentos
	 */
	public static void main(String[] args) {

		Hora hora   = new Hora() ;          // crea las hebras
		Sonido sonido = new Sonido();
		hora.start();                        // ... y las arranca
		sonido.start();
	}

}


