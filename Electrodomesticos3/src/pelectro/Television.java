package pelectro;

public class Television extends Electrodomestico {

	//Constantes
	private static final int resolucionDefinida = 20;
	private static final boolean sintonizadorTDTDefinido = false;


	//Atributos de la clase
	int resolucion;
	boolean sintonizadorTDT;


	//Getters de todos los atributos

	public int getResolucionDefinida() {
		return resolucionDefinida;
	}


	public int getResolucion() {
		return resolucion;
	}


	public Television() {
		super();
		this.resolucion = resolucionDefinida;
		this.sintonizadorTDT = sintonizadorTDTDefinido;
	}


	/**
	 *
	 * Constructores de la clase, constructor de la clase padre
	 * @param precioBase Precio de base
	 * @param peso Peso
	 * @param color Color del electrodomestico
	 * @param consumoEnergetico Consumo energetico del electrodomestico
	 * @param resolucion Resolucion de la television
	 * @param sintonizadorTDT Sintonizador de la tele
	 */

	//constructor por defecto
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Television(double precioBase, String color, double peso, char consumoEnergetico) {
		super(precioBase, color, peso, consumoEnergetico);
	}

	public Television(int resolucion, boolean sintonizadorTDT) {
		super();
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}


	// metodos

	public double precioFinal() {
		double precio = 0;
		if (resolucion >= 40)
			precio += precioBase * 0.03 ;
		return precio;

	} //cierre metodo precioFinal
	
}
