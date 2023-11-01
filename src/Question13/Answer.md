In Java, `static` and `final` are two important keywords that serve different purposes.

**Static Keyword**

The `static` keyword in Java is used for memory management mainly. It belongs to the class rather than the object of the class. It can be applied with variables, methods, blocks, and nested classes. The static keyword is mainly used for memory management.

Here's an example of a static variable:

```java
class Student {
    int rollno;
    String name;
    static String college = "ITS";
}
```

In this example, `college` is a static variable that will be common to all objects and we can change the college of all objects by the single line: `Student.college="BBDIT";`.

**Final Keyword**

The `final` keyword in Java is used to restrict the user. The java final keyword can be used in many contexts such as final variable, final method, final class.

1. Final Variable: If you make any variable as final, you cannot change the value of the final variable (It will be constant).

```java
// final int speedlimit=90; //final variable
```

2. Final Method: If you make any method as final, you cannot override it.

```java
// final void run(){...}
```

3. Final Class: If you make any class as final, you cannot extend it.

```java
// final class Bike{...}
```

**Differences**

- The `static` keyword is used to define a variable that can be accessed without creating an instance of a class and it belongs to the class rather than an instance of the class.
- The `final` keyword is used to define a constant variable or a method that cannot be overridden or a class that cannot be inherited.
- A `static` member belongs to a class itself and a `final` member belongs to an object.
- A `static` member can change its value but a `final` member once initialized cannot change its value.