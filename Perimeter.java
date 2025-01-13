//write a program to find the perimeter of the square
package Corejava;
import java.util.Scanner;
public class Perimeter 
{
	    public static void main(String[] args) //this is the main method
	    {
	        // Create Scanner object to take input from user
	        Scanner sc= new Scanner(System.in);
	        // Declare a variable to store the side length of the square
	        double side;
	        // Take input for the side length of the square
	        System.out.print("Enter the length of the square: ");
	        side = sc.nextDouble();
	        // Calculate the perimeter of the square
	        double perimeter =4*side;
	        // Display the perimeter
	        System.out.println("The perimeter of the square is: " + perimeter);
	    }
}

/*Output
 Enter the length of the square: 5
The perimeter of the square is: 20.0*/
