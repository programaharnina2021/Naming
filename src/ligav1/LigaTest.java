package ligav1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class LigaTest {

	//v3
	@Test
	void test() {
		List<Equipo> cuatroEquipos = new EquiposOM().getCuatroEquipos();
		Liga liga = new Liga(cuatroEquipos);
		System.out.println();
		Jornada jornada = liga.getJornada(0);
		Equipo equipoUno=jornada.getEncuentro(0).getEquipo(0);
		Equipo equipoDos=jornada.getEncuentro(0).getEquipo(1);
		//cambiamos equals
		assertEquals(cuatroEquipos.get(1), equipoUno);
		assertEquals(cuatroEquipos.get(0), equipoDos);
		jornada = liga.getJornada(0);
		equipoUno=jornada.getEncuentro(1).getEquipo(0);
		equipoDos=jornada.getEncuentro(1).getEquipo(1);
		//cambiamos equals
		assertEquals(cuatroEquipos.get(3), equipoUno);
		assertEquals(cuatroEquipos.get(2), equipoDos);
	}

}
