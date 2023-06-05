package ligav1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Encuentro {
	private Map<Equipo, Resultado> marcador;
	private Equipo uno,  dos;

	

	public Encuentro(Equipo uno, Equipo dos) {
		this();
		this.uno = uno;
		this.dos = dos;
	}

	public Encuentro() {
		super();
		marcador = new HashMap<Equipo, Resultado>();
	}

	public Encuentro(Participacion primerParticipacion, Participacion segundaPartcipacion) {
		this();
		introducirParticipaciones(primerParticipacion, segundaPartcipacion);
	}

	private void introducirParticipaciones(Participacion primerParticipacion, Participacion segundaPartcipacion) {
		marcador.put(primerParticipacion.getEquipo(),
				Resultado.getResultado(primerParticipacion.getGoles(), segundaPartcipacion.getGoles()));
		marcador.put(segundaPartcipacion.getEquipo(),
				Resultado.getResultado(segundaPartcipacion.getGoles(), primerParticipacion.getGoles()));
	}

	public Equipo getEquipo(int i) {
		return (Equipo) marcador.keySet().toArray()[i];
	}

	public int getPuntos(Equipo equipo) {
		if (marcador.containsKey(equipo)) {
			return marcador.get(equipo).getPuntos();
		}
		return 0;
	}

	public void disputarEncuentro() {
//		Map<Equipo, Integer> goles = new HashMap();
//		for (Iterator iterator = marcador.entrySet().iterator(); iterator.hasNext();) {
//			Entry<Equipo, Resultado> next = (Entry<Equipo, Resultado>) iterator.next();
//			goles.put(next.getKey(),next.getKey().pedirGoles());
//		}
//		List<Object> asList = Arrays.asList(marcador.keySet().toArray());
//		Object equipoUno = asList.get(0);
//		Object equipoDos = asList.get(1);
//		marcador.put((Equipo)equipoUno, Resultado.getResultado(goles.get(equipoUno), goles.get(equipoDos)));
//		marcador.put((Equipo)equipoDos, Resultado.getResultado(goles.get(equipoDos), goles.get(equipoUno)));
		introducirParticipaciones(new Participacion(uno,uno.pedirGoles()), new Participacion(dos,dos.pedirGoles()));
	}

}
