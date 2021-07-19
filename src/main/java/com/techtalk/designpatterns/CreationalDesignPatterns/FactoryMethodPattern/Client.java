package com.techtalk.designpatterns.CreationalDesignPatterns.FactoryMethodPattern;

import com.techtalk.designpatterns.CreationalDesignPatterns.FactoryMethodPattern.creator.ShapeFactoryImpl;
import com.techtalk.designpatterns.CreationalDesignPatterns.FactoryMethodPattern.creator.ShapeFactory;
import com.techtalk.designpatterns.CreationalDesignPatterns.FactoryMethodPattern.product.Shape;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactoryImpl();
        Shape shape = shapeFactory.getShape("TRIANGLE");
        shape.draw();
    }
}
