
class Vehicle {
    void drive() {
        System.out.println("Vehicle is moving.");
    }
}


class Car extends Vehicle {
    void applyBrakes() {
        System.out.println("Brakes applied to the car.");
    }
}


class SportsCar extends Car {
    void accelerate() {
        System.out.println("Sports car is accelerating rapidly!");
    }
}


public class TestMultilevelInheritance {
    public static void main(String[] args) {
        
        SportsCar mySportsCar = new SportsCar();

        
        mySportsCar.drive();

        
        mySportsCar.applyBrakes();

        
        mySportsCar.accelerate();
    }
}