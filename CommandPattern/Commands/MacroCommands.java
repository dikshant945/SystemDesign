package CommandPattern.Commands;

import CommandPattern.Interfaces.Command;

public class MacroCommands implements Command {
    private Command[] commands;

    public MacroCommands(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        // Execute undo in reverse order
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}
