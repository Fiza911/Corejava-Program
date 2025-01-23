//Write java program to invoke current class method using this keyword
package Corejava;
public class ThisMethod 
{
	   // Method to display a simple message
	    void display()
	    {
	    	 System.out.println("I am display method");	  
	    }
	    // Method that calls the `display` method using the this keyword
	    void show()
	    {
	    	// Calls the `display` method of the current object
	    	this.display();
	    	System.out.println("I am show method");
	    }
		public static void main(String[] args)
		{
			ThisMethod obj=new ThisMethod();
			obj.show();
		}
}

/*Output:
I am display method
I am show method*/
