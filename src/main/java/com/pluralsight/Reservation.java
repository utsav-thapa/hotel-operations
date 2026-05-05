package com.pluralsight;

public class Reservation {
    private String roomType;
    private int price;
    int numberOfNights;
    boolean weekend;
    private int reservationTotal;

    public Reservation(String roomType, int price, int numberOfNights, boolean weekend, int reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getReservationTotal() {
        return reservationTotal;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
}
