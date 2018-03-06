package com.inheritanceDemo;

public class Dog extends Animals {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {  //generated (ALT+INSERT) a constructor involving all variables, then add the extra fields you defined here in this daughter class
        super(name, 1, 1, size, weight); //to get the attributes of the parent class along with it
        this.eyes = eyes;  // Added in the extras
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    @Override
    public void eat() {  //defining an overriding method  // public access
        System.out.println("My dog " + getName() + "is eating by chewing his food");
        super.eat();  //calling the superclass's eat method inside this overriden method - optional if you want to also execute the code in the superclass's method pf the same name
    }

    @Override
    public void move(int speed) {
        System.out.println("overriden method dog.move() called with parameter " + speed);
    }

    public void walk() {
        System.out.println("Dog walking");
        move(3); // the overriden move() method from this class if called
    }

    public void run() {
        System.out.println("Dog running");
        super.move(8); //the move method from the super class is called
    }

                // this is the difference between move() and super.move()
}
