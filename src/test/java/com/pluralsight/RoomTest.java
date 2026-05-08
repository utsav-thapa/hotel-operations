package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn_dirty_occupied() {
        Room room = new Room(2, 1000.00);
        //room is dirty, occupied and has been cleaned by housekeeper
        room.setDirty(true);
        room.setOccupied(true);
        room.cleanedByHousekeeper(true);

        room.checkIn();

        Assertions.assertFalse(room.isAvailable());
    }
    @Test
    void checkIn_clean_available() {
        Room room = new Room(2, 1500.00);
        // room is clean, not occupied and cleaned by the housekeeper
        room.setDirty(false);
        room.setOccupied(false);
        room.cleanedByHousekeeper(true);
        room.setAvailable(true);


//        room.checkIn();

        Assertions.assertTrue(room.isAvailable());
    }

    @Test
    void checkIn_dirty_available() {
        Room room = new Room(3, 2500.00);
        //room is dirty, not occupied and cleaned by the housekeeper
        room.setDirty(true);
        room.setOccupied(false);
        room.cleanedByHousekeeper(true);

        Assertions.assertFalse(room.isAvailable());

    }

    @Test
    void checkout() {
        Room room = new Room(4, 2500.00);
        room.checkout();
//      checking if a room still shows up occupied if the guest checks out

        Assertions.assertFalse(room.isOccupied());
    }

    @Test
    void cleanroom() {
        Room room = new Room(3, 2500.00);
        room.setOccupied(false);

        room.cleanRoom();
        // checking if after a room is cleaned, does it show up dirty?
        Assertions.assertFalse(room.isDirty());

    }
}