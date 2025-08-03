package O_Multi_Threading.C_Thread_and_Tasks;

public class b_single_tasks_from_multiple_threads extends Thread{
    public void run(){
        System.out.println("In run methods");
    }
    public static void main(String [] args){
        b_single_tasks_from_multiple_threads obj1=new b_single_tasks_from_multiple_threads();
        obj1.start();
        b_single_tasks_from_multiple_threads obj2=new b_single_tasks_from_multiple_threads();
        obj2.start();
    }
}
