// Write a class College with following 
// Data members:
// a) collegeName
// b) address
// Method:
// a)showDetails().

// Write a class DepartmentFaculty which inherits class College with following  
// specialized data members:
// a) name
// b) experience
// Method:
// a) showFacultyDetails().

// Write a class Department which also inherits class College with following
// specialized data members:
// a) deptName
// b) hodName
// and method:
// a)showDeptDetails().

// Create object of all the classes and test your program from main().
// Add appropriate constructors, mutators and accessors wherever necessary.

class College {
    private String collegeName;
    private String address;

    public College(String collegeName, String address) {
        this.collegeName = collegeName;
        this.address = address;
    }

    public void showDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Address: " + address);
    }
}

class DepartmentFaculty extends College {
    private String name;
    private int experience;

    public DepartmentFaculty(String collegeName, String address, String name, int experience) {
        super(collegeName, address);
        this.name = name;
        this.experience = experience;
    }

    public void showFacultyDetails() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Experience: " + experience + " years");
        super.showDetails();
    }
}

class Department extends College {
    private String deptName;
    private String hodName;

    public Department(String collegeName, String address, String deptName, String hodName) {
        super(collegeName, address);
        this.deptName = deptName;
        this.hodName = hodName;
    }

    public void showDepartmentDetails() {
        System.out.println("Department Name: " + deptName);
        System.out.println("HOD Name: " + hodName);
        super.showDetails();
    }
}

public class University {
    public static void main(String[] args) {
        College college = new College("RCCIIT", "KOLKATA");
        college.showDetails();
        System.out.println();

        DepartmentFaculty faculty = new DepartmentFaculty("RCCIIT", "KOLKATA", "DR. GHOSH", 10);
        faculty.showFacultyDetails();
        System.out.println();

        Department dept = new Department("RCCIIT", "KOLKATA", "CSE", "DR. GHOSH");
        dept.showDepartmentDetails();
    }
}
