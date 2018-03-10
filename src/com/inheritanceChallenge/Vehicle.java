package com.inheritanceChallenge;

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

public class Vehicle {

	private String name;
	private String size;
	private int currentVel;
	private int currentDir;

	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentDir = 0;
		this.currentVel = 0;
	}

	public void steer(int direction) {
		this.currentDir += direction;
		System.out.println("Vehicle.steer() is steering at" + currentDir + "Angle");
	}

	public void move(int velocity, int direction) {
		currentDir = velocity;
		currentDir = direction;
		System.out.println("Vehicle.move() Moving at " + currentVel + "in direction " + currentDir);
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getCurrentVel() {
		return currentVel;
	}

	public int getCurrentDir() {
		return currentDir;
	}

	public void stop() {
		this.currentVel = 0;
	}
}