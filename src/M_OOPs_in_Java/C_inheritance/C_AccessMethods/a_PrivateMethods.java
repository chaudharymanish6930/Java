package M_OOPs_in_Java.C_inheritance.C_AccessMethods;

class parents{
    private String name;

    parents(String n){
        this.name=n;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}

class Child extends parents{
    private int age;
    // Constructor
    Child(String name, int age) {
        super(name); // call Parent constructor
        this.age = age;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display info
    public void showInfo() {
        System.out.println("Name: " + getName());  // from parent getter
        System.out.println("Age: " + age);
    }
}

public class a_PrivateMethods {
    public static void main(String[] args) {
        Child c1 = new Child("Manish ",15);
        c1.showInfo();
        c1.showInfo();
    }
}
