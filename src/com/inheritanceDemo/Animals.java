package com.inheritanceDemo;

public class Animals {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animals(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal " + name + " is eating.");  //no need to mention this.name, simply put name
    }

    public void move(int speed) {
        System.out.println("move() method from the superclass called");
        System.out.println("Animal " + name + " is moving at " + speed + "kph.");
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
