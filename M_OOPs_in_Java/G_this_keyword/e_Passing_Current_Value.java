package M_OOPs_in_Java.G_this_keyword;

public class e_Passing_Current_Value {
    public void print(e_Passing_Current_Value obj) {
        System.out.println("Object passed: " + obj);
    }

    public void passThis() {
        this.print(this); // Pass current object using 'this'
    }

    public static void main(String[] args) {
        e_Passing_Current_Value obj = new e_Passing_Current_Value();
        obj.passThis();
    }

}
