package Corejava;

public class StaticBlock
{
		//Static block: to initialize static data members(variables)
		//before main method JVM execute static block.
			static  //static block
			{
				System.out.println("Static Block");
				
			}
			public static void main(String[] args)
			{
				System.out.println("Main Method");
			}


	}


