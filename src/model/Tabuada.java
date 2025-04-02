package model;

public class Tabuada {

	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMultiplicando() {
		return multiplicando;
	}

public void setMinimoMultiplicando(double minimomultiplicado) {
	this.minimoMultiplicador = minimomultiplicado;
}

public double getMinimoMultiplicando() {
	return minimoMultiplicador;
}

public void setMaximoMultiplicador(double maximomultiplicador) {
	this.maximoMultiplicador = maximomultiplicador;
}
public double getMaximoMultiplicador() {
	return maximoMultiplicador;
}
public void mostrarTabuada() {
	
	
	double produto = multiplicando * minimoMultiplicador;
		while (contador <= maximoMultiplicador ) {
			contador
			System.out.println(multiplicando + " x " + contador + " = " + produto);
			
			minimoMultiplicador = maximoMultiplicador + 1 ;
		}
		
	System.out.println("Fim");
	
}
}
