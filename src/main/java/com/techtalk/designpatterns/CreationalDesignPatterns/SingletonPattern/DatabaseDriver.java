package com.techtalk.designpatterns.CreationalDesignPatterns.SingletonPattern;

public class DatabaseDriver {

    private static DatabaseDriver databaseDriver;
    int id = 0;
    private DatabaseDriver() {
        this.id++;
    }

    public static DatabaseDriver getInstance() {
        if (databaseDriver == null) {
            return new DatabaseDriver();
        }

        return databaseDriver;
    }

    public int getId() {
        return id;
    }
}
