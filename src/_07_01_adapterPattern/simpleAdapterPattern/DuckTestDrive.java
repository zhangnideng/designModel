package _07_01_adapterPattern.simpleAdapterPattern;

import _07_01_adapterPattern.simpleAdapterPattern.duck.Duck;
import _07_01_adapterPattern.simpleAdapterPattern.duck.impl.MallardDuck;
import _07_01_adapterPattern.simpleAdapterPattern.duck.impl.TurkeyAdapter;
import _07_01_adapterPattern.simpleAdapterPattern.turkey.impl.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turnkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turnkeyAdapter.quack();
        turnkeyAdapter.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turnkeyAdapter);

    }

    private static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
