//Write a Java program to take Employee id,name,address & salary from user and display on to screen.
package Corejava;
import java.util.Scanner;
public class Student 
{
	public static void main(String[] args) 
	{
		  // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        // Declare variables
        int empId;
        String name,address;
        double salary;
        // Take input from the user
        System.out.print("Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine(); // consume the newline character left by nextInt()
        System.out.print("Employee Name: ");
        name = sc.nextLine();
        System.out.print("Employee Address: ");
        address = sc.nextLine();
        System.out.print("Employee Salary: ");
        salary = sc.nextDouble();
        // Display the details
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address: " + address);
        System.out.println("Employee Salary: " + salary);  
    }	
}


/*Output
Employee ID: 9
Employee Name: Fiza
Employee Address: Solapur
Employee Salary: 50000

Employee Details:
Employee ID: 9
Employee Name: Fiza
Employee Address: Solapur
Employee Salary: 50000.0 */

