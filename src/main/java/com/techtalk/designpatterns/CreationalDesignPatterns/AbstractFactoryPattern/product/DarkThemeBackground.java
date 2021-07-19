package com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product;

public class DarkThemeBackground implements Background {
    @Override
    public String getBackgroundColor() {
        return "Black";
    }
}
