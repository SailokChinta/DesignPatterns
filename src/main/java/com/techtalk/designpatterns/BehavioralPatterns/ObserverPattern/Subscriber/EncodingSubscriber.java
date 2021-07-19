package com.techtalk.designpatterns.BehavioralPatterns.ObserverPattern.Subscriber;

public class EncodingSubscriber implements Subscriber {
    static int id = 0;
    private String name;

    public EncodingSubscriber() {
        id++;
        this.name = this.getClass() + "_" + id;
    }

    @Override
    public void update() {
        System.out.println("Starting to encode the movie");
    }

    @Override
    public String getName() {
        return name;
    }
}
