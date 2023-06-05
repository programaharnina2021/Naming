package orquestav9;

import java.util.ArrayList;
import java.util.Iterator;

public class Orquesta {
	ArrayList<Playable> instrumentos;
//	ArrayList<Aclarable> aclarables;
//	ArrayList<Afinable> afinables;
//	ArrayList<Limpiable> limpiables;
//	ArrayList<Estirable> estirables;
	ArrayList<Preparable> preparables;
	

	
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
		for (Preparable aclarable : preparables) {
			aclarable.preparar();
		}
	}

	// no hay que hacer nada para que toque
	private void play() {
		for (Playable instrumento : instrumentos) {
			instrumento.play();
		}
	}
}
