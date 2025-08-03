package O_Multi_Threading.E_Methods_in_Multi_Threading.C_Daemon_Thread;

public class b_in_run_method extends Thread {
    public void run(){
        Thread.currentThread().setDaemon(true);
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread");
        }
        else{
            System.out.println("main method");
        }
    }
    public static void main(String[] args){
        System.out.println("main method");
        b_in_run_method obj =new b_in_run_method();
        obj.isDaemon();
        obj.start();
//        obj.isDaemon();
//        IllegalThreadStateException
    }
}
