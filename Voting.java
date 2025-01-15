//Write java program to check  candidate eligible for voting or not
package Corejava;
import java.util.*;
public class Voting 
{

	public static void main(String[] args) 
	{
		// Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check if the candidate is eligible to vote
        if (age >= 18) 
        {
            System.out.println("You are eligible to vote.");
        } 
        else
        {
            System.out.println("You are NOT eligible to vote.");
        }
    }

	}

/*Output:
Enter your age: 21
You are eligible to vote.

Enter your age: 15
You are NOT eligible to vote.
 */

