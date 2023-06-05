package ligav1;

import java.util.ArrayList;
import java.util.List;

public class Liga {
	
	private List<Jornada> jornadas;
	private List<Equipo> equipos;
	private StringBuffer cosa;
	
	public Liga(List<Equipo> equipos) {
		super();
		this.equipos = equipos;
		this.cosa=new StringBuffer();
		this.jornadas=generarJornadas();
	}
	
	public void disputarJornadas() {
		for (Jornada jornada : jornadas) {
			jornada.disputarJornada();
		}
	}
	
	private List<Jornada> generarJornadas() {
		List<Jornada> misJornadas=new ArrayList<Jornada>();
		int cantidadJornadas = equipos.size()-1;
		for (int i = 0; i < cantidadJornadas; i++) {
			misJornadas.add(generarJornada(i));
		}
		return misJornadas;
	}

	private Jornada generarJornada(int i) {
		int enfrentamientosPorJornada= equipos.size()/2;
		int emparejamientos[]=new int[2];
		int orden = generarPrimeraJornada(emparejamientos);
		Jornada jornada = new Jornada(orden);
		jornada.add(new Encuentro(equipos.get(emparejamientos[0]), equipos.get(emparejamientos[1])));
		for (int j=0; j < enfrentamientosPorJornada; j++) {
			orden = generarEmparejamiento(emparejamientos, orden);
			jornada.add(new Encuentro(equipos.get(emparejamientos[0]), equipos.get(emparejamientos[1])));
		}
		return jornada;
	}

	private int generarPrimeraJornada(int[] emparejamientos) {
		emparejamientos[0]=0;
		int orden =1;
		emparejamientos[1]=orden++;
		return orden;
	}

	private int generarEmparejamiento(int[] emparejamientos, int orden) {
		int size = equipos.size();
		for (int k = 0; k < 2; k++) {
			if (orden % size == 0)
				orden++;
			emparejamientos[k]=orden % size;
			orden++;
		}
		return orden;
	}
	
	public Jornada getJornada(int index) {
		return jornadas.get(index);
	}

}
