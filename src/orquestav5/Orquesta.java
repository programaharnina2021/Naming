package orquestav5;

import java.util.ArrayList;
import java.util.Iterator;

public class Orquesta {
	ArrayList<Instrumento> instrumentos;

	public Orquesta(ArrayList<Instrumento> instrumentos) {
		super();
		this.instrumentos = instrumentos;
	}

	/**
	 * como vamos a hacer para que no hay que modificar esto
	 */
	public void darConcierto() {
		preparar();
		play();
	}

	private void preparar() {
		//Esto es boiler plate y un plato de spaquetti
		for (Instrumento instrumento : instrumentos) {
			if (instrumento instanceof Violin) {
				((Violin) instrumento).afinar();
			} else if (instrumento instanceof Bombo) {
				((Bombo) instrumento).estirar();
			} else if (instrumento instanceof Clarinete) {
				((Clarinete) instrumento).limpiar();
			}
			//obligados a modificar
			else if (instrumento instanceof Contrabajo) {
				((Contrabajo) instrumento).afinar();
			}
		}

	}

	//no hay que hacer nada para que toque
	private void play() {
		for (Instrumento instrumento : instrumentos) {
			instrumento.play();
		}
	}
}
