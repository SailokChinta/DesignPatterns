package com.techtalk.designpatterns.BehavioralPatterns.TemplateMethodPattern;

public abstract class BurgerTemplate {

    final void makeBurger() {
        roastBun();
        if (wantKetchup()) {
            addKetchup();
        }
        if (wantCheese()) {
            addCheese();
        }
        if (wantChicken()) {
            addChicken();
        }
        if (wantBeef()) {
            addBeef();
        }
        serveBurger();
    }


    private void roastBun() {
        System.out.println("Roasting the Dough");
    }

    protected abstract void addKetchup();
    protected abstract void addCheese();
    protected abstract void addChicken();
    protected abstract void addBeef();


    //    hooks
    boolean wantKetchup() {
        return true;
    }

    boolean wantCheese() {
        return true;
    }

    boolean wantChicken() {
        return true;
    }

    boolean wantBeef() {
        return false;
    }

    private void serveBurger() {
        System.out.println("Serving the Burger");
    }

}
