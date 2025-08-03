package O_Multi_Threading.E_Methods_in_Multi_Threading.B_Threads_Name;

public class b_run_method_thread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Rohit Sharma");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args){
        // create a thread
        b_run_method_thread obj1 =new b_run_method_thread();
        obj1.start();

        // create another thread
        b_run_method_thread obj2=new b_run_method_thread();
        obj2.start();

        // create one another thread
        b_run_method_thread obj3=new b_run_method_thread();
        obj3.start();

    }
}
