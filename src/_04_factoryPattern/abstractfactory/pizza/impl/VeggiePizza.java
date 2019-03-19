package _04_factoryPattern.abstractfactory.pizza.impl;

import _04_factoryPattern.abstractfactory.factory.PizzaIngredientFactory;
import _04_factoryPattern.abstractfactory.pizza.Pizza;
import jdk.nashorn.internal.ir.annotations.Ignore;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}
}
