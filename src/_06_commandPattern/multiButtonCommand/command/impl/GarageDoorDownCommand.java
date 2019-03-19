package _06_commandPattern.multiButtonCommand.command.impl;

import _06_commandPattern.multiButtonCommand.command.Command;
import _06_commandPattern.multiButtonCommand.object.GarageDoor;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}
}
