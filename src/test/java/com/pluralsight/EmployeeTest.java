package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    @Test
    void getHoursWorked() {
        Employee ut = new Employee(111,"UT","YUU",30.00);
        ut.punchIn(8);
        ut.punchOut(16);
        ut.punchIn(8);
        ut.punchOut(16);

        int expectedHours = 16;

        int actualHours = ut.getHoursWorked();

        Assertions.assertEquals(expectedHours,actualHours);
    }
}