package H_Arrays.B_2D_Array;

public class a_basics {
    public static void main(String[]args){
        int[][] array=new int[3][3];
        array[0][0]=10;
        array[0][1]=20;
        array[0][2]=30;
        array[1][0]=10;
        array[1][1]=20;
        array[1][2]=30;
        array[2][0]=10;
        array[2][1]=20;
        array[2][2]=30;
        System.out.println(array[1][2]);

        int  array1[][]=new int[3][3];
        array1[0][0]=10;
        array1[0][1]=20;
        array1[0][2]=30;
        array1[1][0]=10;
        array1[1][1]=20;
        array1[1][2]=30;
        array1[2][0]=10;
        array1[2][1]=20;
        array1[2][2]=30;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
