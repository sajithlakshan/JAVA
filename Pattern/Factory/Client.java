package FactoryPattern;

public class Client {

	public static void main(String[] args) {
		PizzaFactory ob = new PizzaFactory();
		Pizza Pi = ob.createPizza("Veggie");
		Pi.servePizza();

	}

}
