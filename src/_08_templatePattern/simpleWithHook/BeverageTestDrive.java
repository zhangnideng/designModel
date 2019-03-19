package _08_templatePattern.simpleWithHook;


import _08_templatePattern.simple.entity.impl.Coffee;
import _08_templatePattern.simpleWithHook.entity.impl.CoffeeWithHook;
import _08_templatePattern.simpleWithHook.entity.impl.TeaWithHook;

public class BeverageTestDrive {
	public static void main(String[] args) {

		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
