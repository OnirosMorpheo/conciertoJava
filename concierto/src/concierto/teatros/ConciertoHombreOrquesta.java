package concierto.teatros;

import java.util.ArrayList;
import concierto.instrumentos.Instrumento;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public void main(String[] args) {
		Instrumento tambor = new Instrumento("pow, pow, pow");
		Instrumento trompeta = new Instrumento("tu, tu, tu");
		Instrumento guitarra = new Instrumento("tran, tran, tran");
		HombreOrquesta hombreOrquesta = new HombreOrquesta();
		hombreOrquesta.setInstrumentos(new ArrayList<>());
		hombreOrquesta.getInstrumentos().add(tambor);
		hombreOrquesta.getInstrumentos().add(trompeta);
		hombreOrquesta.getInstrumentos().add(guitarra);
		hombreOrquesta.tocar();
	}	
	
}
