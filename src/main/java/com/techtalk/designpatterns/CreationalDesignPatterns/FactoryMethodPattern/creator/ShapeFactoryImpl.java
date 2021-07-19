package com.techtalk.designpatterns.CreationalDesignPatterns.FactoryMethodPattern.creator;

import com.techtalk.designpatterns.CreationalDesignPatterns.FactoryMethodPattern.product.Circle;
import com.techtalk.designpatterns.CreationalDesignPatterns.FactoryMethodPattern.product.Shape;
import com.techtalk.designpatterns.CreationalDesignPatterns.FactoryMethodPattern.product.Triangle;

import java.util.HashMap;

public class ShapeFactoryImpl implements ShapeFactory {
    @Override
    public Shape getShape(String shape) {
//        Imagine this data is dynamically loaded into the method
        HashMap<String, Shape> shapeRegistry = new HashMap<>();
        shapeRegistry.put("TRIANGLE", new Triangle());
        shapeRegistry.put("CIRCLE", new Circle());

        return shapeRegistry.get(shape);
    }
}
