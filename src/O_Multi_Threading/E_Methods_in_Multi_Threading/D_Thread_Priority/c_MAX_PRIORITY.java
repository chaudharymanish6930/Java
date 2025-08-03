package O_Multi_Threading.E_Methods_in_Multi_Threading.D_Thread_Priority;

public class c_MAX_PRIORITY extends Thread {
    public void run(){
        System.out.println("child threads");
        System.out.println("priority of the run method :"+Thread.currentThread().getPriority());

    }
    public static void main(String[] args){
        System.out.println("parent threads");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("priority of the run method :"+Thread.currentThread().getPriority());
        c_MAX_PRIORITY obj=new c_MAX_PRIORITY();
        obj.start();
    }
}
