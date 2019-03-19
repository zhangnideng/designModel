package _04_factoryPattern.factorymethod.pizzastore.impl;

import _04_factoryPattern.factorymethod.pizza.Pizza;
import _04_factoryPattern.factorymethod.pizza.impl.ChicagoStyleCheesePizza;
import _04_factoryPattern.factorymethod.pizza.impl.ChicagoStyleClamPizza;
import _04_factoryPattern.factorymethod.pizza.impl.ChicagoStylePepperoniPizza;
import _04_factoryPattern.factorymethod.pizza.impl.ChicagoStyleVeggiePizza;
import _04_factoryPattern.factorymethod.pizzastore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
	public Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else{
        		return null;
			}
	}
}
