package commands;

import electronicdevices.ElectronicDevice;

public class TurnOff implements Command{
    private ElectronicDevice device;

    public TurnOff(ElectronicDevice newDevice) {
        this.device = newDevice;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
