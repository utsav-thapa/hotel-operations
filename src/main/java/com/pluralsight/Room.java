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
    private boolean cleanedByHousekeeper;

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
        isAvailable();
    }


    public void setCheckIn(boolean checkIn) {
        if (checkIn) {
            if (!this.isDirty && !this.isOccupied) {
                checkIn();
            }
        } else {
            this.checkIn = false;
            this.isOccupied = false;
        }
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
        if (checkout) {
            checkout();
        }
    }

    public void setCleanRoom(boolean cleanRoom) {
        if (cleanRoom) {
            cleanRoom();
        } else {
            this.cleanRoom = false;
        }
    }

    public void cleanRoom() {
        if (!this.isOccupied) {
            isAvailable = true;
            isDirty = false;
            this.cleanedByHousekeeper = true;
            this.cleanRoom = true;
        }
        else {
            System.out.println("room is still occupied.");
        }
    }
    public boolean isAvailable() {
        if (!isDirty && !this.isOccupied && this.cleanedByHousekeeper) {
            this.isAvailable = true;
        } else {
            this.isAvailable = false;
        }
        return this.isAvailable;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }


    public boolean isClean() {
        return (!isDirty);
    }

    public void checkIn() {
        this.isOccupied = true;
        this.isDirty = true;
        this.checkIn = true;
    }

    public void checkout() {
        this.isOccupied = false;
        this.cleanedByHousekeeper = false;
    }

    public void cleanedByHousekeeper(boolean b) {
        this.cleanedByHousekeeper = b;
    }

    public boolean isCleanedByHousekeeper() {
        cleanedByHousekeeper = !isOccupied;
        return cleanedByHousekeeper;
    }
}