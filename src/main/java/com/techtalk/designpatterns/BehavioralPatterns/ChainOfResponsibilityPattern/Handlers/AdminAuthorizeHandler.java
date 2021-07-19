package com.techtalk.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.Handlers;

public class AdminAuthorizeHandler implements Handler {
    private Handler handler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.handler = nextHandler;
    }

    @Override
    public void execute() {
        boolean isUserAdmin = false;
        if (!isUserAdmin) {
            System.out.println("User is Not Admin");
            return;
        }
        System.out.println("User is Admin");
        handler.execute();
    }
}
