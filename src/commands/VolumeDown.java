package commands;

import electronicdevices.ElectronicDevice;

public class VolumeDown implements Command{
    private ElectronicDevice device;

    public VolumeDown(ElectronicDevice newDevice) {
        this.device = newDevice;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }
}
