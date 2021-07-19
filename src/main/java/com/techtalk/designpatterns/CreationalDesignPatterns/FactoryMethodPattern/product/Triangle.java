package com.techtalk.designpatterns.CreationalDesignPatterns.FactoryMethodPattern.product;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}
