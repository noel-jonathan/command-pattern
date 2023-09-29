package commands;

import electronicdevices.ElectronicDevice;

public class VolumeDown implements Command{
    private ElectronicDevice aDevice;

    public VolumeDown(ElectronicDevice newDevice) {
        this.aDevice = newDevice;
    }

    @Override
    public void execute() {
        aDevice.volumeDown();
    }
}
