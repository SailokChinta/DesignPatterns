package com.techtalk.designpatterns.BehavioralPatterns.CommandPattern.Commands;

import com.techtalk.designpatterns.BehavioralPatterns.CommandPattern.Receiver.Music;

public class MusicOnCommand implements Command {
    private Music music;

    public MusicOnCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.increaseVolume();
    }

    @Override
    public void undo() {
        music.decreaseVolume();
    }
}
