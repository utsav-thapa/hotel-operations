package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;
    private boolean checkIn;
    private boolean checkout;
    private boolean cleanRoom;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    //TODO check again for logical error
    public void setAvailable(boolean available) {
        if (!isDirty && !this.isOccupied) {
            this.isAvailable = available;
        } else {
            this.isAvailable = !isAvailable;
        }
    }


    public void setCheckIn(boolean checkIn) {
        if (checkIn) {
            isOccupied = true;
            isDirty = true;
            this.checkIn = true;
        } else {
            this.checkIn = false;
        }
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    public void setCleanRoom(boolean cleanRoom) {
        if (cleanRoom) {
            isAvailable = true;
            isOccupied = false;
            isDirty = false;
            this.cleanRoom = true;
        } else {
            this.cleanRoom = false;
        }

    }
}
