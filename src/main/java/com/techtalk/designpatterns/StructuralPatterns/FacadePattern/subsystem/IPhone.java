package com.techtalk.designpatterns.StructuralPatterns.FacadePattern.subsystem;

public class IPhone {

    int price = 100;

    int noOfUnitsSold = 100;

    int taxes = 100;

    public Integer calculateNetProfit() {
        return price*noOfUnitsSold - taxes;
    }

}
