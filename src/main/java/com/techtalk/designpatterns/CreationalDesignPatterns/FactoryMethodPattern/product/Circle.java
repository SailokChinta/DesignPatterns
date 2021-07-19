package com.techtalk.designpatterns.CreationalDesignPatterns.FactoryMethodPattern.product;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
