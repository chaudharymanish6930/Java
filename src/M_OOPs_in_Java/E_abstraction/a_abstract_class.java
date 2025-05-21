package M_OOPs_in_Java.E_abstraction;
abstract class Vehicle{
    // Abstract method
    abstract void startEngine();

    // Concrete method
    void fuelCapacity() {
        System.out.println("Every vehicle has a fuel tank.");
    }
}
class Car extends Vehicle{
    void startEngine() {
        System.out.println("Car engine starts with key ignition.");
    }
}
class Bike extends Vehicle{
    void startEngine() {
        System.out.println("Bike engine starts with a kick or self-start.");
    }
}
public class a_abstract_class {
    public static void main(String[] args){
        // doesn't create object of the abstract class
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.startEngine();    // Output: Car engine starts with key ignition.
        v2.startEngine();    // Output: Bike engine starts with a kick or self-start.

        v1.fuelCapacity();   // Output: Every vehicle has a fuel tank.

    }
}
