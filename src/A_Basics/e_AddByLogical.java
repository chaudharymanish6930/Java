package A_Basics;

public class e_AddByLogical {
    static int add(int a, int b) {
        while (b != 0) {
            int sum = a ^ b;        // sum without carry
            int carry = (a & b) << 1; // carry
            a = sum;
            b = carry;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Addition of 5 and 7 Number:"+add(5,7));
    }
}
