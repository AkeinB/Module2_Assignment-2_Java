/*  Akein Bantin #2401011023
    Zhane Tomlin #
    Chevar Prince #
    Ryan Brown #
    Georgia Black #1817002195
*/


public class SalesRep {

    private double Allowance;

//    ================PARAMETERIZED CONSTRUCTOR===========
    public SalesRep(double Allowance) {
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

    public void Display(){
        System.out.println("the allowance for Sale Reps is " + this.Allowance);
    }
}
