package _04_factoryPattern.abstractfactory.factory;

import _04_factoryPattern.abstractfactory.ingredient.*;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
