package ligav1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncuentroTestPrueba {

	@Test
	void testCalculaPuntos() {
		Participacion participacion = new Participacion(new Equipo(1,"uno"),2);
		Equipo equipo = new Equipo(2,"dos");
		Participacion participacion2 = new Participacion(equipo,3);
		Encuentro encuentro=new Encuentro(participacion, participacion2);
		assertEquals(Resultado.victoria.getPuntos(), encuentro.getPuntos(equipo));
	}

}
