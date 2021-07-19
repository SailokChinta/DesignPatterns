package com.techtalk.designpatterns.BehavioralPatterns.CommandPattern.Commands;

import com.techtalk.designpatterns.BehavioralPatterns.CommandPattern.Receiver.Music;

public class MusicOffCommand implements Command {
    private Music music;

    public MusicOffCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.decreaseVolume();
    }

    @Override
    public void undo() {
        music.increaseVolume();
    }
}