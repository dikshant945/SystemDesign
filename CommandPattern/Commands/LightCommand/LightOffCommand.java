package CommandPattern.Commands.LightCommand;

import CommandPattern.Interfaces.Command;
import CommandPattern.Recievers.Light;


// Command
public class LightOffCommand implements Command {

    private Light light;

    public  LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
