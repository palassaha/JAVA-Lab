// Create an class Student with the following 
// Data member: 
// a. roll: int
// Methods: 
// a. setRoll(int) //take input 
// b. getRoll(): int //display data member

// Create a subclass Test and add the following details:
// Data members: 
// a. marks of subject1 (sub1):double b. marks of subject2 (sub2):double
// Methods: 
// a. setMarks(double, double) 
// b. getMarks() to display marks of two subjects

// Create interface Attendance with the following details:
// Data member: 
// a. Atten: int
// Method: 
// getAttendance()

// Create a class Result which extends Test class and implements Attendance
// with the following details:
// Data member: a. total: double
// Methods: 
// a. getAttendance() //implements interface (display atten)
// b. getTotal() //sub1+sub2+atten
// c. display()

// Create object of Result class and call the methods.

class Student {
    protected int roll;
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getRoll() {
        return roll;
    }
}

class Test extends Student {
    protected double sub1;
    protected double sub2;
    public void setMarks(double sub1, double sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
    public void displayMarks() {
        System.out.println("Marks in subject 1: " + sub1);
        System.out.println("Marks in subject 2: " + sub2);
    }
}

interface Attendance {
    int getAttendance();
}

class Result extends Test implements Attendance {
    private int atten;
    private double total;
    public void setAttendance(int atten) {
        this.atten = atten;
    }
    public int getAttendance() {
        return atten;
    }
    public void getTotal() {
        total = sub1 + sub2 + atten;
    }
    public void display() {
        System.out.println("Roll no: " + getRoll());
        displayMarks();
        System.out.println("Attendance: " + getAttendance() + "%");
        getTotal();
        System.out.println("Total Marks: " + total);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Result res = new Result();
        res.setRoll(500);
        res.setMarks(95.0, 100.0);
        res.setAttendance(90);
        res.display();
    }
}

