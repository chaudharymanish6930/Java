package O_Multi_Threading.E_Methods_in_Multi_Threading.D_Thread_Priority;

public class b_MIN_PRIORITY {
    public void run(){
        System.out.println("child threads");
        System.out.println("priority of the run method :"+Thread.currentThread().getPriority());
    }
    public static void main(String[] args){
        System.out.println("parent threads");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println("priority of the run method :"+Thread.currentThread().getPriority());
        a_main_run_method obj =new a_main_run_method();
        obj.start();
    }
}
