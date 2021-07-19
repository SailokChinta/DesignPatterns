package com.techtalk.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.Handlers;

public class AuthenticateHandler implements Handler {
    private Handler handler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.handler = nextHandler;
    }

    @Override
    public void execute() {
//        Logic to check whether user exists
        boolean userExists = true;
        if (!userExists) {
            System.out.println("User does not exists");
            return;
        }
        System.out.println("User found");
        handler.execute();
    }
}
