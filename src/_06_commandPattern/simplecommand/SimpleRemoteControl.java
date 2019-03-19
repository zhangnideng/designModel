package _06_commandPattern.simplecommand;


import _06_commandPattern.simplecommand.command.Command;

public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command){
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
