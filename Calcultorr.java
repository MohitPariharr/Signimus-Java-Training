/*
Task 6.1:Implement method overloading by creating a Calculator class with methods to add two numbers, three numbers, and concatenate strings.
 */
// Calculator class demonstrating method overloading
class Calculator {
    
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three numbers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to concatenate two strings
    public String add(String str1, String str2) {
        return str1 + str2;
    }
}

// Main class to test method overloading
public class Calcultorr {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using the add method for two numbers
        int sum1 = calculator.add(10, 20);
        System.out.println("Sum of two numbers: " + sum1);

        // Using the add method for three numbers
        int sum2 = calculator.add(10, 20, 30);
        System.out.println("Sum of three numbers: " + sum2);

        // Using the add method to concatenate strings
        String concatenated = calculator.add("Hello, ", "Everyone");
        System.out.println("Concatenated string: " + concatenated);
    }
}