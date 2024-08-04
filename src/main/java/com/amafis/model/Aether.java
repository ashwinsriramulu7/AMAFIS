package com.amafis.model;
public class Aether extends Car {
    public Aether(int carId, String modelName) {
        super(carId, modelName);
    }
    @Override
    protected void defineParts() {
        addPart(new Part(401, "Engine", 1, 5300.0));
        addPart(new Part(402, "Wheels", 4, 870.0));
        addPart(new Part(403, "Chassis", 1, 7300.0));
    }
    @Override
    public String toString() {
        return "Aether [Car ID: " + getCarId() + ", Model Name: " + getModelName() + ", Parts: " + getParts() + "]";
    }
}
