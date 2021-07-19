package com.techtalk.designpatterns.BehavioralPatterns.TemplateMethodPattern;

public class BeefBurger extends BurgerTemplate {

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
    }

    @Override
    protected void addBeef() {
        System.out.println("Adding Beef");
    }

    boolean wantChicken() {
        return false;
    }

    boolean wantBeef() {
        return true;
    }

}
