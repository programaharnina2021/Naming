package ligav1;

import java.util.ArrayList;
import java.util.List;

public class Jornada {
	private List<Encuentro> encuentros;
	private int id;

	public Jornada(List<Encuentro> encuentros, int id) {
		super();
		this.encuentros = encuentros;
		this.id = id;
	}

	public Encuentro getEncuentro(int index) {
		return encuentros.get(index);
	}

	public Jornada(int id2)  {
		this.id=id;
		encuentros=new ArrayList<>();
	}

	public boolean add(Encuentro e) {
		return encuentros.add(e);
	}

	public List<Encuentro> getEncuentros() {
		return encuentros;
	}

	public void setEncuentros(List<Encuentro> encuentros) {
		this.encuentros = encuentros;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void disputarJornada() {
		for (Encuentro encuentro : encuentros) {
			encuentro.disputarEncuentro();
		}
	}

}
