package ligav1;

import java.util.HashMap;
import java.util.Map;

public class Encuentro {
	private Map<Equipo, Resultado> marcador;

	public Encuentro(Participacion primerParticipacion, Participacion segundaPartcipacion) {
		super();
		marcador = new HashMap<Equipo, Resultado>();
		marcador.put(primerParticipacion.getEquipo(),
				Resultado.getPuntos(primerParticipacion.getGoles(), segundaPartcipacion.getGoles()));
	}

	public int getPuntos(Equipo equipo) {
		if (marcador.containsKey(equipo)) {
			return marcador.get(equipo).getPuntos();
		}
		return 0;
	}
	
}
