/*  Akein Bantin #2401011023
    Zhane Tomlin #
    Chevar Prince #
    Ryan Brown #
    Georgia Black #1817002195
*/


public class StaffMembers {
    private  String FirstName;
    private String LastName;
    private String DeptNumber;
    private double HoursWorked;

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
}