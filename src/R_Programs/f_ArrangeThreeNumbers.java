package R_Programs;
import java.util.Scanner;
public class f_ArrangeThreeNumbers {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A > B && A > C) {
            if (B > C) {
                System.out.println(C + " " + B + " " + A);
            } else {
                System.out.println(B + " " + C + " " + A);
            }
        }
        else if (B > A && B > C) {
            if (A > C) {
                System.out.println(C + " " + A + " " + B);
            } else {
                System.out.println(A + " " + C + " " + B);
            }
        }
        else { // C is the largest
            if (A > B) {
                System.out.println(B + " " + A + " " + C);
            } else {
                System.out.println(A + " " + B + " " + C);
            }
        }
    }
}
