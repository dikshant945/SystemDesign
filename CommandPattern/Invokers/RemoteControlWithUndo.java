package CommandPattern.Invokers;

import CommandPattern.Commands.NoCommand.NoCommand;
import CommandPattern.Interfaces.Command;


//waitress
public class RemoteControlWithUndo {
    private Command[] turnOnCommands;
    private Command[] turnOffCommands;
    private Command undoCommand;

    private NoCommand noCommand;

    public RemoteControlWithUndo(int slots) {
        turnOnCommands = new Command[slots];
        turnOffCommands = new Command[slots];
        noCommand = new NoCommand();

        for (int i = 0; i < slots; i++) {
            turnOffCommands[i] = noCommand;
            turnOnCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command turnOnCommand, Command turnOffCommand) {
        turnOnCommands[slot] = turnOnCommand;
        turnOffCommands[slot] = turnOffCommand;
    }


    public void onButtonWasPushed(int slot) {
        turnOnCommands[slot].execute();
        undoCommand = turnOnCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        turnOffCommands[slot].execute();
        undoCommand = turnOffCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------ Remote Control Slots ------\n");
        for (int i = 0; i < turnOnCommands.length; i++) {
            sb.append("[slot ")
                    .append(i)
                    .append("] ON: ")
                    .append(turnOnCommands[i].getClass().getSimpleName())
                    .append(" | OFF: ")
                    .append(turnOffCommands[i].getClass().getSimpleName())
                    .append("\n");
        }
        sb.append("[undo] Last command: ")
                .append(undoCommand.getClass().getSimpleName())
                .append("\n");
        return sb.toString();
    }


}
