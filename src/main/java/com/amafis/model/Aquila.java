package com.amafis.model;
public class Aquila extends Car {
    public Aquila(int carId, String modelName) {
        super(carId, modelName);
    }
    @Override
    protected void defineParts() {
        addPart(new Part(201, "Engine", 1, 5500.0));
        addPart(new Part(202, "Wheels", 4, 900.0));
        addPart(new Part(203, "Chassis", 1, 7500.0));
    }
    @Override
    public String toString() {
        return "Aquila [Car ID: " + getCarId() + ", Model Name: " + getModelName() + ", Parts: " + getParts() + "]";
    }
}
