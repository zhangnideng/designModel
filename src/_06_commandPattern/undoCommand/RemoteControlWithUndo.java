package _06_commandPattern.undoCommand;

import _06_commandPattern.undoCommand.command.Command;
import _06_commandPattern.undoCommand.command.impl.NoCommand;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control ------\n");
        for(int i = 0; i < onCommands.length; i++){
            stringBuilder.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "   " + offCommands[i].getClass().getSimpleName() + "\n");
        }

        stringBuilder.append("undoCommand: " + undoCommand.getClass().getSimpleName());

        return stringBuilder.toString();
    }
}
