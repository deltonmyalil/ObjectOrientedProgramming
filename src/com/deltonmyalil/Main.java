package com.deltonmyalil;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Car porsche = new Car(); //you have to initial any objects using the new keyword
        Car maruti = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
