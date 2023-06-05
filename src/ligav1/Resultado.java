package ligav1;

public enum Resultado {
	victoria(3),empate(1),derrota(0);
	private int puntos;

	private Resultado(int puntos) {
		this.puntos = puntos;
	}

	public int getPuntos() {
		return puntos;
	}

	public static Resultado getResultado(int goles, int goles2) {
		if(goles==goles2)
			return empate;
		if(goles>goles2)
			return victoria;
		return derrota;
	}
	
	
}
