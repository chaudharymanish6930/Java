package M_OOPs_in_Java.E_abstraction;

// Interface
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Class 1 implements the interface
class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Light is now ON.");
    }
    public void turnOff() {
        System.out.println("Smart Light is now OFF.");
    }
}

// Class 2 implements the interface
class SmartFan implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Fan is spinning.");
    }
    public void turnOff() {
        System.out.println("Smart Fan has stopped.");
    }
}
public class d_interface2 {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        SmartDevice fan = new SmartFan();

        light.turnOn();   // Output: Smart Light is now ON.
        fan.turnOn();     // Output: Smart Fan is spinning.

        light.turnOff();  // Output: Smart Light is now OFF.
        fan.turnOff();    // Output: Smart Fan has stopped.
    }
}
