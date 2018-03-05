package com.deltonmyalil;

/**
 *
 */
public class Car {
    private int doors;  //only available inside this class
    protected int wheels; //available throughout the package com.deltonmyalil
    public String model;  //available everywhere
    private String engine;
    private String color;

    public void setModel(String model) {
        this.model = model; //this means this class's model.
    }

    public String getModel() {
        return this.model;
    }
}
