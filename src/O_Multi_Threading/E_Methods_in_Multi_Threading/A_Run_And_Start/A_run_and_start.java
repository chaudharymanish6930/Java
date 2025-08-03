package O_Multi_Threading.E_Methods_in_Multi_Threading.A_Run_And_Start;

public class A_run_and_start extends Thread {
    public void run(){
        System.out.println("hello, I am in run method..");
    }
    public static void main(String[] args){
        A_run_and_start obj=new A_run_and_start();
        obj.start();
    }
}
