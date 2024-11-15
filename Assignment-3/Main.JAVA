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

class College{
    private Strting collegeNmae;
    private String address;
    public College(String collegeName, String address){
        this.collegeName = collegeName;
        this.address = address;
    }
    public void showDetails(){
        System.out.println("College Name: " + collegeName);
        System.out.println("Address: " + address);
    }
}

class DepartmentFaculty extends College{
    
}
