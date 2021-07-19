package com.techtalk.designpatterns.StructuralPatterns.DecoratorPattern.decorators;

import com.techtalk.designpatterns.StructuralPatterns.DecoratorPattern.Laptop;

public class HDDDecorator implements LaptopDecorator {

    private Laptop laptop;

    public HDDDecorator(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public Integer getCost() {
        System.out.println("Adding extra HDD");
        return laptop.getCost() + 10;
    }
}
