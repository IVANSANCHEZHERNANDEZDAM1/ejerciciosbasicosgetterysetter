package evaluacion;

public class coche {
	/* Aqui pongo lo que tiene ese objeto */

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;

	public coche() {

		/* Aqui se introducen todos los datos de ese objeto */

		ruedas = 4;
		largo = 400;
		ancho = 250;
		motor = 200;
		peso = 1900;

	}

	/*
	 * El String es un GETTER que se utiliza para que pueda funcionar ya que es
	 * privado el int de motor
	 */
	public int getmotor() {
		/* Este return se necesita para que funcione */
		return motor;
	}

	public int getpeso() {
		return peso;
	}

	public int getancho() {
		return ancho;
	}

	public int getlargo() {
		return largo;
	}

	public int getruedas() {
		return ruedas;

		/*
		 * El String es un setter que se utiliza para que pueda funcionar ya que es
		 * privado el int de motor
		 */
	}

	public void setmotor(int newmotor) {
		/* Este this se necesita para que funcione */
		motor = newmotor;
	}

	public void setpeso(int newpeso) {
		peso = newpeso;
	}

	public void setancho(int newancho) {
		ancho = newancho;
	}

	public void setlargo(int newlargo) {
		largo = newlargo;
	}

	public void setruedas(int newrueda) {
		ruedas = newrueda;
		System.out.println("HOla");
	}
}
