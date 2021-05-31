package concierto.teatros;

import concierto.instrumentos.Instrumento;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public void main(String[] args) {
		Instrumento tambor = new Instrumento("pow, pow, pow");
		Solista solista = new Solista();
		solista.setInstrumento(tambor);
		solista.tocar();
	}	
	
}
