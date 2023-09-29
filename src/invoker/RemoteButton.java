package invoker;

import commands.Command;

public class RemoteButton {
    private Command command;

    public RemoteButton(Command newCommand) {
        this.command = newCommand;
    }

    public void press(){
        command.execute();
    }
}
