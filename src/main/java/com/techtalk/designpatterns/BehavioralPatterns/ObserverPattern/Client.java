package com.techtalk.designpatterns.BehavioralPatterns.ObserverPattern;

import com.techtalk.designpatterns.BehavioralPatterns.ObserverPattern.Publisher.MoviePublisher;
import com.techtalk.designpatterns.BehavioralPatterns.ObserverPattern.Publisher.Publisher;
import com.techtalk.designpatterns.BehavioralPatterns.ObserverPattern.Subscriber.EncodingSubscriber;
import com.techtalk.designpatterns.BehavioralPatterns.ObserverPattern.Subscriber.MarketingSubscriber;
import com.techtalk.designpatterns.BehavioralPatterns.ObserverPattern.Subscriber.Subscriber;

public class Client {
    public static void main(String[] args) {
        Publisher moviePublisher = new MoviePublisher();

        Subscriber marketingSubscriber1 = new MarketingSubscriber();
        Subscriber marketingSubscriber2 = new MarketingSubscriber();
        Subscriber encodingSubscriber = new EncodingSubscriber();

        moviePublisher.registerSubscriber(marketingSubscriber1);
        moviePublisher.registerSubscriber(marketingSubscriber2);
        moviePublisher.registerSubscriber(encodingSubscriber);

        moviePublisher.execute();

        moviePublisher.unregisterSubscriber(marketingSubscriber2);

        moviePublisher.execute();
    }
}
