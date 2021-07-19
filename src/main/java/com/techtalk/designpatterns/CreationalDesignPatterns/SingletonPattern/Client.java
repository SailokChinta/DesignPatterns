package com.techtalk.designpatterns.CreationalDesignPatterns.SingletonPattern;

public class Client {

    public static void main(String[] args) {
        // return only single object
        DatabaseDriver databaseDriver = DatabaseDriver.getInstance();
        System.out.println(databaseDriver.getId());
        DatabaseDriver databaseDriver2 = DatabaseDriver.getInstance();
        System.out.println(databaseDriver.getId());

    }
}
