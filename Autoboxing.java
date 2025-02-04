//Write  a java program for Autoboxing.(All Primitive Types)
package Corejava;
public class Autoboxing
{
	public static void main(String[] args) 
	{
		// Autoboxing of all primitive types
		// Autoboxing byte to Byte
		byte primitiveByte = 1;
		Byte wrappedByte = primitiveByte;

		// Autoboxing short to Short
		short primitiveShort = 2;
		Short wrappedShort = primitiveShort;

		// Autoboxing int to Integer
		int primitiveInt = 3;
		Integer wrappedInt = primitiveInt;

		// Autoboxing long to Long
		long primitiveLong = 4L;
		Long wrappedLong = primitiveLong;

		// Autoboxing float to Float
		float primitiveFloat = 5.0f;
		Float wrappedFloat = primitiveFloat;

		// Autoboxing double to Double
		double primitiveDouble = 6.0;
		Double wrappedDouble = primitiveDouble;

		// Autoboxing char to Character
		char primitiveChar = 'a';
		Character wrappedChar = primitiveChar;

		// Autoboxing boolean to Boolean
		boolean primitiveBoolean = true;
		Boolean wrappedBoolean = primitiveBoolean;

		// Printing autoboxed values
		System.out.println("Autoboxed Values:");
		System.out.println("Byte: " + wrappedByte);
		System.out.println("Short: " + wrappedShort);
		System.out.println("Integer: " + wrappedInt);
		System.out.println("Long: " + wrappedLong);
		System.out.println("Float: " + wrappedFloat);
		System.out.println("Double: " + wrappedDouble);
		System.out.println("Character: " + wrappedChar);
		System.out.println("Boolean: " + wrappedBoolean);
	}
}
/*Output:
Autoboxed Values:
Byte: 1
Short: 2
Integer: 3
Long: 4
Float: 5.0
Double: 6.0
Character: a
Boolean: true*/
