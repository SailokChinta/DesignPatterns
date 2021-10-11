package com.techtalk.designpatterns.CreationalDesignPatterns.BuilderPattern.Builder;

public interface CarBuilder {
    public CarBuilder addTyres(String tyres);
    public CarBuilder setColor(String color);
    public CarBuilder addInsurance(String insurance);
    public Car build();
}
