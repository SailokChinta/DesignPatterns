package com.techtalk.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern;

import com.techtalk.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.Handlers.AdminAuthorizeHandler;
import com.techtalk.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.Handlers.AuthenticateHandler;
import com.techtalk.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.Handlers.Handler;
import com.techtalk.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.Handlers.RateLimitHandler;

public class Client {

    public static void main(String[] args) {
        Handler authenticate = new AuthenticateHandler();
        Handler rateLimiter = new RateLimitHandler();
        Handler adminAuthorize = new AdminAuthorizeHandler();

//        If requests need Admin Authorization
        authenticate.setNextHandler(rateLimiter);
        rateLimiter.setNextHandler(adminAuthorize);
        authenticate.execute();
    }

}
