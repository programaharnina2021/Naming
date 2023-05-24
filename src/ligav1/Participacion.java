package ligav1;

import java.util.Random;

public class Participacion {
	private Equipo equipo;
	private int goles;

	public Participacion(Equipo equipo, int goles) {
		super();
		this.equipo = equipo;
		this.goles = goles;
	}

	public Participacion(Equipo equipo) {
		super();
		this.equipo = equipo;
		this.goles=new Random().nextInt(10);
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public int getGoles() {
		return goles;
	}

}
