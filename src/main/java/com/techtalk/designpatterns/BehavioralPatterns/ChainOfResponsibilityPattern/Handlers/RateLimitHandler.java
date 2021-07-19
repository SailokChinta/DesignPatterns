package com.techtalk.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.Handlers;

public class RateLimitHandler implements Handler {
    private Handler handler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.handler = nextHandler;
    }

    @Override
    public void execute() {
//        Logic to check Rate Limiting
        int curAttempts = 1;
        int maxAttempts = 3;

        if (curAttempts > maxAttempts) {
            System.out.println("Maximum Attempts exceeded for this user");
            return;
        }
        System.out.println("Maximum Attempts are not exceeded for this user");
        handler.execute();
     }
}
