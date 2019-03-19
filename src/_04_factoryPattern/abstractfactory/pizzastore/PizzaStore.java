package _04_factoryPattern.abstractfactory.pizzastore;

import _04_factoryPattern.abstractfactory.pizza.Pizza;

public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(String item);
 
	public final Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
