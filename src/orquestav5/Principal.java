package orquestav5;

import java.util.ArrayList;

public class Principal {
public static void main(String[] args) {
	//apenas hay cambios
	ArrayList<Instrumento> instrumentos=new ArrayList<>();
	instrumentos.add(new Bombo("lolo"));
	instrumentos.add(new Violin("juan"));
	instrumentos.add(new Clarinete("luis"));
	//add no moficar
	instrumentos.add(new Contrabajo("Celia"));
	//la soprano no es un instrumento
		instrumentos.add(new Soprano(2));
	new Orquesta(instrumentos).darConcierto();;
}
}
