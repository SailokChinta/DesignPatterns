package com.techtalk.designpatterns.StructuralPatterns.FacadePattern;

import com.techtalk.designpatterns.StructuralPatterns.FacadePattern.subsystem.AppleTV;
import com.techtalk.designpatterns.StructuralPatterns.FacadePattern.subsystem.MacBook;
import com.techtalk.designpatterns.StructuralPatterns.FacadePattern.subsystem.IPhone;

public class AppleProfitCalculatorFacade {

    IPhone iPhone = new IPhone();

    MacBook macBook = new MacBook();

    AppleTV appleTV = new AppleTV();

    public Integer calculateNetProfit() {
        return iPhone.calculateNetProfit() + macBook.calculateNetProfit() + appleTV.calculateNetProfit();
    }

}
