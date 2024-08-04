package com.amafis.model;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, Part> partsInventory;

    public Inventory() {
        this.partsInventory = new HashMap<>();
    }

    public void addPart(Part part) {
        partsInventory.put(part.getPartId(), part);
    }

    public void subtractPart(int partId, int quantity) {
        Part part = partsInventory.get(partId);
        if (part != null && part.getQuantity() >= quantity) {
            part.setQuantity(part.getQuantity() - quantity);
        } else {
            throw new IllegalArgumentException("Not enough parts in inventory");
        }
    }

    public Part getPart(int partId) {
        return partsInventory.get(partId);
    }

    @Override
    public String toString() {
        return "Inventory: " + partsInventory;
    }
}
