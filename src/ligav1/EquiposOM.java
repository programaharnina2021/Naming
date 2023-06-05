package ligav1;

import java.util.ArrayList;
import java.util.List;

public class EquiposOM {

	//v3
	public List<Equipo> getCuatroEquipos() {
		ArrayList equipos = new ArrayList<>();
		equipos.add(new Equipo(1, "uno"));
		equipos.add(new Equipo(2, "dos"));
		equipos.add(new Equipo(3, "tres"));
		equipos.add(new Equipo(4, "cuatro"));
		return equipos;
	}

}
