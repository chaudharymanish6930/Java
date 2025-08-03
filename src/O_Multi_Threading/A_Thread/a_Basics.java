package O_Multi_Threading.A_Thread;

public class a_Basics extends Thread {
    public void run(){
        System.out.println("in run methods");
    }
    public static void main(String[] args){
        a_Basics obj =new a_Basics();
        obj.start();
//      obj.start();
//      executed only one
    }
}
