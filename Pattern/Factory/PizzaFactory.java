package FactoryPattern;

public class PizzaFactory {
	public Pizza createPizza(String msg){
		if(msg.equals("Veggie"))
			return new VeggiePizza();
		if(msg.equals("Chicken"))
			return new ChickenPizza();		
		if(msg.equals("Cheese"))
			return new CheesePizza();
		else
			return null;
	}
	

}
