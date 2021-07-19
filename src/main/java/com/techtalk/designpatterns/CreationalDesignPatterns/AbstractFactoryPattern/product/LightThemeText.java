package com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product;

public class LightThemeText implements Text {
    @Override
    public String getTextColor() {
        return "Black";
    }
}
