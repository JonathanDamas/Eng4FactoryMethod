package br.edu.univas;

public class App {

	public static void main(String[] args) {
		
		Pizza pizzaPequena = PizzaFactory.getPizza("Pequena");
		Pizza pizzaMedia = PizzaFactory.getPizza("Media");
		Pizza pizzaGrande = PizzaFactory.getPizza("Grande");
		
		System.out.println(pizzaPequena.getPreco());
		System.out.println(pizzaMedia.getPreco());
		System.out.println(pizzaGrande.getPreco());

	}

}
