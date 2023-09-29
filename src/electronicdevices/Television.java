package electronicdevices;

public class Television implements ElectronicDevice {
    private int volume;

    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV volume up to " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("TV volume down to " + volume);
    }
}
