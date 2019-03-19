package _04_factoryPattern.abstractfactory.pizzastore.impl;

import _04_factoryPattern.abstractfactory.factory.PizzaIngredientFactory;
import _04_factoryPattern.abstractfactory.factory.impl.ChicagoPizzaIngredientFactory;
import _04_factoryPattern.abstractfactory.pizza.Pizza;
import _04_factoryPattern.abstractfactory.pizza.impl.CheesePizza;
import _04_factoryPattern.abstractfactory.pizza.impl.ClamPizza;
import _04_factoryPattern.abstractfactory.pizza.impl.PepperoniPizza;
import _04_factoryPattern.abstractfactory.pizza.impl.VeggiePizza;
import _04_factoryPattern.abstractfactory.pizzastore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
