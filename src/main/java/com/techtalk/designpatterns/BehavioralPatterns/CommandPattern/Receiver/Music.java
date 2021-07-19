package com.techtalk.designpatterns.BehavioralPatterns.CommandPattern.Receiver;

public class Music {
    private int volume;

    public void increaseVolume() {
        volume++;
        System.out.println("Increasing Volume to: " + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("Decreasing Volume to: " + volume);
    }
}
