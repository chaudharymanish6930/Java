package L_Recursion;

public class c_LoopInRecursion {
    public static void main(String[] args) {
        ajay(1);
    }
    public static void ajay(int i){
        if(i==5) return;
        System.out.println("priya"+i);
        amit(5);
        ajay(i+1);
        amit(5);
    }
    public static void amit(int i){
        if(i==0) return;
        System.out.println("Ajay"+i);
        amit(i-1);
    }
}
