package _06_commandPattern.undoCommand.command.impl;

import _06_commandPattern.undoCommand.command.Command;
import _06_commandPattern.undoCommand.object.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.on();
    }

    @Override
    public void undo(){
        light.off();
    }
}
