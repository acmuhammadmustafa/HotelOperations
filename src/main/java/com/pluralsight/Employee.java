package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

    public Employee(int employeeID, String name, String department,double payRate , float hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * 1.5 * payRate);
    }

    public float getRegularHours() {
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public float getOvertimeHours() {
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                ", getTotalPay=" + getTotalPay() +
                ", getRegularHours=" + getRegularHours() +
                ", getOvertimeHours=" + getOvertimeHours() +

                '}';
    }
}
