package CommandPattern.Commands.LightCommand;

import CommandPattern.Interfaces.Command;
import CommandPattern.Recievers.Light;

// Command
public class LightOnCommand implements Command {

    private Light light;

    public  LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
