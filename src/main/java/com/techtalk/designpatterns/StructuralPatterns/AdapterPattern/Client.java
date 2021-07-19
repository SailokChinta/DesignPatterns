package com.techtalk.designpatterns.StructuralPatterns.AdapterPattern;

public class Client {

    public static void main(String[] args) {
        ToyCar toyCar = new ToyCar();

        Vehicle toyCarAdapter = new ToyCarAdapter(toyCar);
        System.out.println(toyCarAdapter.getMileage());
    }
}
