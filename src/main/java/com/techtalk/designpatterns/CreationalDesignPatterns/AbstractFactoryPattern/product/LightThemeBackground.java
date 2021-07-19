package com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product;

public class LightThemeBackground implements Background {
    @Override
    public String getBackgroundColor() {
        return "White";
    }
}
