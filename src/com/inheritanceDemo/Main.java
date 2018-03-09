package com.inheritanceDemo;

public class Main {

    public static void main(String[] args) {
        Animals genericAnimal = new Animals("generic animal", 1, 1, 5, 5);
        Dog toffy = new Dog("Toffy", 1, 1, 3, 20, 2, 4, 1, 32, "Black and Brown long");
        toffy.eat();
        toffy.walk();
        toffy.run();
    }
}
//checked out into linux Idea, git/commit test