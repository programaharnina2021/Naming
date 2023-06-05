package filtros;

import java.util.ArrayList;
import java.util.List;

public class FiltroPrueba {
public static void main(String[] args) {
	List<Movil> movils = new MovilOM().getMovils();
	List<Movil> filtro = new ArrayList<>();
	int precioMin = 300;
	int precioMax = 400;
	for (Movil movil : movils) {
		// hay un comportamiento
		if (movil.getPrecio() >= precioMin && movil.getPrecio() <= precioMax) {
			filtro.add(movil);
			System.out.println(movil);
		}
	}
	int ramMinimo=1;
	int ramMaximo=6;
	List<Movil> refiltro = new ArrayList<>();
	for (Movil movil : filtro) {
		if(movil.getRam()>=ramMinimo&&movil.getRam()<=ramMaximo) {
			refiltro.add(movil);
		}
	}
	boolean nfc=true;
	List<Movil> rerefiltro = new ArrayList<>();
	for (Movil movil : refiltro) {
		if(movil.isNfc()==nfc) {
			rerefiltro.add(movil);
		}
	}
	float otroMinimo=1;
	int otroMaximo=6;
	List<Movil> rererefiltro = new ArrayList<>();
	for (Movil movil : rerefiltro) {
		if(movil.getOtro()>=otroMinimo&&movil.getOtro()<=otroMaximo) {
			rererefiltro.add(movil);
		}
	}
}
}
