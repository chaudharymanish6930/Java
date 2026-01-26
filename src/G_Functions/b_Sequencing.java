package G_Functions;

public class b_Sequencing {
    public static void ajay() {
        System.out.println("hello ajay");
        rohit();
    }
    public static void vishal() {
        System.out.println("hello yaar");
    }
    public static void main(String[] args) {
        ajay();
        System.out.println("hello bhaiya");
    }
    public static void rohit(){
        System.out.println("hello mittar");
        vishal();
    }
}
