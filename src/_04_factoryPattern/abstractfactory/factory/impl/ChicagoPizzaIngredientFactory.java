package _04_factoryPattern.abstractfactory.factory.impl;

import _04_factoryPattern.abstractfactory.factory.PizzaIngredientFactory;
import _04_factoryPattern.abstractfactory.ingredient.*;
import _04_factoryPattern.abstractfactory.ingredient.cheese.MozzarellaCheese;
import _04_factoryPattern.abstractfactory.ingredient.clams.FrozenClams;
import _04_factoryPattern.abstractfactory.ingredient.dough.ThickCrustDough;
import _04_factoryPattern.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import _04_factoryPattern.abstractfactory.ingredient.sauce.PlumTomatoSauce;
import _04_factoryPattern.abstractfactory.ingredient.veggies.BlackOlives;
import _04_factoryPattern.abstractfactory.ingredient.veggies.Eggplant;
import _04_factoryPattern.abstractfactory.ingredient.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}
}
