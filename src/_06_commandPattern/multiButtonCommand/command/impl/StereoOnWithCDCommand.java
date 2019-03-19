package _06_commandPattern.multiButtonCommand.command.impl;

import _06_commandPattern.multiButtonCommand.command.Command;
import _06_commandPattern.multiButtonCommand.object.Stereo;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
