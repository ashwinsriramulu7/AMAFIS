package com.amafis.model;
public class Velox extends Car {
    public Velox(int carId, String modelName) {
        super(carId, modelName);
    }
    @Override
    protected void defineParts() {
        addPart(new Part(1, "Engine", 1, 7000.0));
        addPart(new Part(2, "Transmission", 1, 3800.0));
        addPart(new Part(3, "Wheel", 4, 580.0));
    }
}
