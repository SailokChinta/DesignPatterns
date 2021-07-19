package com.techtalk.designpatterns.StructuralPatterns.FacadePattern.subsystem;

public class MacBook {

    int price = 100;

    int noOfUnitsSold = 100;

    int taxes = 100;

    int shippingCharges = 100;

    public Integer calculateNetProfit() {
        return (price - shippingCharges)*noOfUnitsSold - taxes;
    }

}
