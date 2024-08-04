package com.amafis.model;
public class Solus extends Car {
    public Solus(int carId, String modelName) {
        super(carId, modelName);
    }
    @Override
    protected void defineParts() {
        addPart(new Part(601, "Engine", 1, 5600.0));
        addPart(new Part(602, "Wheels", 4, 890.0));
        addPart(new Part(603, "Chassis", 1, 7500.0));
    }
    @Override
    public String toString() {
        return "Solus [Car ID: " + getCarId() + ", Model Name: " + getModelName() + ", Parts: " + getParts() + "]";
    }
}
