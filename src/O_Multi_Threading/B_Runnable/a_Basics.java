package O_Multi_Threading.B_Runnable;

public class a_Basics implements Runnable{
    public void run(){
        System.out.println("in the run methods");
        System.out.println("in the run methods");
        System.out.println("in the run methods");
    }
    public static void main(String[] args){
        a_Basics obj = new a_Basics();
        Thread th=new Thread(obj);
        th.start();
    }
}
