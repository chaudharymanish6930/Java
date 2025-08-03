package M_OOPs_in_Java.G_this_keyword;

public class g_Access_Class_fields {
    private String name = "Default Name"; // Instance variable with a default value

    public void display() {
        System.out.println("Name: " + this.name); // Explicitly accessing the instance variable
    }

    public static void main(String[] args) {
        g_Access_Class_fields obj = new g_Access_Class_fields();
        obj.display(); // Displays the instance variable
    }
}
