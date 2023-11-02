Inheritance in Java is a mechanism where one class acquires the properties (fields) and behaviors (methods) of another class. The class that gives its properties is known as the **superclass** or **parent class**, and the class that acquires the properties is known as the **subclass** or **child class**.

The main advantage of inheritance in Java is that it allows for **code reusability**. The code that is already present in the parent class can be reused by the child class, reducing redundancy.

Inheritance is implemented in Java using the `extends` keyword. Here's a simple example:

```java
// Parent class
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

// Test class to create objects and call methods
public class TestInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
```

In this example, `Dog` is a subclass of `Animal`. It inherits the `eat` method from `Animal` and also defines its own method `bark`. When we create a `Dog` object in the `TestInheritance` class, we can call both `bark` and `eat` methods on it.

It's important to note that Java does not support multiple inheritance with classes, meaning you cannot extend more than one class. However, you can implement multiple interfaces, which is Java's way of allowing a form of multiple inheritance.