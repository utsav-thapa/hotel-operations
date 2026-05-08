package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn_dirty_occupied() {
        Room room = new Room(2, 500.00);
        room.setDirty(true);
        room.setOccupied(true);

        room.checkIn();

        Assertions.assertTrue(room.isAvailable());
    }
    @Test
    void checkIn_clean_available() {
        Room room = new Room(2, 500.00);
        room.setDirty(false);
        room.setOccupied(false);
        room.cleanedByHousekeeper(true);

        room.checkIn();

        Assertions.assertTrue(room.isAvailable());
    }

    @Test
    void checkout() {
    }

    @Test
    void cleanroom() {

    }
}