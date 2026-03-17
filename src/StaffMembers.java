/*  Akein Bantin #2401011023
    Zhane Tomlin #
    Chevar Prince #
    Ryan Brown #
    Georgia Black Golding #1817002195
*/


public abstract class StaffMembers {
    protected String FirstName;
    protected String LastName;
    protected String DeptNumber;
    protected double HoursWorked;

//===========Parameterized Constructor==========================
    public StaffMembers(String FirstName, String LastName, String DeptNumber, double HoursWorked) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DeptNumber = DeptNumber;
        this.HoursWorked = HoursWorked;
    }

// =================FIRST NAME===============================
// SETTER
    public void SetFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

//  GETTER
    public String GetFirstName() {
        return this.FirstName;
    }

//    ==================LAST NAME=============
//  SETTER
    public void SetLastName(String LastName) {
        this.LastName = LastName;
    }

//  GETTER
    public String GetLastName() {
        return this.LastName;
    }

//  ==================DEPARTMENT NUMBER=============
//    SETTER
    public void SetDeptNumber(String DeptNumber) {
        this.DeptNumber = DeptNumber;
    }

//    GETTER
    public String GetDeptNumber() {
        return this.DeptNumber;
    }

//    ==================HOURS WORKED====================
//    SETTER
    public void SetHoursWorked(double HoursWorked) {
        this.HoursWorked = HoursWorked;
    }

//    GETTER
    public double GetHoursWorked() {
        return this.HoursWorked;
    }

//    ====================METHODS======================
    public void Display(){
        System.out.println("Employee Name:" + FirstName + " " + LastName);
        System.out.println(" Department Number: " + DeptNumber);
        System.out.println(" Hours Worked: " + HoursWorked);
    }


    public abstract double CalculateSalary(); //abstract method (DO NOT TOUCH, SHOULD BE EMPTY)

}