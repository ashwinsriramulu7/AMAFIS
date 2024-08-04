package com.amafis.model;
public class Manufacturer extends User {
    public Manufacturer(int userId, String username, String password) {
        super(userId, username, password);
    }
    @Override
    public String getRole() {
        return "Manufacturer";
    }
    public void manufactureCar(Car car, Inventory inventory) {
        for (Part part : car.getParts()) {
            inventory.subtractPart(part.getPartId(), part.getQuantity());
        }
    }
}
