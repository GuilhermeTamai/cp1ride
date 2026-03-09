package br.com.cp1ride.main;

import br.com.cp1ride.model.Veiculo;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		v1.setIndividuo("Carlos");
		v1.setPlaca("ABC-1234");
		v1.setGasolina(10);
		v1.adicionarGasolina(50);
		v1.gastarGasolina(30);
		System.out.println("Dono: " + v1.getIndividuo() + " | Placa: " + v1.getPlaca() + " | Gasolina: " + v1.getGasolina());

		
		

	}

}
