package M_OOPs_in_Java.G_this_keyword;

public class f_Access_Shadowed_Variables {
    private int value; // Instance variable

    // Method to set the value
    public void setValue(int value) {
        this.value = value; // 'this.value' refers to the instance variable
        // 'value' refers to the parameter
    }

    public void display() {
        System.out.println("Value: " + this.value); // Accessing the instance variable
    }

    public static void main(String[] args) {
        f_Access_Shadowed_Variables obj = new f_Access_Shadowed_Variables();
        obj.setValue(10);  // Set value using the method
        obj.display();     // Display the instance variable
    }

}
