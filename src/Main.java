import electronicdevices.ElectronicDevice;
import electronicdevices.Radio;
import electronicdevices.Television;
import invoker.Remote;

public class Main {
    public static void main(String[] args) {
        ElectronicDevice myTV = new Television();
        Remote remote = new Remote(myTV);

        remote.pressOn();

        remote.pressVolumeUp();
        remote.pressVolumeUp();

        remote.pressVolumeDown();

        remote.pressOff();

/*      -----------------------------------------------------------------------------------------        */

        System.out.println("\n");

        ElectronicDevice myRadio = new Radio();

        remote = new Remote(myRadio);

        remote.pressOn();

        remote.pressVolumeUp();
        remote.pressVolumeUp();

        remote.pressVolumeDown();

        remote.pressOff();
    }
}