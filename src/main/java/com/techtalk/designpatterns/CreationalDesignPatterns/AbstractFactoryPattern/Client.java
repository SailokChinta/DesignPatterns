package com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern;

import com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.creator.DarkThemeFactory;
import com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.creator.LightThemeFactory;
import com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.creator.ThemeFactory;
import com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product.Background;
import com.techtalk.designpatterns.CreationalDesignPatterns.AbstractFactoryPattern.product.Text;

public class Client {
    public static void applyTheme(ThemeFactory themeFactory) {
        Background background = themeFactory.getBackground();
        Text text = themeFactory.getText();
        System.out.println("Background color: " + background.getBackgroundColor());
        System.out.println("Text color: " + text.getTextColor());
    }

    public static void main(String[] args) {
        String theme = "LIGHT";
        ThemeFactory themeFactory = null;
        if (theme.equals("LIGHT")) {
            themeFactory = new LightThemeFactory();
        } else {
            themeFactory = new DarkThemeFactory();
        }

        applyTheme(themeFactory);
    }
}
