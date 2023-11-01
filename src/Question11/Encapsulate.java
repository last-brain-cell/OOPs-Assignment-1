//Q) Define encapsulation in object-oriented programming and explain its importance.
//Provide an example in Java to illustrate encapsulation.
//
//-> In object-oriented programming, encapsulation is a concept that binds together the data and functions
//that manipulate the data, and keeps both safe from outside interference and misuse. The data is not accessed directly.
//It is accessed through the functions present inside the class. In other words, attributes of the class are kept private
//and public getter and setter methods are provided to manipulate these attributes. Thus, encapsulation makes the concept
//of data hiding possible.
//
//Here’s why encapsulation is important:
//
//  - It improves maintainability and flexibility and re-usability: The fields can be made read-only
//    (if we don’t provide setter methods) or write-only (if we don’t provide getter methods).
//  - It hides the data from the outside world and access to it is provided via methods of the class.
//  - Users have no idea about the inner implementation of the class, which makes it easy to change the
//    implementation without affecting users.


package Question11;

public class Encapsulate {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String studentName;
    private int studentAge;
    private int studentRoll;

    // get method for age to access
    // private variable studentAge
    public int getAge() { return studentAge; }

    // get method for name to access
    // private variable studentName
    public String getName() { return studentName; }

    // get method for roll to access
    // private variable studentRoll
    public int getRoll() { return studentRoll; }

    // set method for age to access
    // private variable studentage
    public void setAge( int newAge) { studentAge = newAge; }

    // set method for name to access
    // private variable studentName
    public void setName(String newName) { studentName = newName; }

    // set method for roll to access
    // private variable studentRoll
    public void setRoll( int newRoll) { studentRoll = newRoll; }
}

// In this example, all data members are private, which means they can’t be accessed directly from an
// object of the class. They can only be accessed via getter and setter methods. This is how encapsulation
// works in Java. It’s a protective shield that prevents data from being accessed by the code outside this shield.