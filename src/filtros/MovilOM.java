package filtros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovilOM {
	public List<Movil> getMovils(){
		ArrayList<Movil> movils=new ArrayList<>();
		List<Marca> marcas = getMarcas();
		int ram[]= {1,2,4,6,6,4,6,8,6,4,4,4,4,6};
		int precio[]= {89,120,160,200,250,180,280,350,150,160,140,175,260,300};
		boolean nfc[]= {false,true,true,false, true,true,false, true, true, false, false, true,true,true};
		String modelo[]= {"a1","xc22","d3","x1","s55","14","d122","ss1","dstx","xpoco1","old1","new1","ds5","coreX"};
		if(ram.length==precio.length&&ram.length==nfc.length&&modelo.length==ram.length) {
			 for (int i = 0; i < modelo.length; i++) {
				 movils.add(new Movil(ram[i], precio[i], nfc[i], modelo[i], marcas.get(i%marcas.size()),ram[i]));
			}
		}
		else {
			System.out.println("fallo");
		}
		return movils;
	}
	
	private List<Marca> getMarcas(){
		return List.of(new Marca("Samsumg"),new Marca("Apple"),new Marca("Sony"),new Marca("Xiaomi"),new Marca("Google"));
	}
}
