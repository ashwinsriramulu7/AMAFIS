package com.amafis.model;
public class Part {
    private int partId;
    private String partName;
    private int quantity;
    private double price;
    public Part(int partId, String partName, int quantity, double price) {
        this.partId = partId;
        this.partName = partName;
        this.quantity = quantity;
        this.price = price;
    }
    public int getPartId() {
        return partId;
    }
    public String getPartName() {
        return partName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Part ID: " + partId + ", Part Name: " + partName + ", Quantity: " + quantity + ", Price: " + price;
    }
}
