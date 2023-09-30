package invoker;

import commands.TurnOff;
import commands.TurnOn;
import commands.VolumeDown;
import commands.VolumeUp;
import electronicdevices.ElectronicDevice;

public class Remote {
    private Button buttonOn;
    private Button buttonOff;
    private Button buttonVolumeUp;
    private Button buttonVolumeDown;

    public Remote(ElectronicDevice device) {
        this.buttonOn = new Button(new TurnOn(device));
        this.buttonOff = new Button(new TurnOff(device));
        this.buttonVolumeUp = new Button(new VolumeUp(device));
        this.buttonVolumeDown = new Button(new VolumeDown(device));
    }

    public void pressOn() {
        this.buttonOn.press();
    }

    public void pressOff() {
        this.buttonOff.press();
    }

    public void pressVolumeUp() {
        this.buttonVolumeUp.press();
    }

    public void pressVolumeDown() {
        this.buttonVolumeDown.press();
    }

}
