package com.techtalk.designpatterns.BehavioralPatterns.CommandPattern;

import com.techtalk.designpatterns.BehavioralPatterns.CommandPattern.Commands.Command;
import com.techtalk.designpatterns.BehavioralPatterns.CommandPattern.Commands.MusicOnCommand;
import com.techtalk.designpatterns.BehavioralPatterns.CommandPattern.Invoker.Siri;
import com.techtalk.designpatterns.BehavioralPatterns.CommandPattern.Receiver.Music;

public class Client {
    public static void main(String[] args) {
        Siri siri = new Siri();
        Music music = new Music();
        Command command = new MusicOnCommand(music);
        siri.setCommand(command);
        siri.activate();

        siri.activate();
        siri.deactivate();
    }
}
