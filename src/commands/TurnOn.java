package commands;

import electronicdevices.ElectronicDevice;

public class TurnOn implements Command{
    private ElectronicDevice device;

    public TurnOn(ElectronicDevice newDevice) {
        this.device = newDevice;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
