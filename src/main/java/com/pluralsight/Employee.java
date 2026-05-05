package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int overTimeHours;
    private int regularHours;
    private double totalPay;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

        if (hoursWorked > 40) {
            this.overTimeHours = hoursWorked - 40;
            this.regularHours = 40;
            this.totalPay = (40 * payRate) + (overTimeHours * 1.5 * payRate);
        }
        else {
            this.regularHours = hoursWorked;
            this.totalPay = regularHours * payRate;
        }
    }

    public double getTotalPay() {
        return totalPay;
    }

    public int getRegularHours() {
        return regularHours;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }


}
