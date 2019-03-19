package _06_commandPattern.multiButtonCommand.command.impl;

import _06_commandPattern.multiButtonCommand.command.Command;
import _06_commandPattern.multiButtonCommand.object.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.on();
    }
}
