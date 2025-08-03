package M_OOPs_in_Java.G_this_keyword;

public class d_Returning_Current_Object {
    private String name;

    public d_Returning_Current_Object setName(String name) {
        this.name = name; // Set name using 'this'
        return this; // Return the current object
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        d_Returning_Current_Object obj = new d_Returning_Current_Object();
        obj.setName("Alice").display(); // Method chaining
//        obj.display();
    }
}
