package _06_commandPattern.multiButtonCommand.command.impl;

import _06_commandPattern.multiButtonCommand.command.Command;
import _06_commandPattern.multiButtonCommand.object.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}
}
