//Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20]
package Corejava;
import java.util.*;
public class Sort 
{
	public static void main(String[] args) 
	{
		// Initialize the array 
		int num[] = { 45, 35, 56, 67, 78, 89, 78, 12, 20 };
		// Print the original array
		System.out.println("Original Array: " + Arrays.toString(num));
		// Sort the array in ascending order
		Arrays.sort(num);
		// Print the sorted array
		System.out.println("Sorted Array (ascending): "+ Arrays.toString(num));
	}
}

/*Output:
Original Array: [45, 35, 56, 67, 78, 89, 78, 12, 20]
Sorted Array (ascending): [12, 20, 35, 45, 56, 67, 78, 78, 89]
*/
 