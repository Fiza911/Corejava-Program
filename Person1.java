/*Create a parent class called "Person" with attributes such as name, age, and a method called "speak". 
 Create a child class called "Student" that inherits from Person and has an additional attribute called 
 "grade" and a method called "study". Create an object of the Student class and call both the "speak" and
 "study" methods.
 */
package Corejava;
public class Person1 {
    // Instance variables to store name and age
    String name;
    int age;
    // Constructor to initialize Person1's attributes
    public Person1(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    // Method for a person to speak
    void speak()
    {
        System.out.println(name + " says: Hello, I am " + age + " years old");
    }
    // Static inner class to represent a student, which extends Person1
    static class Student extends Person1 
    {
        // Additional attribute specific to Student
        String grade;
        // Constructor to initialize Student's attributes (including inherited ones)
        public Student(String name, int age, String grade)
        {
            super(name, age); // Call to the parent class constructor
            this.grade = grade;
        }
        // Method for the student to study
        void study() {
            System.out.println(name + " is studying and is grade " + grade);
        }
    }
    public static void main(String[] args)
    {
        // Creating an instance of the Student class
        Student s = new Student("Fiza", 20, "A");
        // Calling the speak method from the parent class
        s.speak();
        // Calling the study method from the Student class
        s.study();
    }
}

/*Output:
Fiza says: Hello, I am 20 years old
Fiza is studying and is grade A */
