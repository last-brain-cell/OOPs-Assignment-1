In Java, there are several ways to manipulate strings. Here are some of the most commonly used classes for string manipulation:

1. String Class: The String class provides methods for various operations like string concatenation, comparison, substring, replacing characters, trimming string, converting a string to lower and upper case, etc.
2. StringBuilder Class: StringBuilder in Java is a mutable sequence of characters. Java StringBuilder class is used to create mutable (modifiable) string. The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized.
3. StringTokenizer Class: The java.util.StringTokenizer class allows you to break a string into tokens. It is simple way to break string.

Here’s a program that demonstrates these techniques:

```java
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // String example
        String str = "Hello World";
        System.out.println("Substring: " + str.substring(0, 5));

        // StringBuilder example
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("World");
        System.out.println("StringBuilder: " + sb.toString());

        // StringTokenizer example
        StringTokenizer st = new StringTokenizer("Hello World");
        System.out.println("StringTokenizer:");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
```
