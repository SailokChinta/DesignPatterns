package com.techtalk.designpatterns.StructuralPatterns.FacadePattern.subsystem;

public class AppleTV {

    int subscribers = 1000;

    int subscriberFee = 10;

    int productionCost = 100;

    int taxes = 100;

    public Integer calculateNetProfit() {
        return subscriberFee*subscribers - productionCost - taxes;
    }

}
