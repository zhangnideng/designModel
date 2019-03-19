package _06_commandPattern.undoCommandWithStatus.command;

public interface Command {
    void execute();
    void undo();
}
