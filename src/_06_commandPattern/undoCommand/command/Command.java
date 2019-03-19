package _06_commandPattern.undoCommand.command;

public interface Command {
    void execute();
    void undo();
}
