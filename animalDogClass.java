//Task 6.2: Demonstrate method overriding using an example of a parent Animal class and a Dog subclass, where sound() is overridden.
// Animal class (parent class)
class Animal {
    // Method to be overridden by subclasses
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class (child class) that overrides the sound method
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class to test method overriding
public class animalDogClass {
    public static void main(String[] args) {
        // Create an Animal object
        Animal myAnimal = new Animal();
        myAnimal.sound();  // Animal makes a sound

        // Create a Dog object
        Animal myDog = new Dog();  // Dog is an Animal (polymorphism)
        myDog.sound();  // Dog barks (method overriding)
    }
}