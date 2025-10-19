package R_Programs;
import java.util.*;

public class g_ArrangeThreeNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] arr = {A, B, C};
        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}
