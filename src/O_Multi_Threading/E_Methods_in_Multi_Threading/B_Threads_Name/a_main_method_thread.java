package O_Multi_Threading.E_Methods_in_Multi_Threading.B_Threads_Name;

public class a_main_method_thread {
    public static void main(String [] args){
        System.out.println(Thread.currentThread().getName());   //  main
        Thread.currentThread().setName("Manish");
        System.out.println(Thread.currentThread().getName());
    }
}
