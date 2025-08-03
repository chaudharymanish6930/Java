package O_Multi_Threading.C_Thread_and_Tasks;

public class a_single_task_from_single_thread extends Thread {
    public void run(){
        System.out.println("In run methods");
    }
    public static void main(String [] args){
        a_single_task_from_single_thread obj=new a_single_task_from_single_thread();
        obj.start();
    }
}
