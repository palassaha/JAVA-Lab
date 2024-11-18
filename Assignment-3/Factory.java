// In a particular factory, a team leader is an hourly paid production worker
// who leads a small team. In addition to hourly pay, team leaders earn a fixed
// monthly bonus. Team leaders are required to attend a minimum number of
// hours of training per year. Design a TeamLeader class that inherits from the
// ProductionWorker class. The TeamLeader class should have fields for the
// monthly bonus amount, the required number of training hours, and the
// number of training hours that the team leader has attended. Write one or
// more constructors and appropriate accessor and mutator methods for the
// class. Demonstrate the class by writing a program that uses a TeamLeader
// object.

class ProductionWorker {
    private String name;
    private int employeeId;
    private double hourlyPay;

    public ProductionWorker(String name, int employeeId, double hourlyPay) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyPay = hourlyPay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Hourly Pay: $" + hourlyPay);
    }
}

class TeamLeader extends ProductionWorker {
    private double monthlyBonus;
    private int requiredTrainingHours;
    private int attendedTrainingHours;

    public TeamLeader(String name, int employeeId, double hourlyPay, double monthlyBonus, int requiredTrainingHours, int attendedTrainingHours) {
        super(name, employeeId, hourlyPay);
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.attendedTrainingHours = attendedTrainingHours;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public int getRequiredTrainingHours() {
        return requiredTrainingHours;
    }

    public void setRequiredTrainingHours(int requiredTrainingHours) {
        this.requiredTrainingHours = requiredTrainingHours;
    }

    public int getAttendedTrainingHours() {
        return attendedTrainingHours;
    }

    public void setAttendedTrainingHours(int attendedTrainingHours) {
        this.attendedTrainingHours = attendedTrainingHours;
    }

    public boolean isTrainingRequirementMet() {
        return attendedTrainingHours >= requiredTrainingHours;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Monthly Bonus: $" + monthlyBonus);
        System.out.println("Required Training Hours: " + requiredTrainingHours);
        System.out.println("Attended Training Hours: " + attendedTrainingHours);
        System.out.println("Training Requirement Met: " + (isTrainingRequirementMet() ? "Yes" : "No"));
    }
}

public class Factory {
    public static void main(String[] args) {
        TeamLeader leader = new TeamLeader("Alice", 101, 25.0, 500.0, 40, 30);

        System.out.println("Team Leader Details:");
        leader.display();

        System.out.println("\nUpdating training hours...");
        leader.setAttendedTrainingHours(45);
        leader.display();
    }
}
