package _10_stateMachinePattern.stateMachinePatternWinner.state.impl;

import java.util.Random;

import _10_stateMachinePattern.stateMachinePatternWinner.GumballMachine;
import _10_stateMachinePattern.stateMachinePatternWinner.state.State;

//import java.util.Random;


public class HasQuarterState implements State {
	private Random randomWinner = new Random(System.currentTimeMillis());
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
		int winner = randomWinner.nextInt(10);
		if((winner == 0) && (gumballMachine.getCount() > 1)){
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else{
			gumballMachine.setState(gumballMachine.getSoldState());
		}
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
