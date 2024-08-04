package com.amafis.model;
public class Zephyrus extends Car {
    public Zephyrus(int carId, String modelName) {
        super(carId, modelName);
    }
    @Override
    protected void defineParts() {
        addPart(new Part(101, "Engine", 1, 5000.0));
        addPart(new Part(102, "Wheels", 4, 800.0));
        addPart(new Part(103, "Chassis", 1, 7000.0));
    }
    @Override
    public String toString() {
        return "Zephyrus [Car ID: " + getCarId() + ", Model Name: " + getModelName() + ", Parts: " + getParts() + "]";
    }
}
