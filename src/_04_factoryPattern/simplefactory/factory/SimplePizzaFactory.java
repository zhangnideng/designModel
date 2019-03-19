package _04_factoryPattern.simplefactory.factory;

import _04_factoryPattern.simplefactory.pizza.Pizza;
import _04_factoryPattern.simplefactory.pizza.impl.CheesePizza;
import _04_factoryPattern.simplefactory.pizza.impl.ClamPizza;
import _04_factoryPattern.simplefactory.pizza.impl.PepperoniPizza;
import _04_factoryPattern.simplefactory.pizza.impl.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
