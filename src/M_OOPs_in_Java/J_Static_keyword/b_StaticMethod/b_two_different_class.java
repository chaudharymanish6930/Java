package M_OOPs_in_Java.J_Static_keyword.b_StaticMethod;

public class b_two_different_class {
        static void show(){
            System.out.println("without object");
        }
        void display(){
            System.out.println("with object");
        }
        public static void main(String[] args){
           b_two_different_class obj1=new b_two_different_class();
            obj1.display();  // with object
            show();   // without object
            M_OOPs_in_Java.J_Static_keyword.b_StaticMethod.a_acess_without_object.show(); // without object
            Xyz.show1();
        }
}

class Xyz{
        static void show1(){
            System.out.println("without object");
        }
}

