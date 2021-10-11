package com.techtalk.designpatterns.CreationalDesignPatterns.BuilderPattern.Builder;

public class Car {

    private String tyres;
    private String insurance;
    private String color;
    private String model;

    public Car() {
        this.model = "Tesla Model 3";
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tyres='" + tyres + '\'' +
                ", insurance='" + insurance + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}