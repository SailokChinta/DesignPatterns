package com.techtalk.designpatterns.StructuralPatterns.FacadePattern;

public class Client {

    public static void main(String[] args) {
        AppleProfitCalculatorFacade appleProfitCalculatorFacade = new AppleProfitCalculatorFacade();
        int profit = appleProfitCalculatorFacade.calculateNetProfit();
        System.out.println("Apple Net Profit: " + profit);
    }

}
