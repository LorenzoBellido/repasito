package electrodomesticos;

public class Lavadora extends Electrodomestico {

	private double carga = 5;

	public Lavadora() {

	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Lavadora(double precioBase, String colores, char consumoEnergetico, double peso, double carga) {
		super(precioBase, colores, consumoEnergetico, peso);
		if(carga > 0) {
			this.carga = carga;
		}
	}

	public double getCarga() {
		return carga;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		if(carga >= 30) {
			super.precioBase += 50;
		}
	}
	
	@Override
	public String toString() {
		String cadena = super.toString();
		
		cadena += "Carga: " + this.carga + "\n";
		
		return cadena;
	}
}
