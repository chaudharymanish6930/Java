package O_Multi_Threading.E_Methods_in_Multi_Threading.B_Threads_Name;

public class c_alive_method extends Thread {
    public void run(){
        Thread.currentThread().setName("Manish");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Vishal");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String [] args){
        // 1
        c_alive_method obj=new c_alive_method();
        obj.start();

        // 2
        c_alive_method obj2=new c_alive_method();
        obj2.start();

        System.out.println(Thread.currentThread().isAlive());
        System.out.println(obj.isAlive());
        System.out.println(obj2.isAlive());

    }
}
