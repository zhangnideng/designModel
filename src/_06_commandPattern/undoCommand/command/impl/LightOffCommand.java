package _06_commandPattern.undoCommand.command.impl;

import _06_commandPattern.undoCommand.command.Command;
import _06_commandPattern.undoCommand.object.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
