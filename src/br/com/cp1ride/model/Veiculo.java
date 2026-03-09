package br.com.cp1ride.model;

public class Veiculo {
	
	private String individuo;
	private String placa;
	private double gasolina;
	
	public void adicionarGasolina(double quantidade) {
		if (quantidade > 0) {
		gasolina = gasolina += quantidade;
	}
}
	public void gastarGasolina(double quantidade) {
		if (quantidade > 0 && quantidade <= gasolina) {
		gasolina = gasolina -= quantidade;
	}
}
	public String getIndividuo() {
	    return individuo;
}
	public void setIndividuo(String individuo) {
	    this.individuo = individuo;
	        }
	public String getPlaca() {
	    return placa;
}
	public void setPlaca(String placa) {
		this.placa = placa;
}
	public double getGasolina () {
		return gasolina;
}
	public void setGasolina(double gasolina) {
		if (gasolina >= 0) {
			this.gasolina = gasolina;	
	
	}
}
}