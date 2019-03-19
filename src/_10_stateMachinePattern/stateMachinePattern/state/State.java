package _10_stateMachinePattern.stateMachinePattern.state;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
