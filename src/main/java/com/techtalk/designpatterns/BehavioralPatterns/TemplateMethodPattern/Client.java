package com.techtalk.designpatterns.BehavioralPatterns.TemplateMethodPattern;

public class Client {
    public static void main(String[] args) {
        BurgerTemplate chickenBurger = new ChickenBurger();
        chickenBurger.makeBurger();
        BurgerTemplate beefBurger = new BeefBurger();
        beefBurger.makeBurger();
        BurgerTemplate vegBurger = new VegBurger();
        vegBurger.makeBurger();
    }
}
