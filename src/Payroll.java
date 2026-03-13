/*  Akein Bantin #2401011023
    Zhane Tomlin #
    Chevar Prince #
    Ryan Brown #
    Georgia Black #1817002195
*/

import java.util.ArrayList;

public class Payroll {
    public static void main(String[] args){

        StaffMembers emp1 = new Manager("John", "Doe", "M001", 40, 5000);
        StaffMembers emp2 = new SalesRep("Jane", "Smith", "S001", 40, 2000);

        emp1.Display();
        emp2.Display();

            }
}
