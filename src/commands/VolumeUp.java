package commands;

import electronicdevices.ElectronicDevice;

public class VolumeUp implements Command{
    private ElectronicDevice device;

    public VolumeUp(ElectronicDevice newDevice) {
        this.device = newDevice;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
