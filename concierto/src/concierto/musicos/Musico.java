package concierto.musicos;

import java.util.List;

import concierto.instrumentos.Instrumento;

public abstract class Musico implements MusicoInterface {

	private Instrumento instrumento;
	
	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	private List<Instrumento> instrumentos;
	
	@Override
	public abstract String tocar();

	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(List<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}

}
