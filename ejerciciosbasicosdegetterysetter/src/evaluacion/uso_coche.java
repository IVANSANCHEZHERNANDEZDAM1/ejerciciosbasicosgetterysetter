package evaluacion;

public class uso_coche {

	public static void main(String[] args) {
		/* Aqui hago que lea todas las caracteristicas del coche */

		coche Renault = new coche();
		System.out.println("Total de ruedas: " + Renault.getruedas());
		System.out.println("Tiene un largo de " + Renault.getlargo());
		System.out.println("tiene un ancho " + Renault.getancho());
		System.out.println("La capacidad del motor " + Renault.getmotor());
		System.out.println("El peso del coche es " + Renault.getpeso());
		/* set sirve para llamarlo de otro archivo */
		System.out.println("\nLos métodos setters");
		Renault.setruedas(5);
		Renault.setlargo(300);
		Renault.setancho(100);
		Renault.setmotor(600);
		Renault.setpeso(6000);
		// después de modificar
		System.out.println("\nDespués de cambiar los atributos usando el método set");
		System.out.println("Total de ruedas: " + Renault.getruedas());
		System.out.println("Tiene un largo de " + Renault.getlargo());
		System.out.println("tiene un ancho " + Renault.getancho());
		System.out.println("La capacidad del motor " + Renault.getmotor());
		System.out.println("El peso del coche es " + Renault.getpeso());

	}
}
