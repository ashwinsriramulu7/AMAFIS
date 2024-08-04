package com.amafis.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    private int carId;
    private String modelName;
    private List<Part> parts;

    public Car(int carId, String modelName) {
        this.carId = carId;
        this.modelName = modelName;
        this.parts = new ArrayList<>();
        defineParts();
    }

    public int getCarId() {
        return carId;
    }

    public String getModelName() {
        return modelName;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void addPart(Part part) {
        this.parts.add(part);
    }

    public void removePart(Part part) {
        this.parts.remove(part);
    }

    // Abstract method to define parts required for the car model
    protected abstract void defineParts();

    @Override
    public String toString() {
        return "Car ID: " + carId + ", Model Name: " + modelName + ", Parts: " + parts;
    }
}
