package M_OOPs_in_Java.I_final_keyword;

public class b_methods {
    final void show() {
        System.out.println("Final method in parent");
    }
}

class Child extends b_methods {
//        void show() {   ❌ Error: cannot override the final method
//            System.out.println("Trying to override");
public static void main(String[] args){
    b_methods ab =new b_methods();
    ab.show();
    }
}

