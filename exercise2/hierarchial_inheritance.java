
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


class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}


public class TestHierarchicalInheritance {
    public static void main(String[] args) {
        // Dog object
        Dog myDog = new Dog();
        myDog.eat();  // Inherited from Animal
        myDog.bark();

        // Cat object
        Cat myCat = new Cat();
        myCat.eat();  // Inherited from Animal
        myCat.meow();
    }
}
