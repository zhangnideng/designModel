package _06_commandPattern.undoCommandWithStatus.command.impl;


import _06_commandPattern.undoCommandWithStatus.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {}

    @Override
    public void undo() {}
}
