package com.amafis.model;
public class Rapidus extends Car {
    public Rapidus(int carId, String modelName) {
        super(carId, modelName);
    }
    @Override
    protected void defineParts() {
        addPart(new Part(1, "Engine", 1, 6500.0));
        addPart(new Part(2, "Transmission", 1, 3600.0));
        addPart(new Part(3, "Wheel", 4, 560.0));
    }
}
