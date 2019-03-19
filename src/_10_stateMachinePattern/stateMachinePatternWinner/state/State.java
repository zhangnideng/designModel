package _10_stateMachinePattern.stateMachinePatternWinner.state;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
