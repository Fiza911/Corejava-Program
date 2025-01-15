//Write a program to check leap year using if else. How to check whether a given year is a leap year or not
package Corejava;
import java.util.*;
public class Leapyear
{
	public static void main(String[] args)
	{
		// Create Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);
		// Prompt the user to enter a year
		System.out.print("Enter a year: ");
		int year = sc.nextInt(); // Taking user input
		// Check if the year is a leap year
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
		{
			System.out.println(year + " is a Leap Year.");
		}
		else
		{
			System.out.println(year + " is NOT a Leap Year.");
		}
	}

}

/*Output:
 
Enter a year: 2024
2024 is a Leap Year.

Enter a year: 2029
2029 is NOT a Leap Year.
*/