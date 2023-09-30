package invoker;

import commands.*;
import electronicdevices.ElectronicDevice;

public class Remote {
    private Button buttonOn;
    private Button buttonOff;
    private Button buttonVolumeUp;
    private Button buttonVolumeDown;
    private TurnOn turnOn;
    private TurnOff turnOff;
    private VolumeUp volumeUp;
    private VolumeDown volumeDown;

    public Remote(ElectronicDevice device) {
        this.turnOn = new TurnOn(device);
        this.turnOff = new TurnOff(device);
        this.volumeUp = new VolumeUp(device);
        this.volumeDown = new VolumeDown(device);
        this.buttonOn = new Button(this.turnOn);
        this.buttonOff = new Button(this.turnOff);
        this.buttonVolumeUp = new Button(this.volumeUp);
        this.buttonVolumeDown = new Button(this.volumeDown);
    }

    public void pressOn(){
        this.buttonOn.press();
    }

    public void pressOff(){
        this.buttonOff.press();
    }

    public void pressVolumeUp(){
        this.buttonVolumeUp.press();
    }
    public void pressVolumeDown(){
        this.buttonVolumeDown.press();
    }

}
