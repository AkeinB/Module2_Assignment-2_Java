/*  Akein Bantin #2401011023
    Zhane Tomlin #2401010939
    Chevar Prince #
    Ryan Brown #
    Georgia Black Golding #1817002195
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Payroll {
    public static void main(String[] args){

        StaffMembers emp1 = new Manager("John", "Doe", "M001", 40, 5000);
        StaffMembers emp2 = new SalesRep("Jane", "Smith", "S001", 40, 2000);

        emp1.Display();
        emp2.Display();
        System.out.println("\n===================================");

        ArrayList<SalesRep> salesRepsList = new ArrayList<>(); // Creates an ArrayList to hold SalesRep objects
        salesRepsList.add(new SalesRep("Alice", "Johnson", "S002", 40, 1500));
        salesRepsList.add(new SalesRep("Bob", "Williams", "S003", 40, 1800));
        salesRepsList.add(new SalesRep("Charlie", "Brown", "S004", 40, 2200));
        salesRepsList.add(new SalesRep("David", "Davis", "S005", 40, 2500));
        salesRepsList.add(new SalesRep("Eve", "Miller", "S006", 40, 3000));


        try {
            FileWriter PayStub = new FileWriter("Paystub.txt" ); //Create File Object

            for (SalesRep rep : salesRepsList)
            {
                rep.CalculateSalary();
                rep.Display();
                PayStub.write(rep.toString());
            }
            System.out.println("Successfully wrote to file");
            PayStub.close();
        }
        catch (IOException e)
        {
            System.out.println("Error file could not be created");
            e.printStackTrace();
        }

    }
}
