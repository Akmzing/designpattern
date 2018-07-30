package com.example.command.command;

import com.example.command.receiver.Receiver;

/**
 * register command
 * @author Akmzing
 */
public class RegisterCommand extends Command {

    private Receiver receiver;

    public RegisterCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doRegister();
    }
}
