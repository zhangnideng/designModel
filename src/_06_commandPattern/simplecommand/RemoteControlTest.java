package _06_commandPattern.simplecommand;

import _06_commandPattern.simplecommand.command.impl.GarageDoorOpenCommand;
import _06_commandPattern.simplecommand.command.impl.LightOnCommand;
import _06_commandPattern.simplecommand.object.GarageDoor;
import _06_commandPattern.simplecommand.object.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
