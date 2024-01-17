package evaluacion;

public class bicicleta {

	private int numRuedas;
	private String tipo;
	private int tamaño;

	public bicicleta() {

		numRuedas = 2;
		tipo = "carretera";
		tamaño = 42;
	}

	public int getnumRuedas() {
		return numRuedas;
	}

	public String gettipo() {
		return tipo;
	}

	public int gettamaño() {
		return tamaño;
	}

	public void setnumRuedas(int newnumRuedas) {
		numRuedas = newnumRuedas;
	}

	public void settipo(String newtipo) {
		tipo = newtipo;
	}

	public void settamaño(int newtamaño) {
		tamaño = newtamaño;
	}
}

