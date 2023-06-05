package orquestav9;

public class Bombo extends Instrumento implements Playable,Estirable,Preparable {

	public Bombo(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println("dandole golpes a esto");
	}

	public void estirar() {
		System.out.println("tensando la superficie del bombo");
	}

	@Override
	public void preparar() {
		estirar();
	}
}
