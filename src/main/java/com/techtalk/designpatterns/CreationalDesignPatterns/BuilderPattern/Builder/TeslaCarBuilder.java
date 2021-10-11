package com.techtalk.designpatterns.CreationalDesignPatterns.BuilderPattern.Builder;

public class TeslaCarBuilder implements CarBuilder {
    private Car car;

    public TeslaCarBuilder(Car car) {
        this.car = car;
    }

    @Override
    public CarBuilder addTyres(String tyres) {
        this.car.setTyres(tyres);
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.car.setColor(color);
        return this;
    }

    @Override
    public CarBuilder addInsurance(String insurance) {
        this.car.setInsurance(insurance);
        return this;
    }

    @Override
    public Car build() {
        return this.car;
    }
}
