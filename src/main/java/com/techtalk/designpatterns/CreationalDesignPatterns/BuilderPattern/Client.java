package com.techtalk.designpatterns.CreationalDesignPatterns.BuilderPattern;

import com.techtalk.designpatterns.CreationalDesignPatterns.BuilderPattern.Builder.Car;
import com.techtalk.designpatterns.CreationalDesignPatterns.BuilderPattern.Builder.CarBuilder;
import com.techtalk.designpatterns.CreationalDesignPatterns.BuilderPattern.Builder.TeslaCarBuilder;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        CarBuilder builder = new TeslaCarBuilder(car);

        car = builder.setColor("Red").addTyres("MRF Tyres").build();
        System.out.println(car.toString());

    }
}