package M_OOPs_in_Java.A_class_object_methods.Object_creating;

class b_another_basics {
    // 1. method in classes
    public void eat(){
        System.out.println("hello...");
    }

    public static void main(String[]args){
        System.out.println("1");
        // one object
        b_another_basics ab=new b_another_basics();
        ab.eat();
        ab.run();

        // another object
        b_another_basics ac=new b_another_basics();
        ac.run();
        ac.eat();
    }
    // 2. methods in classes
    public void run(){
        System.out.println("running...");
    }

}
