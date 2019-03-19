package _06_commandPattern.simplecommand.command.impl;

import _06_commandPattern.simplecommand.command.Command;
import _06_commandPattern.simplecommand.object.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}
}
