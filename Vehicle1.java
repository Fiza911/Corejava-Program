/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called 
 "drive". Create a child class called "Car" that inherits from Vehicle and has an additional attribute 
 called "color" and a method called "honk". Create an object of the Car class and call both the "drive" 
 and "honk" methods.*/
package Corejava;
class Vehicle
{
    // Attributes of the Vehicle class
    String brand;  
    String model;  
    int year;      
    // Constructor to initialize the Vehicle attributes
    public Vehicle(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    // Method to simulate driving the vehicle
    public void drive() 
    {
        System.out.println("The " + year + " " + brand + " " + model + " is driving");
    }
}
// Derived class representing a Car, which is a specific type of Vehicle
class car extends Vehicle 
{
    String color;
    // Constructor to initialize both Vehicle and Car attributes
    public car(String brand, String model, int year, String color)
    {
    	// Call to the parent class (Vehicle) constructor
        super(brand, model, year); 
        this.color = color;
    }
    // Method to simulate the car honking
    public void honk() {
        System.out.println("The " + color + " car is honking");
    }
}
// Main class to demonstrate the functionality of Vehicle and Car
public class Vehicle1 {
    public static void main(String[] args) 
    {
        // Creating an instance of the Car class
        car c1 = new car("Toyota", "Corolla", 2021, "White");
        // Calling the drive method from the Vehicle class
        c1.drive();
        // Calling the honk method from the Car class
        c1.honk();
    }
}

/*Output:
The 2021 Toyota Corolla is driving
The White car is honking
 */
