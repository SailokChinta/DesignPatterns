package com.techtalk.designpatterns.BehavioralPatterns.ObserverPattern.Publisher;

import com.techtalk.designpatterns.BehavioralPatterns.ObserverPattern.Subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class MoviePublisher implements Publisher {
    private List<Subscriber> subscribers;

    public MoviePublisher() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Adding a new subscriber " + subscriber.getName());
    }

    @Override
    public void unregisterSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Removing subscriber " + subscriber.getName());
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber s: subscribers) {
            s.update();
        }
    }

    @Override
    public void execute() {
        this.notifySubscriber();
    }
}
