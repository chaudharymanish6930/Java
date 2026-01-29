package H_Arrays.A_1D_Array;

public class i_passing_array_in_method {
    public static void main(String[] args) {
        int[] ab = {12,34,56,96,21};
        System.out.println(ab[2]);
        change(ab);
        System.out.println(ab[2]);
    }
    public static void change(int[] arr){
        arr[2]=30;
    }
}
