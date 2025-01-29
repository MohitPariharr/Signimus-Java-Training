// Abstract Shape class
abstract class Shape {
    // Abstract method
    public abstract double calculateArea();
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
// Payment interface
interface Payment {
    void pay(double amount);
    void refund(double amount);
}

// CreditCardPayment class implements Payment
class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card: " + cardNumber);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding " + amount + " to Credit Card: " + cardNumber);
    }
}

// PayPalPayment class implements Payment
class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal: " + email);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding " + amount + " to PayPal: " + email);
    }
}
// Employee class (base class)
class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Manager class (subclass of Employee)
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, double salary, int teamSize) {
        super(name, age, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing a team of " + teamSize + " people.");
    }

    public void organizeMeeting() {
        System.out.println(getName() + " is organizing a team meeting.");
    }

    public int getTeamSize() {
        return teamSize;
    }
}

// Intern class (subclass of Employee)
class Intern extends Employee {
    private String university;

    public Intern(String name, int age, double salary, String university) {
        super(name, age, salary);
        this.university = university;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is learning and assisting in tasks.");
    }

    public String getUniversity() {
        return university;
    }
}
public class EmploymentMiniProject {
    public static void main(String[] args) {
        // 1. Shape example
        Shape circle = new Circle(5);
        System.out.println("Area of the circle: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        // 2. Payment example
        Payment creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        creditCardPayment.pay(150.0);
        creditCardPayment.refund(50.0);

        Payment payPalPayment = new PayPalPayment("user@example.com");
        payPalPayment.pay(200.0);
        payPalPayment.refund(75.0);

        // 3. Employee Management System example
        Employee employee = new Employee("John Doe", 30, 50000);
        System.out.println(employee.getName() + "'s salary: " + employee.getSalary());
        employee.work();

        Manager manager = new Manager("Alice Smith", 40, 80000, 10);
        System.out.println(manager.getName() + "'s salary: " + manager.getSalary());
        manager.work();
        manager.organizeMeeting();

        Intern intern = new Intern("Bob Brown", 22, 20000, "University of XYZ");
        System.out.println(intern.getName() + "'s salary: " + intern.getSalary());
        intern.work();
        System.out.println(intern.getName() + " is from " + intern.getUniversity());
    }
}

