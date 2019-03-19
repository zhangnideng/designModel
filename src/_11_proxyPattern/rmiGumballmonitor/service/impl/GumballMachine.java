package _11_proxyPattern.rmiGumballmonitor.service.impl;


import _11_proxyPattern.rmiGumballmonitor.service.GumballMachineRemote;
import _11_proxyPattern.rmiGumballmonitor.state.State;
import _11_proxyPattern.rmiGumballmonitor.state.impl.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;
    private String location;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if(numberGumballs > 0){
            state = noQuarterState;
        }
        this.location = location;
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

    public State getWinnerState() {
		return winnerState;
	}

	@Override
	public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public State getState() {
        return state;
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
