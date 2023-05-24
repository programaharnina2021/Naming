import java.util.ArrayList;

public class Primcipal {

	public static void main(String[] args) {
		ArrayList<String> letreros = new ArrayList<>();
		letreros.add("hola");
		String adios = "adios";
		letreros.add(adios);
		if(letreros.contains(adios)) {
			letreros.remove(adios);
		}
	}

}
