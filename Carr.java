//Task 3: Create a Car class with attributes like brand, color, and speed and methods like start().stop(), and accelerate().

//Instantiate objects of the Car class and call its methods in the main() method.

class Car {
    // Attributes
    private String brand;
    private String color;
    private int speed;

    // Constructor
    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // Methods
    public void start() {
        System.out.println(brand + " is starting.");
    }

    public void stop() {
        System.out.println(brand + " is stopping.");
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " is accelerating. Current speed: " + speed + " km/h");
    }

    public void display() {
        System.out.println("Car Details: Brand - " + brand + ", Color - " + color + ", Speed - " + speed + " km/h");
    }
}

public class Carr {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Toyota", "Red", 0);
        Car car2 = new Car("Honda", "Blue", 0);

        // Calling methods on the objects
        car1.start();
        car1.accelerate(50);
        car1.display();
        car1.stop();

        car2.start();
        car2.accelerate(70);
        car2.display();
        car2.stop();
    }
}