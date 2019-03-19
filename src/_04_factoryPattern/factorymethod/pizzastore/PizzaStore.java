package _04_factoryPattern.factorymethod.pizzastore;

import _04_factoryPattern.factorymethod.pizza.Pizza;

public abstract class PizzaStore {
    public final Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
