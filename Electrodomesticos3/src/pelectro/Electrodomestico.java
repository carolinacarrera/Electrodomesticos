package pelectro;

public class Electrodomestico {

	//Constantes
	private static final double precioBaseDefinido = 100000;
	private static final String colorDefinido = "blanco";
	private static final double pesoDefinido = 5;
	private static final char consumoEnergeticoDefinido = 'F';

	//Atributos de la clase
	double precioBase;
	String color;
	double peso;
	char consumoEnergetico;


	//Getters de todos los atributos

	public double getPrecioBaseDefinido() {
		return precioBaseDefinido;
	}

	public String getColorDefinido() {
		return colorDefinido;
	}

	public double getPesoDefinido() {
		return pesoDefinido;
	}

	public char getConsumoEnergeticoDefinido() {
		return consumoEnergeticoDefinido;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public double getPeso() {
		return peso;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}


	//Constructor por defecto	
	public Electrodomestico() {
		this.precioBase = precioBaseDefinido;
		this.color = colorDefinido;
		this.peso = pesoDefinido;
		this.consumoEnergetico = consumoEnergeticoDefinido;
	}


	/**
	 *
	 * Constructor de la clase padre
	 * @param precioBase Precio de base
	 * @param peso Peso
	 */

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	/**
	 *
	 * Constructor de la clase padre
	 * @param precioBase Precio de base
	 * @param peso Peso
	 * @param color Color del electrodomestico
	 * @param consumoEnergetico Consumo energetico del electrodomestico
	 */

	public Electrodomestico(double precioBase, String color, double peso, char consumoEnergetico) {
		this.precioBase = precioBase;
		this.color = color;
		this.peso = peso;
		this.consumoEnergetico = consumoEnergetico;
	}


	//enumeracion de los colores
	public enum color {
		blanco,
		negro,
		rojo,
		azul,
		gris
	}

	//metodo para comprobar el consumo energetico segun el codigo

	public void comprobarConsumoEnergetico(char consumoEnergetico){
		if (consumoEnergetico == 'a' || consumoEnergetico == 'A' || 
				consumoEnergetico == 'b' || consumoEnergetico == 'B' || 
				consumoEnergetico == 'c' || consumoEnergetico == 'C' || 
				consumoEnergetico == 'd' || consumoEnergetico == 'D' || 
				consumoEnergetico == 'e' || consumoEnergetico == 'E' || 
				consumoEnergetico == 'f' || consumoEnergetico == 'F') {
			this.consumoEnergetico = consumoEnergetico;
		} else { 
			this.consumoEnergetico = consumoEnergeticoDefinido;

		}
	}

	//metodo colores disponibles a comprobar

	public void comprobarColor(String color) {
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || 
				color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("gris")) {
			this.color = color;
		} else { 
			this.color = colorDefinido;
		}
	} //cierre del metodo comprobarColor

	//ingresado el char, se inicia metodo precioConsumo
	public double precioFinal() {
		double precio = 0;
		switch (this.consumoEnergetico) {
		case 'A':
			precio += 100;
			break;

		case 'B':
			precio += 80;
			break;

		case 'C':
			precio += 60;
			break;

		case 'D':
			precio += 50;
			break;

		case 'E':
			precio += 30;
			break;

		case 'F':
			precio += 10;
			break;
		}



		//ingresado el peso

		if (peso >= 0 && peso <= 19) {
			precio += 10;
		} else if (peso >= 20 && peso <= 49) {
			precio += 50;
		} else if (peso <= 50 && peso >= 79) {
			precio += 80;
		} else if (peso > 80) {
			precio += 100;
		}
		return this.precioBase + precio;
	} //cierre del metodo precioFinal
}
