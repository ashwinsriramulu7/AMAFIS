package com.amafis.model;
public class Luminous extends Car {
    public Luminous(int carId, String modelName) {
        super(carId, modelName);
    }
    @Override
    protected void defineParts() {
        addPart(new Part(1, "Engine", 1, 6000.0));
        addPart(new Part(2, "Transmission", 1, 3400.0));
        addPart(new Part(3, "Wheel", 4, 540.0));
    }
}
