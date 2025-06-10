package CommandPattern;

import CommandPattern.Commands.LightCommand.LightOffCommand;
import CommandPattern.Commands.LightCommand.LightOnCommand;
import CommandPattern.Invokers.SimpleRemoteControl;
import CommandPattern.Recievers.Light;

public class Client {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(7);
        Light kitchenLight = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand lightOffCommand = new LightOffCommand(kitchenLight);

        remote.setCommands(0, lightOnCommand, lightOffCommand);

        remote.onButtonWasPushed(0);
        remote.ofButtonWasPushed(0);

        remote.onButtonWasPushed(5);


    }
}
