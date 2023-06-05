package orquestav3;

import java.util.ArrayList;
import java.util.Iterator;

public class Orquesta {
	ArrayList<Instrumento> instrumentos;

	public Orquesta(ArrayList<Instrumento> instrumentos) {
		super();
		this.instrumentos = instrumentos;
	}

	/**
	 * Esto funciona para lo común, pero no para lo especifico
	 * Para ver el problema o/c vamos a añadir otro instrumento, Contrabajo
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
		}

	}

	private void play() {
		for (Instrumento instrumento : instrumentos) {
			instrumento.play();
		}
	}
}
