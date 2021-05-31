package concierto.instrumentos;

public class Instrumento implements InstrumentoInterface {

	private String sonido;
	
	public String getSonido() {
		return sonido;
	}

	
	
	public Instrumento(String sonido) {
		super();
		this.sonido = sonido;
	}



	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public String sonar() {
		// TODO Auto-generated method stub
		return "Sonando...";
	}

}
