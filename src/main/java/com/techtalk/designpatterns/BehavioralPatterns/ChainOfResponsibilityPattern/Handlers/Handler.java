package com.techtalk.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.Handlers;

public interface Handler {

    void setNextHandler(Handler nextHandler);

    void execute();

}
