//Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B]
package Corejava;
import java.util.*;
public class Sort_Descend 
{
	public static void main(String[] args) 
	{
		// Initialize the array of strings
		String [] string = {"A", "X", "D", "Z", "Y", "C", "W", "B"};
		// Print the original array before sorting
		System.out.println("Original String: " + Arrays.toString(string));
		// Sort the array in descending order using Collections.reverseOrder()
		Arrays.sort(string, Collections.reverseOrder());
		// Print the sorted array in descending order
		System.out.println("Sorted string (Descending): " + Arrays.toString(string));
	}
}

/*Output:
Original String: [A, X, D, Z, Y, C, W, B]
Sorted string (Descending) : [Z, Y, X, W, D, C, B, A]
*/

