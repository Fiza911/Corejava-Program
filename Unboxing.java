//Write a java program for Unboxing.(all types)
package Corejava;
public class Unboxing 
{
	public static void main(String[] args) 
	{
		// Create wrapped values
		// Boxed byte
		Byte wrappedAge = 25;
		// Boxed short
		Short wrappedYear = 2024;
		// Boxed int
		Integer wrappedScore = 95;
		// Boxed long
		Long wrappedPopulation = 8000L;
		// Boxed float
		Float wrappedTemperature = 36.6f;
		// Boxed double
		Double wrappedPi = 3.14;
		// Boxed char
		Character wrappedGrade = 'A';
		// Boxed boolean
		Boolean wrappedAnswer = true;

		// Unboxing of all types
		// Byte becomes primitive byte
		byte age = wrappedAge;
		// Short becomes primitive short
		short year = wrappedYear;
		// Integer becomes primitive int
		int score = wrappedScore;
		// Long becomes primitive long
		long population = wrappedPopulation;
		// Float becomes primitive float
		float temperature = wrappedTemperature;
		// Double becomes primitive double
		double pi = wrappedPi;
		// Character becomes primitive char
		char grade = wrappedGrade;
		// Boolean becomes primitive boolean
		boolean answer = wrappedAnswer;

		// Show our unboxed values
		System.out.println("Unboxed Primitive Values:");
		System.out.println("Age: " + age);
		System.out.println("Year: " + year);
		System.out.println("Score: " + score);
		System.out.println("Population: " + population);
		System.out.println("Temperature: " + temperature + "°C");
		System.out.println("Pi Value: " + pi);
		System.out.println("Grade: " + grade);
		System.out.println("Boolean:" + answer);
	}
}
/*Output:
Unboxed Primitive Values:
Age: 25
Year: 2024
Score: 95
Population: 8000L
Temperature: 36.6°C
Pi Value: 3.14
Grade: A
Boolean:true
 */
