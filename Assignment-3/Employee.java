// In a particular factory a shift supervisor is a salaried employee who
// supervises a shift. In addition to a salary, the shift supervisor earns a yearly
// bonus when his or her shift meets production goals. Design a
// ShiftSupervisor class that inherits from the Employee class. The
// ShiftSupervisor class should have a field that holds the annual salary and a
// field that holds the annual production bonus that a shift supervisor has
// earned. Write one or more constructors and the appropriate accessor and
// mutator methods for the class. Demonstrate the class by writing a program
// that uses a ShiftSupervisor object.

class Emp{
    public String name;
    public String empNumber;
    public String hiredate;

    public Emp(String name, String empNumber, String hiredate){
        this.name = name;
        this.empNumber = empNumber;
        this.hiredate = hiredate;
    }
}

class ShiftSupervisor extends Emp{
    private double annualSalary;
    private double annualProductionBonus;

    public ShiftSupervisor(String name, String empNumber, String hiredate, double annualSalary, double annualProductionBonus){
        super(name, empNumber, hiredate);
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Employee Number: " + empNumber);
        System.out.println("Hire Date: " + hiredate);
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Annual Production Bonus: " + annualProductionBonus);
    }
}

public class Employee {
    public static void main(String[] args) {
        ShiftSupervisor supervisor = new ShiftSupervisor("Roy", "12345", "23-05-2009", 600000, 50000);
        supervisor.display();
    }
}
