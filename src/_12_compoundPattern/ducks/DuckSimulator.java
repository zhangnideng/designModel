package _12_compoundPattern.ducks;

import _12_compoundPattern.ducks.duck.Quackable;
import _12_compoundPattern.ducks.duck.impl.DuckCall;
import _12_compoundPattern.ducks.duck.impl.MallardDuck;
import _12_compoundPattern.ducks.duck.impl.RedheadDuck;
import _12_compoundPattern.ducks.duck.impl.RubberDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    public void simulate(){
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    private void simulate(Quackable duck){
        duck.quack();
    }
}
