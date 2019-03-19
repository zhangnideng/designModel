package _04_factoryPattern.factorymethod;

import _04_factoryPattern.factorymethod.pizza.Pizza;
import _04_factoryPattern.factorymethod.pizzastore.PizzaStore;
import _04_factoryPattern.factorymethod.pizzastore.impl.ChicagoPizzaStore;
import _04_factoryPattern.factorymethod.pizzastore.impl.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
