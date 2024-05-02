package electrodomesticos;

public class Electrodomestico implements Comparable<Electrodomestico>{

	enum color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	enum consumo {
		A, B, C, D, E, F
	}

	protected double precioBase = 100;

	private color colores = color.BLANCO;

	private consumo consumoEnergetico = consumo.F;

	private double peso = 5;

	public Electrodomestico() {

	}

	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	public Electrodomestico(double precioBase, String colores, char consumoEnergetico, double peso) {
		this(precioBase, peso);
		comprobarColor(colores);
		comprobarConsumo(consumoEnergetico);
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public color getColores() {
		return colores;
	}

	public consumo getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	private void comprobarConsumo(char letra) {
		String guardarLetra = String.valueOf(letra);

		try {
			this.consumoEnergetico = consumo.valueOf(guardarLetra);
		} catch (IllegalArgumentException e) {
			this.consumoEnergetico = consumo.F;
		}
	}

	private void comprobarColor(String colorElec) {
		String guardarColor = colorElec;

		try {
			this.colores = color.valueOf(guardarColor);
		} catch (IllegalArgumentException e) {
			this.colores = color.BLANCO;
		}
	}

	public void precioFinal() {

		switch (this.consumoEnergetico) {
		case A -> {
			precioBase += 100;
		}
		case B -> {
			precioBase += 80;
		}
		case C -> {
			precioBase += 60;
		}
		case D -> {
			precioBase += 50;
		}
		case E -> {
			precioBase += 30;
		}
		case F -> {
			precioBase += 10;
		}
		}
		
		if(peso >= 0 && peso < 20) {
			precioBase += 10;
		}
		if(peso >= 20 && peso < 50) {
			precioBase += 50;
		}
		if(peso >= 50 && peso < 80) {
			precioBase += 80;
		}
		if(peso >= 80) {
			precioBase += 100;
		}
	}
	
	@Override
	public String toString() {
		String cadena = "-------------------------" + "\n";
		cadena += "Precio Base: " + precioBase + "\n"
				+"Color: " + colores + "\n"
				+"Consumo: " + consumoEnergetico + "\n"
				+ "Peso: " + peso + "\n"; 
				
		return cadena;
	}

	@Override
	public int compareTo(Electrodomestico o) {
		int comparar = 0;
		if(this.precioBase < o.precioBase) {
			comparar = -1;
		}
		if(this.precioBase > o.precioBase) {
			comparar = 1;
		}
		
		return comparar;
	}

}
