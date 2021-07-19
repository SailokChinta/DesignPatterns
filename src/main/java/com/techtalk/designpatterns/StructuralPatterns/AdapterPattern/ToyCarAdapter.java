package com.techtalk.designpatterns.StructuralPatterns.AdapterPattern;

public class ToyCarAdapter implements Vehicle {

    private ToyCar toyCar;

    public ToyCarAdapter(ToyCar toyCar) {
        this.toyCar = toyCar;
    }

    @Override
    public Integer getMileage() {
        return toyCar.getBatteryLife();
    }
}
