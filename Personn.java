//Task 5: Task 5: Create a Person class with attributes name and age.

//Create a Student class that inherits from Person and adds studentld and course fields.

//Override the toString() method in the Student class to display student details
// Define the Person class
class Person {
    private String name;
    private int age;

    // Constructor to initialize Person attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters for name and age
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Define the Student class that inherits from Person
class Student extends Person {
    private String studentId;
    private String course;

    // Constructor to initialize Student attributes, including those inherited from Person
    public Student(String name, int age, String studentId, String course) {
        super(name, age);  // Call the constructor of the parent (Person) class
        this.studentId = studentId;
        this.course = course;
    }

    // Override the toString() method to display student details
    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", Student ID: " + studentId + ", Course: " + course;
    }
}

// Personn class to test the functionality
public class Personn {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Mohit", 21, "S12345", "Computer Science");

        // Print student details using overridden toString() method
        System.out.println(student);
    }
}