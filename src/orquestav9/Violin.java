package orquestav9;

public class Violin extends Instrumento implements Playable, Afinable {

	public Violin(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println("estoy tocando un violin");
	}
	@Override
	public void afinar() {
		System.err.println("estoy afinando el violin");
	}

}
