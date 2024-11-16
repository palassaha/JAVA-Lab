// Design a Payroll class that has fields for:
// a) employee’s name
// b) ID number
// c) hourly pay rate
// d) number of hours worked. 

// Write the appropriate accessor and mutator methods and a constructor that accept the
// employee’s name and ID number as arguments. The class should also
// have a method that returns the employee’s gross pay, which is calculated
// as the number of hours worked multiplied by the hourly pay rate. Write a
// program that demonstrates the class by creating a Payroll object, then
// asking the user to enter the data for an employee. The program should
// display the amount of gross pay earned.

import java.util.Scanner;

class Payroll {
    private String name;
    private String idNumber;
    private double hourlyRate;
    private double hoursWorked;

    public Payroll(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.hourlyRate = 0.0;
        this.hoursWorked = 0.0;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateGrossPay() {
        return hourlyRate * hoursWorked;
    }
}

public class PayrollDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee's ID number: ");
        String idNumber = scanner.nextLine();

        Payroll employee = new Payroll(name, idNumber);

        
        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = scanner.nextDouble();
        employee.setHourlyRate(hourlyRate);

        System.out.print("Enter number of hours worked: ");
        double hoursWorked = scanner.nextDouble();
        employee.setHoursWorked(hoursWorked);

        double grossPay = employee.calculateGrossPay();
        System.out.printf("Gross pay for %s (ID: %s) is: Rs.%.2f%n", employee.getName(), employee.getIdNumber(), grossPay);

        scanner.close();
    }
}

