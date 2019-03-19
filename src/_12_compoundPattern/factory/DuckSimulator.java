package _12_compoundPattern.factory;

import _12_compoundPattern.factory.abstractfactory.AbstractDuckFactory;
import _12_compoundPattern.factory.abstractfactory.impl.CountingDuckFactory;
import _12_compoundPattern.factory.duck.Goose;
import _12_compoundPattern.factory.duck.Quackable;
import _12_compoundPattern.factory.duck.impl.GooseAdapter;
import _12_compoundPattern.factory.duck.impl.QuackCounter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    public void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Abstract Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck){
        duck.quack();
    }
}
