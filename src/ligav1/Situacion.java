package ligav1;

public enum Situacion {
	victoria(3),empate(1),derrota(0);
	private int puntos;

	private Situacion(int puntos) {
		this.puntos = puntos;
	}

	public int getPuntos() {
		return puntos;
	}
	
}
