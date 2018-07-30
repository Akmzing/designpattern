package com.example.command.invoker;

import com.example.command.command.Command;

/**
 * invoker
 * @author Amkzing
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
