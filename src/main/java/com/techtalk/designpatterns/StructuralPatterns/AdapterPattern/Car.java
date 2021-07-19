package com.techtalk.designpatterns.StructuralPatterns.AdapterPattern;

public class Car implements Vehicle {

    @Override
    public Integer getMileage() {
        return 100;
    }

}
