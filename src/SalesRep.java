/*  Akein Bantin #2401011023
    Zhane Tomlin #
    Chevar Prince #
    Ryan Brown #
    Georgia Black Golding #1817002195
*/

public class SalesRep extends StaffMembers{

    private double Allowance;
    private double SalesRepSalary;

    //    ================PARAMETERIZED CONSTRUCTOR===========
    public SalesRep(String FirstName, String LastName, String DeptNumber,
                    double HoursWorked, double Allowance, double SalesRepSalary) {
        super(FirstName,LastName,DeptNumber,HoursWorked);// calls parent constructor
        this.Allowance = Allowance;
        this.SalesRepSalary = SalesRepSalary;
    }

    //    SETTER
    public void setAllowance(double Allowance) {
        this.Allowance = Allowance;
    }

    public void setSalesRepSalary(double SalesRepSalary) {
        this.SalesRepSalary = SalesRepSalary;
    }

    //    GETTER
    public double getAllowance() {
        return this.Allowance;
    }

    public double GetSalesRepSalary() {
        return this.SalesRepSalary;
    }

    @Override
    public void Display(){
        System.out.println("Employee Name:" + FirstName + " " + LastName);
        System.out.println(" Department Number: " + DeptNumber);
        System.out.println(" Hours Worked: " + HoursWorked);
        System.out.println("Allowance: $" + Allowance);
    }

    /*Create Method for CalculateSalary here. implement the appropriate formula for the subclass */
    public double CalculateSalary()
    {
        SalesRepSalary = (HoursWorked * 1500) + Allowance;
        return SalesRepSalary;
    }
}