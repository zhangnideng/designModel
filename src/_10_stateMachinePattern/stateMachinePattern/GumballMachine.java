package _10_stateMachinePattern.stateMachinePattern;

import _10_stateMachinePattern.stateMachinePattern.state.State;
import _10_stateMachinePattern.stateMachinePattern.state.impl.HasQuarterState;
import _10_stateMachinePattern.stateMachinePattern.state.impl.NoQuarterState;
import _10_stateMachinePattern.stateMachinePattern.state.impl.SoldOutState;
import _10_stateMachinePattern.stateMachinePattern.state.impl.SoldState;

public class GumballMachine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = numberGumballs;
        if(numberGumballs > 0){
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0){
            count--;
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (state == soldOutState) {
            result.append("sold out");
        } else if (state == noQuarterState) {
            result.append("waiting for quarter");
        } else if (state == hasQuarterState) {
            result.append("waiting for turn of crank");
        } else if (state == soldState) {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }
}
