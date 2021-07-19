package com.techtalk.designpatterns.CreationalDesignPatterns.FactoryMethodPattern.creator;

import com.techtalk.designpatterns.CreationalDesignPatterns.FactoryMethodPattern.product.Shape;

public interface ShapeFactory {
    Shape getShape(String shape);
}
