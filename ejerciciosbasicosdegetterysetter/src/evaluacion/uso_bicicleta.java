package evaluacion;

public class uso_bicicleta {

	public static void main(String[] args) {
		bicicleta cubino = new bicicleta();
		System.out.println("La bicicleta tiene " + cubino.getnumRuedas() + " ruedas");
		System.out.println("La bicicleta tiene un tamaño de " + cubino.gettamaño() + " pulgadas");
		System.out.println("tiene un ancho " + cubino.gettipo());

		/* set sirve para llamarlo de otro archivo */
		System.out.println("\nLos métodos setters");
		cubino.setnumRuedas(3);
		cubino.settamaño(30);
		cubino.settipo("montaña");
		// después de modificar
		System.out.println("\nDespués de cambiar los atributos usando el método set");
		System.out.println("La bicicleta tiene " + cubino.getnumRuedas() + " ruedas");
		System.out.println("La bicicleta tiene un tamaño de " + cubino.gettamaño() + " pulgadas");
		System.out.println("Es una bicicleta de tipo " + cubino.gettipo());

	}

}
