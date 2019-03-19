package _10_stateMachinePattern.stateMachinePattern.state.impl;

//import java.util.Random;

import _10_stateMachinePattern.stateMachinePattern.GumballMachine;
import _10_stateMachinePattern.stateMachinePattern.state.State;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

    @Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

    @Override
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
    public void refill() { }

    @Override
	public String toString() {
		return "waiting for turn of crank";
	}
}
