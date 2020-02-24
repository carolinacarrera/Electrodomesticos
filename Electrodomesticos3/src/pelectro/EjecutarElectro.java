package pelectro;

public class EjecutarElectro {

	public static void main(String[] args) {

		// lista de electrodomesticos
		Electrodomestico listaElectrodomesticos[] = new Electrodomestico [10];

		//valores de la lista asignando valores
		listaElectrodomesticos [0] = new Electrodomestico (700,"Blanco",25,'C');
		listaElectrodomesticos [1] = new Lavadora (40, 400,"Blanco",38,'F');
		listaElectrodomesticos [2] = new Television (300,"Negro",23,'B', 39, true);
		listaElectrodomesticos [3] = new Lavadora (5, 500,"Blanco",40,'D');
		listaElectrodomesticos [4] = new Television (325,"Gris",28,'E',55, false);
		listaElectrodomesticos [5] = new Electrodomestico ();
		listaElectrodomesticos [6] = new Television (656,28);
		listaElectrodomesticos [7] = new Lavadora (135,38);
		listaElectrodomesticos [8] = new Lavadora (7,280,"Blanco",39,'A');
		listaElectrodomesticos [9] = new Television (200,20);

		double sumaElectrodomesticos = 0;
		double sumaLavadora = 0;
		double sumaTelevision = 0;

		for (int i = 0; i<listaElectrodomesticos.length; i++) {


			if(listaElectrodomesticos[i] instanceof Electrodomestico) {
				sumaElectrodomesticos += listaElectrodomesticos[i].precioFinal();
			}

			if(listaElectrodomesticos[i] instanceof Lavadora) {
				sumaLavadora += listaElectrodomesticos[i].precioFinal();
			}

			if(listaElectrodomesticos[i] instanceof Television) {
				sumaTelevision += listaElectrodomesticos[i].precioFinal();	
			}



		} //cierre ciclo for
		System.out.println("Suma de electrodomesticos " + sumaElectrodomesticos);
		System.out.println("Suma de lavadoras " + sumaLavadora);
		System.out.println("Suma de televisores " + sumaTelevision);
	}//cierre metodo main
}
