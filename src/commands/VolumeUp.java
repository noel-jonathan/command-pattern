package commands;

import electronicdevices.ElectronicDevice;

public class VolumeUp implements Command{
    private ElectronicDevice aDevice;

    public VolumeUp(ElectronicDevice newDevice) {
        this.aDevice = newDevice;
    }

    @Override
    public void execute() {
        aDevice.volumeUp();
    }
}
