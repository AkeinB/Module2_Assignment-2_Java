/*  Akein Bantin #2401011023
    Zhane Tomlin #
    Chevar Prince #
    Ryan Brown #
    Georgia Black #1817002195
*/

import java.util.ArrayList; // Import the ArrayList class

public class Payroll {
    public static void main(String[] args){

        StaffMembers emp1 = new Manager("John", "Doe", "M001", 40, 5000);
        StaffMembers emp2 = new SalesRep("Jane", "Smith", "S001", 40, 2000);

        emp1.Display();
        emp2.Display();

        ArrayList<SalesRep> salesReps = new ArrayList<>(); // Create an ArrayList to hold SalesRep objects
        salesReps.add(new SalesRep("Alice", "Johnson", "S002", 40, 1500));
        salesReps.add(new SalesRep("Bob", "Williams", "S003", 40, 1800));
        salesReps.add(new SalesRep("Charlie", "Brown", "S004", 40, 2200));
        salesReps.add(new SalesRep("David", "Davis", "S005", 40, 2500));
        salesReps.add(new SalesRep("Eve", "Miller", "S006", 40, 3000));
    }
}
