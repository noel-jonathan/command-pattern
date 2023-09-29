package commands;

import electronicdevices.ElectronicDevice;

public class TurnOn implements Command{
    private ElectronicDevice aDevice;

    public TurnOn(ElectronicDevice newDevice) {
        this.aDevice = newDevice;
    }

    @Override
    public void execute() {
        aDevice.on();
    }
}
