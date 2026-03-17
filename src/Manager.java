/*  Akein Bantin #2401011023
    Zhane Tomlin #
    Chevar Prince #
    Ryan Brown #
    Georgia Black Golding #1817002195
*/


public class Manager extends StaffMembers{

    private double Bonus;
    private double ManagerSalary;

    // ============PARAMETERIZED CONSTRUCTOR==========
    public Manager(String FirstName, String LastName, String DeptNumber,
                   double HoursWorked, double Bonus , double ManagerSalary) {
        super(FirstName, LastName,DeptNumber,HoursWorked); // calls parent constructor
        this.Bonus = Bonus;
        this.ManagerSalary = ManagerSalary;
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
        System.out.println("Employee Name:" + FirstName + " " + LastName);
        System.out.println(" Department Number: " + DeptNumber);
        System.out.println(" Hours Worked: " + HoursWorked);
        System.out.println("Bonus: $" + this.Bonus);
    }

    public double CalculateSalary()
    {
        ManagerSalary = (HoursWorked *2500) + Bonus;
        return ManagerSalary;
    }
}
