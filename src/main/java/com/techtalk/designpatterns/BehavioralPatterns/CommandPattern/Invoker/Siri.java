package com.techtalk.designpatterns.BehavioralPatterns.CommandPattern.Invoker;

import com.techtalk.designpatterns.BehavioralPatterns.CommandPattern.Commands.Command;

public class Siri {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void activate() {
        command.execute();
    }

    public void deactivate() {
        command.undo();
    }
}
