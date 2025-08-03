package O_Multi_Threading.E_Methods_in_Multi_Threading.D_Thread_Priority;

public class d_NORN_PRIORITY extends Thread {
    public void run(){
        System.out.println("child threads");
        System.out.println("priority of the run method :"+Thread.currentThread().getPriority());
    }
    public static void main(String[] args){
        System.out.println("parent threads");
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        System.out.println("priority of the run method :"+Thread.currentThread().getPriority());
        d_NORN_PRIORITY obj =new d_NORN_PRIORITY();
        obj.start();
    }
}
