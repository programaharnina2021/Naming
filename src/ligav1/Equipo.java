package ligav1;

import java.util.Objects;
import java.util.Random;

public class Equipo {
	private int id;
	private String nombre;

	public Equipo(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return id == other.id && Objects.equals(nombre, other.nombre);
	}

	public Integer pedirGoles() {
		return new Random().nextInt(10);
	}

}
