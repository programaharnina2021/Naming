package ahorcado;

import java.util.Scanner;

public class AhorcadoV0
{
	public static void main(String[] args) {
		//Leer la palabra secreta
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce la palabra secreta");
		String palabraSecreta = lector.nextLine();
		palabraSecreta=palabraSecreta.toUpperCase();
		//se crea la palabra con los aciertos
		boolean intentoFallido = true;
		boolean acertado=false;
		int cantidadFallos=0;
		char[] caracteresAcertados = new char[palabraSecreta.length()];
		for (int i = 0; i < caracteresAcertados.length; i++) {
				caracteresAcertados[i] = '_';
		}
		//el bucle del juego
		do {
			System.out.println("Introduce la letra");
			char letraPropuesta = lector.nextLine().charAt(0);
			letraPropuesta = Character.toUpperCase(letraPropuesta);
			
			//si la letra est� en la palabra secreta la escribo en la de los aciertos
			for (int i = 0; i < caracteresAcertados.length; i++) {
				if (palabraSecreta.charAt(i) == letraPropuesta) {
					caracteresAcertados[i] = letraPropuesta;
					intentoFallido = false;
				}
			}
			
			System.out.println("ha fallao " + intentoFallido);
			acertado=true;
			//me pregunto si alguna letra de parc esta con '_' significa que no
			//esta todavia acertada la palabra
			for (int i = 0; i < caracteresAcertados.length; i++) {
				System.out.print(" " + caracteresAcertados[i]);
				if(caracteresAcertados[i]=='_') {
					acertado=false;
				}
			}
			//me pregunto si he alcanzado el numero maximo de fallos
			if(intentoFallido==true) {
				cantidadFallos++;
				intentoFallido=true;
			}
		} while (cantidadFallos<5&&!acertado);
		System.out.println("terminado");
	}
}
