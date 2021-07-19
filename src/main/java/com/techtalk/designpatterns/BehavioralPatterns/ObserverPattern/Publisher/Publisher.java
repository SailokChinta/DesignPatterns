package com.techtalk.designpatterns.BehavioralPatterns.ObserverPattern.Publisher;

import com.techtalk.designpatterns.BehavioralPatterns.ObserverPattern.Subscriber.Subscriber;

public interface Publisher {
    void registerSubscriber(Subscriber subscriber);
    void unregisterSubscriber(Subscriber subscriber);
    void notifySubscriber();
    void execute();
}
