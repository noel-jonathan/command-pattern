package electronicdevices;

public class Radio implements ElectronicDevice {
    private int volume;

    @Override
    public void on() {
        System.out.println("Radio is on");
    }

    @Override
    public void off() {
        System.out.println("Radio is off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Radio volume up to " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Radio volume down to " + volume);
    }
}
