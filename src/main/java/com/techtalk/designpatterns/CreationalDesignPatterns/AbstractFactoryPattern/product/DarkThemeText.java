package com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product;

public class DarkThemeText implements Text {
    @Override
    public String getTextColor() {
        return "White";
    }
}
