package _06_commandPattern.undoCommand.command.impl;


import _06_commandPattern.undoCommand.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {}

    @Override
    public void undo() {}
}
