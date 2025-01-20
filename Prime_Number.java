// Write a program to check if the given number is a prime number or not
package Corejava;
import java.util.*;
public class Prime_Number 
{
    public static void main(String[] args) 
    {
        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        // Assume the number is prime
        boolean isPrime = true;  
        // Numbers less than or equal to 1 are not prime
        if (num <= 1)
        {
            isPrime = false;
        }
        else 
        {
            // Check divisibility from 2 to num/2
            for (int i = 2; i <= num / 2; i++) 
            {
                if (num % i == 0) 
                {
                	// Found a divisor, not prime
                    isPrime = false;  
                    break;
                }
            }
        }
        // Print the result
        if (isPrime)
        {
            System.out.println(num + " is a Prime Number.");
        } 
        else 
        {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }
}

/*Output:
Enter the Number:5
5 is a Prime Number.

Enter the Number: 6
6 is NOT a Prime Number.*/