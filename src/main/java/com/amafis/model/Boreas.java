package com.amafis.model;
public class Boreas extends Car {
    public Boreas(int carId, String modelName) {
        super(carId, modelName);
    }
    @Override
    protected void defineParts() {
        addPart(new Part(301, "Engine", 1, 5200.0));
        addPart(new Part(302, "Wheels", 4, 850.0));
        addPart(new Part(303, "Chassis", 1, 7200.0));
    }
    @Override
    public String toString() {
        return "Boreas [Car ID: " + getCarId() + ", Model Name: " + getModelName() + ", Parts: " + getParts() + "]";
    }
}
