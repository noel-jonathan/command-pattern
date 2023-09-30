import commands.TurnOff;
import commands.TurnOn;
import commands.VolumeDown;
import commands.VolumeUp;
import electronicdevices.ElectronicDevice;
import electronicdevices.Radio;
import electronicdevices.Television;
import invoker.RemoteButton;

public class Main {
    public static void main(String[] args) {
        ElectronicDevice myTV = new Television();

        TurnOn turnOnTV = new TurnOn(myTV);
        TurnOff turnOffTV = new TurnOff(myTV);
        VolumeUp volumeUpTV = new VolumeUp(myTV);
        VolumeDown volumeDownTV = new VolumeDown(myTV);


        RemoteButton buttonON = new RemoteButton(turnOnTV);
        RemoteButton buttonOFF = new RemoteButton(turnOffTV);
        RemoteButton buttonVolumeUp = new RemoteButton(volumeUpTV);
        RemoteButton buttonVolumeDown = new RemoteButton(volumeDownTV);

        buttonON.press();

        buttonVolumeUp.press();
        buttonVolumeUp.press();

        buttonVolumeDown.press();

        buttonOFF.press();

/*      -----------------------------------------------------------------------------------------        */

        System.out.println("\n");

        ElectronicDevice myRadio = new Radio();

        TurnOn turnOnRadio = new TurnOn(myRadio);
        TurnOff turnOffRadio = new TurnOff(myRadio);
        VolumeUp volumeUpRadio = new VolumeUp(myRadio);
        VolumeDown volumeDownRadio = new VolumeDown(myRadio);

        buttonON = new RemoteButton(turnOnRadio);
        buttonOFF = new RemoteButton(turnOffRadio);
        buttonVolumeUp = new RemoteButton(volumeUpRadio);
        buttonVolumeDown = new RemoteButton(volumeDownRadio);

        buttonON.press();

        buttonVolumeUp.press();
        buttonVolumeUp.press();

        buttonVolumeDown.press();

        buttonOFF.press();
    }
}