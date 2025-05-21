package M_OOPs_in_Java.G_this_keyword;

public class c_Constructor_Chaining {
    private String name;

    // Constructor 1
     c_Constructor_Chaining() {
         this("Default Name"); // Call Constructor 2
    }

    // Constructor 2
     c_Constructor_Chaining(String name) {
         this.name = name;
    }

    public void display() {
         System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        c_Constructor_Chaining obj = new c_Constructor_Chaining();
        obj.display();
}

}
