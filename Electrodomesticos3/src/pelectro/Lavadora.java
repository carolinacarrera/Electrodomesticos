package pelectro;

public class Lavadora extends Electrodomestico {

	//Constantes
	private static final int cargaDefinida = 5;

	//Atributos de la clase
	private int cargaLavadora;

	//Getters de todos los atributos

	public int getCargaDefinida() {
		return cargaDefinida;
	}

	public int getCargaLavadora() {
		return cargaLavadora;
	}


	/**
	 *
	 * Constructores de la clase, constructor de la clase padre
	 * @param precioBase Precio de base
	 * @param peso Peso
	 * @param color Color del electrodomestico
	 * @param consumoEnergetico Consumo energetico del electrodomestico
	 * @param cargaLavadora Carga de la Lavadora
	 */

	//Constructor por defecto	

	
	//Constructor con dos atributos precioBase y peso

	public Lavadora() {
		super();
		this.cargaLavadora = cargaDefinida;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Lavadora(double precioBase, String color, double peso, char consumoEnergetico) {
		super(precioBase, color, peso, consumoEnergetico);
	}



	//Metodos
	public double precioFinal() {
		int precioConCarga=0;
		if (cargaLavadora >=30)
			precioConCarga += 50;
		return super.precioFinal() + precioConCarga;

	} //cierre metodo precioFinal
	
}
