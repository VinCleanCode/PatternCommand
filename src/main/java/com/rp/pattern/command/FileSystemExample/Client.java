package com.rp.pattern.command.FileSystemExample;

public class Client {

    public void assemble() {
        Receiver receiver = new Receiver();

        Command command = new ConcereteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.runCommand();
    }
}
