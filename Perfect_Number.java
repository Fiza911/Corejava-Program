// Write a java program to check given number is perfect number or not
package Corejava;
import java.util.*;
public class Perfect_Number 
{
	public static void main(String[] args)
	{
		// Take Input From the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int sum = 0;
		// Find divisors and calculate sum
		for (int i = 1; i <= num / 2; i++)
		{
			if (num % 1 == 0)
			{
				sum += i;
			}
		}
		// Check if the sum of divisors equals the number
		if (sum == num && num != 0) 
		{
			System.out.println(num + " is a Perfect Number");
		} 
		else 
		{
			System.out.println(num + " is not a Perfect Number");
		}

	}

}

/*Output:
Enter the Number: 6
6 is a Perfect Number

Enter the Number:5
5 is not a Perfect Number */

