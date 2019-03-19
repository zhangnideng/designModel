package _04_factoryPattern.factorymethod.pizzastore.impl;

import _04_factoryPattern.factorymethod.pizza.Pizza;
import _04_factoryPattern.factorymethod.pizza.impl.NYStyleCheesePizza;
import _04_factoryPattern.factorymethod.pizza.impl.NYStyleClamPizza;
import _04_factoryPattern.factorymethod.pizza.impl.NYStylePepperoniPizza;
import _04_factoryPattern.factorymethod.pizza.impl.NYStyleVeggiePizza;
import _04_factoryPattern.factorymethod.pizzastore.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(item.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else if(item.equals("clam")){
            return new NYStyleClamPizza();
        }else if(item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else{
            return null;
        }
    }
}
