package com.example.command;

import com.example.command.command.Command;
import com.example.command.command.LoginCommand;
import com.example.command.command.RegisterCommand;
import com.example.command.invoker.Invoker;
import com.example.command.receiver.LoginReceiver;
import com.example.command.receiver.Receiver;
import com.example.command.receiver.RegisterReceiver;

/**
 * test client
 * @author Akmzing
 */
public class Client {
    public static void main(String[] args) {
        /**
         * invoker
         */
        Invoker invoker = new Invoker();

        /**
         * receiver
         */
        Receiver receiver = new LoginReceiver();
        Receiver receiver1 = new RegisterReceiver();

        /**
         * command
         */
        Command command = new LoginCommand(receiver);
        Command command1 = new RegisterCommand(receiver1);

        /**
         * execute loginCommand
         */
        invoker.setCommand(command);
        invoker.action();

        /**
         * execute registerCommand
         */
        invoker.setCommand(command1);
        invoker.action();
    }
}
