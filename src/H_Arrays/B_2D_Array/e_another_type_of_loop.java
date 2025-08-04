package H_Arrays.B_2D_Array;

public class e_another_type_of_loop {
    public static void main(String[] args){
        int arr[][] = new int[3][4];

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = (int)(Math.random() * 100);
                System.out.println(arr[i][j]);
            }
        }

        for(int n[] : arr){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
