package _08_templatePattern.simple;

import _08_templatePattern.simple.entity.impl.Coffee;
import _08_templatePattern.simple.entity.impl.Tea;

public class Test {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
