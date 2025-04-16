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
	double tamanho = maximoMultiplicador - minimoMultiplicador + 1;
	
	String[] tabuada = new String[(int) tamanho ];

		while (minimoMultiplicador <= maximoMultiplicador ) {
			double produto = multiplicando * minimoMultiplicador;
			System.out.println(multiplicando + " x " + minimoMultiplicador + " = " + produto);
			minimoMultiplicador = minimoMultiplicador + 1 ;
		}
		
	System.out.println("Fim");
	
}
}
