package M_OOPs_in_Java.I_final_keyword;

final public class g_FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// class SubClass extends FinalClass {  // ❌ Error: Cannot inherit from final class
// }
// not valid code...
//public class class1 extends g_FinalClass {
//    public static void main(String[] args) {
//        g_FinalClass obj = new g_FinalClass();
//        obj.display();
//    }
//}
