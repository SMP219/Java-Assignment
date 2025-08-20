
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}


public class TestSingleInheritance {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();

        // Call the method from the Animal class (inherited)
        myDog.eat();

        // Call the method from the Dog class
        myDog.bark();
    }
}