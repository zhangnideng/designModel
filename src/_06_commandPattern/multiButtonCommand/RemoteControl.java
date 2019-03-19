package _06_commandPattern.multiButtonCommand;

import _06_commandPattern.multiButtonCommand.command.Command;
import _06_commandPattern.multiButtonCommand.command.impl.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control ------\n");
        for(int i = 0; i < onCommands.length; i++){
            stringBuilder.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "   " + offCommands[i].getClass().getSimpleName() + "\n");
        }

        return stringBuilder.toString();
    }
}
