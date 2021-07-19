package com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.creator;

import com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product.LightThemeBackground;
import com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product.Background;
import com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product.Text;
import com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product.DarkThemeText;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Background getBackground() {
        return new LightThemeBackground();
    }

    @Override
    public Text getText() {
        return new DarkThemeText();
    }
}
