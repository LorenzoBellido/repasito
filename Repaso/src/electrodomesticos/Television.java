package electrodomesticos;

public class Television extends Electrodomestico {

	private int pulgadas = 20;
	
	private boolean sintonizador = false;

	public Television() {

	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Television(double precioBase, String colores, char consumoEnergetico, double peso, int pulgadas, boolean sintonizador){
		super(precioBase, colores, consumoEnergetico, peso);
		if(pulgadas > 0) {
			this.pulgadas = pulgadas;
		}
		this.sintonizador = sintonizador;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}
	
	public void precioFinal() {
		super.precioFinal();
		double incremento = precioBase * 0.3;
		if(pulgadas >= 40) {
			super.precioBase += incremento; 
		}
		if(sintonizador) {
			super.precioBase += 50;
		}
	}
	
	@Override
	public String toString() {
		String cadena = super.toString();
		
		cadena += "Carga: " + this.pulgadas + "\n"
				+ "Sintonizador: " + this.sintonizador + "\n";
		
		return cadena;
	}
}
