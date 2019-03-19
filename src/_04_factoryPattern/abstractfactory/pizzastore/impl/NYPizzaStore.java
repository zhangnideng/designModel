package _04_factoryPattern.abstractfactory.pizzastore.impl;

import _04_factoryPattern.abstractfactory.factory.PizzaIngredientFactory;
import _04_factoryPattern.abstractfactory.factory.impl.NYPizzaIngredientFactory;
import _04_factoryPattern.abstractfactory.pizza.Pizza;
import _04_factoryPattern.abstractfactory.pizza.impl.CheesePizza;
import _04_factoryPattern.abstractfactory.pizza.impl.ClamPizza;
import _04_factoryPattern.abstractfactory.pizza.impl.PepperoniPizza;
import _04_factoryPattern.abstractfactory.pizza.impl.VeggiePizza;
import _04_factoryPattern.abstractfactory.pizzastore.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }else if(item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}
