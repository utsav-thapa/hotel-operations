package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    int numberOfNights;
    boolean weekend;
    private int reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, int reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getReservationTotal() {
        return getPrice();
    }

    public double getPrice() {
        double price = 0;
        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        }
        else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        }
        if (weekend) {
            price = price * 1.1;
        }
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setRoomType(String roomType) {
        if (roomType.equalsIgnoreCase("king")) {
            this.roomType = roomType;
        } else if (roomType.equalsIgnoreCase("double")) {
            this.roomType = roomType;
        }
        else {
            System.err.println("Wrong room type.");
        }
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean isWeekend) {
        this.weekend = isWeekend;
    }
}
