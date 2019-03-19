package _04_factoryPattern.abstractfactory.factory.impl;

import _04_factoryPattern.abstractfactory.factory.PizzaIngredientFactory;
import _04_factoryPattern.abstractfactory.ingredient.*;
import _04_factoryPattern.abstractfactory.ingredient.cheese.ReggianoCheese;
import _04_factoryPattern.abstractfactory.ingredient.clams.FreshClams;
import _04_factoryPattern.abstractfactory.ingredient.dough.ThinCrustDough;
import _04_factoryPattern.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import _04_factoryPattern.abstractfactory.ingredient.sauce.MarinaraSauce;
import _04_factoryPattern.abstractfactory.ingredient.veggies.Garlic;
import _04_factoryPattern.abstractfactory.ingredient.veggies.Mushroom;
import _04_factoryPattern.abstractfactory.ingredient.veggies.Onion;
import _04_factoryPattern.abstractfactory.ingredient.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
