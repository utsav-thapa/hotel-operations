package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(10,199);

        int beds = room.getNumberOfBeds();

        Employee ut = new Employee(1,"Utsav","App. Dev",40.00);

        ut.punchIn(1);
        ut.punchOut(50);

        System.out.println(ut.getTotalPay());

        room.setCleanRoom(false);

        System.out.println("is the room clean? " + !room.isDirty());

    }

}