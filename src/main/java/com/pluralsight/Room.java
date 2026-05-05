package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean available;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean dirty, boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = dirty;
        this.available = available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void setDirty(boolean isDirty) {
        this.isDirty = isDirty;
    }

    public void setAvailable(boolean isAvailable) {
        this.available = isAvailable;
    }
}
