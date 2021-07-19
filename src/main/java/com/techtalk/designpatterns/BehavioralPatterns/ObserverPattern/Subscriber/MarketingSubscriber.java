package com.techtalk.designpatterns.BehavioralPatterns.ObserverPattern.Subscriber;

public class MarketingSubscriber implements Subscriber {
    static int id = 0;
    private String name;

    public MarketingSubscriber() {
        id++;
        this.name = this.getClass() + "_" + id;
    }

    @Override
    public void update() {
        System.out.println("Invoking marketing for the Movie");
    }

    @Override
    public String getName() {
        return name;
    }
}
