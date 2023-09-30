package invoker;

import commands.Command;

public class Button {
    private Command command;

    public Button(Command newCommand) {
        this.command = newCommand;
    }

    public void press(){
        command.execute();
    }
}
