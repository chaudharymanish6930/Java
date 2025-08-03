package O_Multi_Threading.E_Methods_in_Multi_Threading.D_Thread_Priority;

public class e_complex extends Thread {
    public void run(){
        System.out.println("child threads");
        System.out.println("priority of the run method :"+Thread.currentThread().getPriority());
    }
    public static void main(String[] args){
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println("priority of the run method :"+Thread.currentThread().getPriority());
        e_complex obj =new e_complex();
        obj.start();

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("priority of the run method :"+Thread.currentThread().getPriority());
        e_complex obj1 =new e_complex();
        obj1.start();

        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        System.out.println("priority of the run method :"+Thread.currentThread().getPriority());
        e_complex obj3 =new e_complex();
        obj3.start();
        // 2
        Thread.currentThread().setPriority(4);
        System.out.println("priority of the run method :"+Thread.currentThread().getPriority());
        e_complex obj2 =new e_complex();
        obj2.start();

        Thread.currentThread().setPriority(8);
        System.out.println("priority of the run method :"+Thread.currentThread().getPriority());
        e_complex obj4 =new e_complex();
        obj4.start();
    }
}
