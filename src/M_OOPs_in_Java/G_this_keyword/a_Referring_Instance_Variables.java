package M_OOPs_in_Java.G_this_keyword;

public class a_Referring_Instance_Variables {
    private String name;

    // Constructor
    public a_Referring_Instance_Variables(String name) {
        this.name = name; // 'this' refers to the instance variable
    }

    public void display() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        a_Referring_Instance_Variables obj = new a_Referring_Instance_Variables("Alice");
        obj.display();
    }
}
