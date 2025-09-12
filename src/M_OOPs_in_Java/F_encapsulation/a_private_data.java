package M_OOPs_in_Java.F_encapsulation;

// Class with encapsulation
class Student {
    // Private fields (data hiding)
    private String name;
    private int age;

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
    // Public getter for age
    public int getAge() {
        return age;
    }
}

public class a_private_data {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Rahul");
        s.setAge(20);

        System.out.println("Name: " + s.getName()); // Output: Rahul
        System.out.println("Age: " + s.getAge());   // Output: 20
    }
}
