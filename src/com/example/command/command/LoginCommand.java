package com.example.command.command;

import com.example.command.receiver.Receiver;

/**
 * login Command
 * @author Akmzing
 */
public class LoginCommand extends Command {

    private Receiver receiver;

    public LoginCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doLogin();
    }
}
