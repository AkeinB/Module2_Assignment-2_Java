/*  Akein Bantin #2401011023
    Zhane Tomlin #
    Chevar Prince #
    Ryan Brown #
    Georgia Black #1817002195
*/


public class Manager extends StaffMembers{

    private double Bonus;

// ============PARAMETERIZED CONSTRUCTOR==========
    public Manager(String FirstName, String LastName, String DeptNumber, double HoursWorked, double Bonus) {
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

    public void Display(){
        System.out.println("Manger Bonus: $" + this.Bonus);
    }
}
