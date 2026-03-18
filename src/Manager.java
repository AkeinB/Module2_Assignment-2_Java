/*  Akein Bantin #2401011023
    Zhane Tomlin #2401010939
    Chevar Prince #
    Ryan Brown #
    Georgia Black Golding #1817002195
*/


public class Manager extends StaffMembers{

    private double Bonus;

    // ============PARAMETERIZED CONSTRUCTOR==========
    public Manager(String FirstName, String LastName, String DeptNumber,
                   double HoursWorked, double Bonus) {
        super(FirstName, LastName,DeptNumber,HoursWorked); // calls parent constructor
        this.Bonus = Bonus;
    }

    //    SETTER
    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }

    //    GETTER
    public double getBonus() {
        return this.Bonus;
    }

    @Override
    public void Display(){
        System.out.println("\n ******** Manager ********");
        System.out.println("Employee Name: " + FirstName + " " + LastName);
        System.out.println(" Department Number: " + DeptNumber);
        System.out.println(" Hours Worked: " + HoursWorked);
        System.out.println("Bonus: $" + Bonus);
        System.out.println(" Total Salary: $ " + CalculateSalary());
    }

    @Override
    public double CalculateSalary()
    {
         return (HoursWorked *2500) + Bonus;
    }

    @Override
    public  String toString(){
        return "Employee Name: " + FirstName + " " + LastName + "\n" +
                "Department Number: " + DeptNumber + "\n" +
                "Hours Worked: " + HoursWorked + "\n" +
                "Allowance: $" + Bonus + "\n" +
                "Total  Salary: $ " + CalculateSalary() + "\n" +
                "-------------------------------------------\n";
    }
}