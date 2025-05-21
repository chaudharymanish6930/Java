package M_OOPs_in_Java.G_this_keyword;

public class b_Calling_Another_Method {
    public void methodOne() {
        System.out.println("Method One called");
    }

    public void methodTwo() {
        this.methodOne(); // Call methodOne using 'this'
        System.out.println("Method Two called");
    }

    public static void main(String[] args) {
        b_Calling_Another_Method obj = new b_Calling_Another_Method();
        obj.methodTwo();
    }
}
