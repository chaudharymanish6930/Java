package O_Multi_Threading.E_Methods_in_Multi_Threading.C_Daemon_Thread;

public class a_basics_in_main_method extends Thread{
    public void run(){
        System.out.println("child thread ");
    }
    public static void main(String[] args){
        System.out.println("Main methods");
        a_basics_in_main_method obj =new a_basics_in_main_method();
        obj.setDaemon(true);
        obj.start();
        System.out.println(Thread.currentThread().isDaemon());
    }
}
