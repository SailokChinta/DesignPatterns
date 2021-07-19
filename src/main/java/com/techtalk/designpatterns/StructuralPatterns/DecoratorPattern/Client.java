package com.techtalk.designpatterns.StructuralPatterns.DecoratorPattern;

import com.techtalk.designpatterns.StructuralPatterns.DecoratorPattern.decorators.HDDDecorator;
import com.techtalk.designpatterns.StructuralPatterns.DecoratorPattern.decorators.RAMDecorator;

public class Client {

    static Boolean isHDDRequired = true;
    static Boolean isRAMRequired = false;

    public static Laptop run() {
        Laptop macbook = new MacBook();

        if (isRAMRequired) {
            macbook = new RAMDecorator(macbook);
        }

        if (isHDDRequired) {
            macbook = new HDDDecorator(macbook);
        }

        return macbook;
    }

    public static void main(String[] args) {
        Laptop laptop = run();
        System.out.println("Total Laptop cost: " + laptop.getCost());
    }
}