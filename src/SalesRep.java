/*  Akein Bantin #2401011023
    Zhane Tomlin #
    Chevar Prince #
    Ryan Brown #
    Georgia Black #1817002195
*/


public class SalesRep extends StaffMembers{

    private double Allowance;

//    ================PARAMETERIZED CONSTRUCTOR===========
    public SalesRep(String FirstName, String LastName, String DeptNumber, double HoursWorked, double Allowance) {
        super(FirstName,LastName,DeptNumber,HoursWorked);// calls parent constructor
        this.Allowance = Allowance;
    }

//    SETTER
    public void setAllowance(double Allowance) {
        this.Allowance = Allowance;
    }

//    GETTER
    public double getAllowance() {
        return this.Allowance;
    }

    @Override
    public void Display(){
        System.out.println("Employee Name:" + FirstName + " " + LastName);
        System.out.println(" Department Number: " + DeptNumber);
        System.out.println(" Hours Worked: " + HoursWorked);
        System.out.println("Allowance: $" + Allowance);
    }

    /*Create Method for CalculateSalary here. implement the appropriate formula for the subclass */
}
