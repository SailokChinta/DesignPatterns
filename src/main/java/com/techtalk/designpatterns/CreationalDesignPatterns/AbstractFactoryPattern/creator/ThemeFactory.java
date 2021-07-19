package com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.creator;

import com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product.Background;
import com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product.Text;

public interface ThemeFactory {
    Background getBackground();
    Text getText();
}
