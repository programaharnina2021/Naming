package orquestav7;

import java.util.ArrayList;
import java.util.Iterator;

public class Orquesta {
	ArrayList<Playable> instrumentos;
	ArrayList<Aclarable> aclarables;
	ArrayList<Afinable> afinables;
	ArrayList<Limpiable> limpiables;
	ArrayList<Estirable> estirables;
	

	
	public Orquesta(ArrayList<Playable> instrumentos, ArrayList<Aclarable> aclarables, ArrayList<Afinable> afinables,
			ArrayList<Limpiable> limpiables, ArrayList<Estirable> estirables) {
		super();
		this.instrumentos = instrumentos;
		this.aclarables = aclarables;
		this.afinables = afinables;
		this.limpiables = limpiables;
		this.estirables = estirables;
	}

	/**
	 * Y el problema de la especifidad. Si es real no se puede arreglar facilmente,
	 * hay que buscar sitios comunes
	 */
	public void darConcierto() {
		preparar();
		play();
	}

	private void preparar() {
		for (Aclarable aclarable : aclarables) {
			aclarable.aclarar();
		}
		for (Estirable estirable : estirables) {
			estirable.estirar();
		}
		
		for (Afinable afinable : afinables) {
			afinable.afinar();
		}
		for (Limpiable limpiable : limpiables) {
			limpiable.limpiar();
		}
	}

	// no hay que hacer nada para que toque
	private void play() {
		for (Playable instrumento : instrumentos) {
			instrumento.play();
		}
	}
}
