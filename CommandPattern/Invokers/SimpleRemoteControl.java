package CommandPattern.Invokers;

import CommandPattern.Commands.NoCommand.NoCommand;
import CommandPattern.Interfaces.Command;


//waitress
public class SimpleRemoteControl {
    private Command[] turnOnCommands;
    private Command[] turnOffCommands;

    private NoCommand noCommand;

    public SimpleRemoteControl(int slots) {
        turnOnCommands = new Command[slots];
        turnOffCommands = new Command[slots];
        noCommand = new NoCommand();

        for (int i = 0; i < slots; i++) {
            turnOffCommands[i] = noCommand;
            turnOnCommands[i] = noCommand;
        }
    }

    public void setCommands(int slot, Command turnOnCommand, Command turnOffCommand) {
        turnOnCommands[slot] = turnOnCommand;
        turnOffCommands[slot] = turnOffCommand;
    }


    public void onButtonWasPushed(int slot) {
        turnOnCommands[slot].execute();
    }

    public void ofButtonWasPushed(int slot) {
        turnOffCommands[slot].execute();
    }

}
