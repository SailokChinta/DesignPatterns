package com.techtalk.designpatterns.StructuralPatterns.DecoratorPattern.decorators;

import com.techtalk.designpatterns.StructuralPatterns.DecoratorPattern.Laptop;

public class RAMDecorator implements LaptopDecorator {

    private Laptop laptop;

    public RAMDecorator(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public Integer getCost() {
        System.out.println("Adding extra RAM");
        return laptop.getCost() + 5;
    }

}
