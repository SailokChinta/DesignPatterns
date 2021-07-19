package com.techtalk.designpatterns.BehavioralPatterns.TemplateMethodPattern;

public class ChickenBurger extends BurgerTemplate {

    @Override
    protected void addKetchup() {
        System.out.println("Adding Ketchup");
    }

    @Override
    protected void addCheese() {
        System.out.println("Adding Cheese");
    }

    @Override
    protected void addChicken() {
        System.out.println("Adding Chicken");
    }

    @Override
    protected void addBeef() {
    }

}
