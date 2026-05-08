package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
//    private int overTimeHours;
    private int regularHours;
//    private LocalDateTime punchTimeCard;

    private int punchInTime;
    private int punchOutTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    public double getTotalPay() {
        double totalPay;
        if (getOverTimeHours() != 0) {
             totalPay = (40 * payRate) + (getOverTimeHours() * 1.5 * payRate);
        } else {
            totalPay = regularHours * payRate;
        }

        return totalPay;
    }

    public int getRegularHours() {
        if (this.hoursWorked < 40) {
            regularHours = this.hoursWorked;
        }
        else {
            regularHours = 40;
        }

        return regularHours;
    }

    public int getOverTimeHours() {
        int overTimeHours;
        if (this.hoursWorked > 40) {
            overTimeHours = hoursWorked - 40;
        } else {
            overTimeHours = 0;
        }
        return overTimeHours;
    }
//    public void setPunchTimeCard(LocalDateTime time) {
//        int hour = time.getHour();
//    }
//    public void setHoursWorked() {
//
//        int hoursWorked = this.punchOutTime - this.punchInTime;
//    }

    public void punchIn(int time) {
        this.punchInTime = time;
    }

    public void punchOut(int time) {
        int todayHours = time - this.punchInTime;

        this.hoursWorked = todayHours + this.hoursWorked;

    }
    public int getHoursWorked() {
        return hoursWorked;
    }


}
