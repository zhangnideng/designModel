package _06_commandPattern.simplecommand.command.impl;

import _06_commandPattern.simplecommand.command.Command;
import _06_commandPattern.simplecommand.object.Light;

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
