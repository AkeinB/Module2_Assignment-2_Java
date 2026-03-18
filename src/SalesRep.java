/*  Akein Bantin #2401011023
    Zhane Tomlin #2401010939
    Chevar Prince #
    Ryan Brown #
    Georgia Black Golding #1817002195
*/

public class SalesRep extends StaffMembers{

    private double Allowance;

    //    ================PARAMETERIZED CONSTRUCTOR===========
    public SalesRep(String FirstName, String LastName, String DeptNumber,
                    double HoursWorked, double Allowance) {
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
        System.out.println("\n ******** Sales Representatives ********");
        System.out.println(" Employee Name: " + FirstName + " " + LastName);
        System.out.println(" Department Number: " + DeptNumber);
        System.out.println(" Hours Worked: " + HoursWorked);
        System.out.println(" Allowance: $" + Allowance);
        System.out.println(" Total Salary: $ " + CalculateSalary());
    }

    /*Create Method for CalculateSalary here. implement the appropriate formula for the subclass */
    @Override
    public double CalculateSalary()
    {
        return (HoursWorked * 1500) + Allowance;

    }

    @Override
    public  String toString(){
        return "Employee Name: " + FirstName + " " + LastName + "\n" +
                "Department Number: " + DeptNumber + "\n" +
                "Hours Worked: " + HoursWorked + "\n" +
                "Allowance: $" + Allowance + "\n" +
                "Total  Salary: $ " + CalculateSalary() + "\n" +
                "-------------------------------------------\n";
    }
}