package br.edu.univas;

public class PizzaFactory {
	
	public static Pizza getPizza(String tamanho) {
		if(tamanho.equals("Pequena")) {
			return new Pequena();
		}
		if(tamanho.equals("Media")) {
			return new Media();
		}
		if(tamanho.equals("Grande")) {
			return new Grande();
		}
		return null;
	}

}
