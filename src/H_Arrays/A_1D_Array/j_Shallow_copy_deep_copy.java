package H_Arrays.A_1D_Array;

public class j_Shallow_copy_deep_copy {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        int[] ab = arr;
        ab[1] =100;
        System.out.println(arr[1]);
        System.out.println(ab[3]);
    }
}
