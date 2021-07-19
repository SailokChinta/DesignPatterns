package com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.creator;

import com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product.*;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Background getBackground() {
        return new LightThemeBackground();
    }

    @Override
    public Text getText() {
        return new LightThemeText();
    }
}
