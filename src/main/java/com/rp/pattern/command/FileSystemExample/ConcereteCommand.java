package com.rp.pattern.command.FileSystemExample;

public class ConcereteCommand implements Command{
    private Receiver receiver = null;
    private String state;

    public ConcereteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }
}
