// Employee and ProductionWorker Classes: Design a class named
// Employee. The class should keep the following information in fields:
// i) Employee name
// ii) Employee number in the format XXX-L, where each X is a
// digit within the range 0-9 and the L is a letter within the range A-M.
// iii) Hire date.
// Write one or more constructors and the appropriate accessor and mutator
// methods for the class.

// Next, write a class named ProductionWorker that inherits from the
// Employee class. The ProductionWorker class should have fields to hold the following information:
// i) Shift (an integer)
// ii) Hourly pay rate (a double)

// The workday is divided into two shifts: day and night. The shift will be an
// integer value representing the shift that the employee works. The day shift is
// shift 1 and the night shift is shift 2. Write one or more constructors and the
// appropriate accessor and mutator methods for the class. Demonstrate the
// classes by writing a program that uses a ProductionWorker object.

class Employee {
    private String empName;
    private String empNo;
    private String hireDate;

    public Employee(String empName, String empNo, String hireDate) {
        this.empName = empName;
        this.empNo = empNo;
        this.hireDate = hireDate;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Number: " + empNo);
        System.out.println("Hire Date: " + hireDate);
    }
}

class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String empName, String empNo, String hireDate, int shift, double hourlyPayRate) {
        super(empName, empNo, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public void showProductionWorkerDetails() {
        showEmployeeDetails();
        System.out.println("Shift: " + (shift == 1 ? "Day" : "Night"));
        System.out.println("Hourly Pay Rate: Rs." + hourlyPayRate);
    }
}

public class Main2 {
    public static void main(String[] args) {
        ProductionWorker worker = new ProductionWorker("Dev", "4560", "2020-05-10", 1, 1000);
        worker.showProductionWorkerDetails();
    }
}