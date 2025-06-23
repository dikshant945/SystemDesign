package CommandPattern;

import CommandPattern.Commands.LightCommand.LightOffCommand;
import CommandPattern.Commands.LightCommand.LightOnCommand;
import CommandPattern.Invokers.RemoteControlWithUndo;
import CommandPattern.Recievers.Light;

public class Client {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo(7);
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl.toString());
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
