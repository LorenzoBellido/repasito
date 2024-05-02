package electrodomesticos;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		
		int electrodomestico = 0;
		int lavadora = 0;
		int television = 0;
		
		double sumaLavadora = 0;
		double sumaTelevision = 0;
		
		electrodomesticos[0] = new Electrodomestico(300, "NEGRO", 'A', 50);
		electrodomesticos[1] = new Electrodomestico(150, 45);
		electrodomesticos[2] = new Lavadora(200, "AZUL", 'E', 33, 10);
		electrodomesticos[3] = new Lavadora(175, 75);
		electrodomesticos[4] = new Television(240, "VERDE", 'G', 12, 35, true);
		electrodomesticos[5] = new Television(54, 102);
		electrodomesticos[6] = new Electrodomestico(300, "NEGRO", 'd', 50);
		electrodomesticos[7] = new Electrodomestico(150, 45);
		electrodomesticos[8] = new Lavadora(200, "feo", 'E', 33, 10);
		electrodomesticos[9] = new Lavadora(175, 75);
		
		for(Electrodomestico elec : electrodomesticos) {
			electrodomestico++;
			if(elec instanceof Lavadora) {
				sumaLavadora += elec.getPrecioBase();
				lavadora++;
			}else if(elec instanceof Television) {
				sumaTelevision += elec.getPrecioBase();
				television++;
			}
		}
		
		Arrays.sort(electrodomesticos);
		
		System.out.println(Arrays.toString(electrodomesticos));
		
		System.out.println("Electrodomésticos: " + electrodomestico + "\n"
							+ "Lavadoras: " + sumaLavadora + "\n"
							+ "Televisiones: " + television + "\n");
		
		
	}

}
