package com.techtalk.designpatterns.StructuralPatterns.DecoratorPattern;

public class MacBook implements Laptop {
    @Override
    public String getDescription() {
        return "I am Laptop";
    }

    @Override
    public Integer getCost() {
        return 10;
    }

}
