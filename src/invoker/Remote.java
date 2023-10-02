package invoker;

import commands.*;
import electronicdevices.ElectronicDevice;

import java.util.Stack;

public class Remote {
    private Button buttonOn;
    private Button buttonOff;
    private Button buttonVolumeUp;
    private Button buttonVolumeDown;
    private Button undo;
    private Stack<Command> undoStack = new Stack<>();
    private ElectronicDevice assignedDevice;


    public Remote(ElectronicDevice device) {
        this.assignedDevice = device;
        this.buttonOn = new Button(new TurnOn(device));
        this.buttonOff = new Button(new TurnOff(device));
        this.buttonVolumeUp = new Button(new VolumeUp(device));
        this.buttonVolumeDown = new Button(new VolumeDown(device));
    }

    public void pressButtonOn() {
        this.buttonOn.press();
        undoStack.push(new TurnOn(assignedDevice));
    }

    public void pressButtonOff() {
        this.buttonOff.press();
        undoStack.push(new TurnOff(assignedDevice));
    }

    public void pressButtonVolumeUp() {
        this.buttonVolumeUp.press();
        undoStack.push(new VolumeUp(assignedDevice));
    }

    public void pressButtonVolumeDown() {
        this.buttonVolumeDown.press();
        undoStack.push(new VolumeDown(assignedDevice));
    }

    public void pressButtonUndo() {
        if (!undoStack.isEmpty()) {
            Command lastCommand = undoStack.pop();
            lastCommand.undo();
        }
    }

}
